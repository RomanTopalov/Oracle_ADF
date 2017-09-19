package com.model;
import oracle.jbo.ApplicationModule;
import oracle.jbo.ViewObject;
import oracle.jbo.client.Configuration;

public class MainClass {
    public MainClass() {
        super();
    }


    
    public static void main(String[] args) {
           MainClass mainClass = new MainClass();
           String amDef="text.TestModule";
           String config ="TestModuleLocal";
           ApplicationModule am= Configuration.createRootApplicationModule(amDef,config);
           ViewObject vo= am.findViewObject("TestView");
           vo.executeQuery();
           
           Configuration.releaseRootApplicationModule(am,true);
       }
}
