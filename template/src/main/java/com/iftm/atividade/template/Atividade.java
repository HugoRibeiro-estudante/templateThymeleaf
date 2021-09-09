package com.iftm.atividade.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Atividade{
    
    @RequestMapping("/requisicao")
    public String mvc(){
        return "at1";
    }

}