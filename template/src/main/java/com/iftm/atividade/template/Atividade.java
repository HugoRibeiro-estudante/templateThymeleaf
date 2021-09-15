package com.iftm.atividade.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Atividade{
    
    @RequestMapping("/pag1")
    public String mvc1(){
        return "pag1";
    }

    @RequestMapping("/pag2")
    public String mvc2(){
        return "pag2";
    }

}