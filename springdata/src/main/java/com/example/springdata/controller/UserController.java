package com.example.springdata.controller;

import com.example.springdata.domain.User;
import com.example.springdata.service.UserService;
import com.example.springdata.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 59326
 * @description
 * @date 2020/8/28 16:18
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/testDsl")
    @ResponseBody
    public Result<List<User>> queryTestDsl() {
        return userService.queryTestDsl();
    }
}
