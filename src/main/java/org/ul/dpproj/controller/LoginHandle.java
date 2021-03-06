package org.ul.dpproj.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
@RestController
@RequestMapping("/login")
public class LoginHandle {
    @RequestMapping("/login")
    public String login(Model model)throws Exception{
        return "login"; }


    @RequestMapping("/loginsubmit")
    public String loginsubmit(HttpSession session, String userid, String pwd)throws
            Exception{

        session.setAttribute("activeUser", userid);
        return "success"; }

    @RequestMapping("/logout")
    public String logout(HttpSession session)throws Exception{

        session.invalidate();
        return "redirect:Login.vue";
    }

}
