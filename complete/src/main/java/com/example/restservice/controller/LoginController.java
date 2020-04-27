package com.example.restservice.controller;

import com.example.restservice.mapper.PasswdMapper;
import com.example.restservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired PasswdMapper passwdMapper;

    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){

        String password_T = passwdMapper.getPasswd(Integer.parseInt(username));
        System.out.println(password_T);

        if(!StringUtils.isEmpty(username) && password_T.equals(password)){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser",username);
            return "redirect:/index";
        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return  "login";
        }

    }

    @GetMapping("/")
    public String entry(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }


}
