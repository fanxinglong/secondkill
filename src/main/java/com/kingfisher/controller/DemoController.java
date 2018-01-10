package com.kingfisher.controller;/**
 * Created by xinglongfan on 2018/1/3.
 */

import com.kingfisher.domain.User;
import com.kingfisher.result.CodeMsg;
import com.kingfisher.result.Result;
import com.kingfisher.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author
 * @create 2018-01-03 下午5:54
 * 测试类
 **/
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserService userService;

    /**
     * 成功响应结果
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello(){
//        return new Result(0, "success", "hello world");
        //这样写不好  响应结果在这里硬编码
//        return new Result(50010, "success", "hello world");
//        return new Result(50020, "success", "hello world");
//        return new Result(50030, "success", "hello world");
        return Result.success("hello world");

    }

    /**
     * 错误响应结果
     * @return
     */
    @RequestMapping("/hello2")
    @ResponseBody
    public Result<String> error(){
//        return new Result(0, "success", "hello world");
        //这样写不好  响应结果在这里硬编码
//        return new Result(50010, "success", "hello world");
//        return new Result(50020, "success", "hello world");
//        return new Result(50030, "success", "hello world");
        return Result.error(CodeMsg.SERVER_ERROR);
    }

    /**
     * 错误响应结果
     * @return
     */
    @RequestMapping("/hello3")
    public String thymeleaf(Model model){
        model.addAttribute("name", "Mike");
        return "hello";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Result<User> getUser(){
        User user = userService.getUserById(1);
        return Result.success(user);
    }

    @RequestMapping("/iuser")
    @ResponseBody
    public Result<Boolean> insertUser(){
        boolean b = userService.insertUser();
        return Result.success(b);
    }
}
