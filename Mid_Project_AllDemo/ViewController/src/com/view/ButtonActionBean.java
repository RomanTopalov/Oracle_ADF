package com.view;

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
}
