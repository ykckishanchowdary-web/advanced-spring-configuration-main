package com.pluralsight.beanconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeDemoController {

    private final RequestScopedBean requestScopedBean;

    private final SessionScopedBean sessionScopedBean;

    public ScopeDemoController(RequestScopedBean requestScopedBean, SessionScopedBean sessionScopedBean){
        this.requestScopedBean = requestScopedBean;
        this.sessionScopedBean = sessionScopedBean;
    }

    @GetMapping("/scopes")
    public String demoScopes(){
       return   "Request UUID: "+requestScopedBean.getUuid() +
               " | Session Visits: " + sessionScopedBean.incrementVisit();
    }
}
