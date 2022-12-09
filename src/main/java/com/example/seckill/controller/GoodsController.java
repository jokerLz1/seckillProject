package com.example.seckill.controller;

import com.example.seckill.pojo.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 *
 * 商品界面
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/toList")
    public String toList(HttpSession session, Model model, @CookieValue("userTicket")String ticket){
        if(StringUtils.isEmpty(ticket)){
            return "login";
        }
        User user =(User)session.getAttribute(ticket);
        if(null==user){
            return  "login";
        }
        model.addAttribute("user",user);

        return "goodsList";

    }
}
