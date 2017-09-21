package com.view;

import oracle.adf.view.rich.component.rich.data.RichTable;


import oracle.adf.view.rich.context.AdfFacesContext;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import oracle.adf.controller.ControllerContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTree;
import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;
import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;
import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.TreeModel;  

public class TablePageBean {
    public TablePageBean() {
    }

    public void onTableSelect(SelectionEvent selectionEvent) {
        RowKeySet oldKeySet = selectionEvent.getRemovedSet();
        
        RichTable table = (RichTable) selectionEvent.getSource();
        
        CollectionModel tableModel = (CollectionModel)table.getValue();
        JUCtrlHierBinding adfTableBinding=(JUCtrlHierBinding)tableModel.getWrappedData();
        
        ControllerContext cctx = ControllerContext.getInstance();
        if(cctx.getCurrentRootViewPort().isDataDirty()){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Please commit info","Changes must be commited before selecting a new table row" );
                FacesContext fctx = FacesContext.getCurrentInstance();
                fctx.addMessage(null, message);
                table.setSelectedRowKeys(oldKeySet);
                AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
                adfFacesContext.addPartialTarget(table);
                fctx.renderResponse();
        }else{
            JUCtrlHierNodeBinding tableRowBinding = (JUCtrlHierNodeBinding) table.getSelectedRowData();
            Row row = tableRowBinding.getRow();
            
            DCIteratorBinding iter = adfTableBinding.getDCIteratorBinding();
            iter.getRowSetIterator().setCurrentRow(row);
            }
        
        
    }
}
