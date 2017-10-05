package com.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class ButtonActionBean {
    public ButtonActionBean() {
    }

    public String goToEssentialProject() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("essential");
        return "goToRouter";
    }

    public String goToBindingInternalsProject() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("binding-internals");
        return "goToRouter";
    }

    public String goTo_IndexPage() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("index");
        return "goToFirstPage";
    }

    public String goTo_BusinessComponents() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("business-component");
        return "goToRouter";
    }

    public String goTo_TaskFlow() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("task-flow");
        return "goToRouter";
    }

    public String goTo_JavaScriptProject() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("java_script");
        return "goToRouter";
    }

    public String goTo_Dashboard() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("dashboard");
        return "goToRouter";
    }

    public String goTo_RenderImage() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("render-image");
        return "goToRouter";
    }
    
    public String goTo_SearchPage() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("search-page");
        return "goToRouter";
    }

    public String goTo_RowSelection() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("row-selection");
        return "goToRouter";
    }

    public String goTo_GeneralSearchSystem() {
        MainProcessBean mainProcessBean = new MainProcessBean();
        mainProcessBean.putValue("general-search-system");
        return "goToRouter";
    }

////    public void buttonAction_js_v(ActionEvent actionEvent) {
//        FacesMessage msg = new FacesMessage("Button Action called");
//        FacesContext context = FacesContext.getCurrentInstance();
//        context.addMessage(null, msg);
//    }


    public void buttonAction_js_v(ActionEvent actionEvent) {
        FacesMessage msg = new FacesMessage("Button Action called");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, msg);
//        return "" ;
    }
}
