package com.czy.ssm.controller;

import com.czy.ssm.model.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.czy.ssm.service.DemoTestService;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class DemoTestController {
    /* 属性 */
    private DemoTestService demoTestService;
    public DemoTestService getDemoTestService() {
        return demoTestService;
    }
    @Autowired
    public void setDemoTestService(DemoTestService demoTestService) {
        this.demoTestService = demoTestService;
    }

    @RequestMapping("selectAll")
    public String selectAll(HttpServletRequest request){
        List<Persons> personsList = demoTestService.selectAll();
        request.setAttribute("personsList", personsList);
        return "index";
    }

}
