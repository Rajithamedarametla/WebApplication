package com.example.SBWebapplication.myFirstwebapp.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! what are you learning today from the web";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<titled>This is html application </titled>");
        sb.append("</head>");
        sb.append("<body> " );
        sb.append("My First Html program-changed");
        sb.append ("</body>");
        sb.append("</html>");
        return sb.toString();

    }
    @RequestMapping("say-hello-jsp")
//    @ResponseBody
    public String sayHellojsp() {

        return "sayHello";
    }
}
