package com.test.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import javax.xml.ws.Action;

@Controller
public class HomeController {

    @RequestMapping("/")


    public ModelAndView helloWorld() {

        return new ModelAndView("welcome", "message", "Greetings and Salutations,");
    }


    @RequestMapping("/userform")

    public ModelAndView userform(){
        return new ModelAndView("form", "inst", "Please enter info:" );
    }

    @RequestMapping("/formhandler")

        public ModelAndView formhandler(@RequestParam("firstname")String firstname, @RequestParam("lastname")String lastname,
        @RequestParam("email")String email, @RequestParam("phonenumber")String phonenumber, @RequestParam("password")String password) {

        ModelAndView mv = new ModelAndView("formresponse");

        mv.addObject("firstname", firstname);
        mv.addObject("lastname", lastname);
        mv.addObject("email", email);
        mv.addObject("phonenumber", phonenumber);
        mv.addObject("password", password);
        return mv;
    }

}

