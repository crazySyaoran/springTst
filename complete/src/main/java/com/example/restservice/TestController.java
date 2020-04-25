package com.example.restservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.example.restservice.Product;   // 可以省略？

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model m) {
        String htmlContent = "<p style='color:red'> 红色文字</p>";
        Product currentProduct =new Product(5,"product e", 200);

        m.addAttribute("htmlContent", htmlContent);
        m.addAttribute("currentProduct", currentProduct);

        return "test";
    }
}
