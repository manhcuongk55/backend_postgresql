package vn.vttek.elecs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.vttek.elecs.entities.Account;

@Controller
public class RootController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("users", new Account(""));
//        model.addAttribute("message",false);
        return "register";
    }
  
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
   
    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
    
}
