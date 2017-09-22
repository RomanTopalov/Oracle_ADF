package com.view;

import javax.faces.context.FacesContext;

import oracle.jbo.server.ViewRowImpl;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;



public class ValueHandlerBean {
    
    private boolean enableEditing = false;
    private ViewRowImpl selectedEmployee;
    
    private boolean editAction = false;
    private boolean createAction = false;
    private boolean deleteAction = false;
    
    public ValueHandlerBean() {
    }


    public void setEnableEditing(boolean enableEditing) {
        this.enableEditing = enableEditing;
    }

    public boolean isEnableEditing() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExpressionFactory ef = ctx.getApplication().getExpressionFactory();
        ValueExpression ve=ef.createValueExpression(ctx.getELContext(),"#{row.EmployeesId}",String.class);
        
        String employeesId = (String) ve.getValue(ctx.getELContext());
        if(this.getSelectedEmployee()!=null){
            this.enableEditing = getSelectedEmployee().getAttribute("EmployeeId").equals(employeesId);
                }
        
        return enableEditing;
    }

    public void setSelectedEmployee(ViewRowImpl newSelectedEmployee) {
    this.selectedEmployee=newSelectedEmployee;
    if(this.selectedEmployee!=null){
        this.editAction=true;
    }else{
        this.editAction = false;
        this.createAction = false;
        this.deleteAction = false;
        }
    }

    public ViewRowImpl getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setEditAction(boolean editAction) {
        this.editAction = editAction;
    }

    public boolean isEditAction() {
        return editAction;
    }

    public void setCreateAction(boolean createAction) {
        this.createAction = createAction;
    }

    public boolean isCreateAction() {
        return createAction;
    }

    public void setDeleteAction(boolean deleteAction) {
        this.deleteAction = deleteAction;
    }

    public boolean isDeleteAction() {
        return deleteAction;
    }
}
