package com.angel.angelsion.controller;

import com.angel.angelsion.model.JsonResult;
import com.angel.angelsion.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: puyijun
 * @create: 2019-04-28 15:29
 **/
@Controller
public class RegisterController {

    @RequestMapping(value = "/home/login.json",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult login(User user){
        System.out.println(user);
        return new JsonResult();
    }
}
