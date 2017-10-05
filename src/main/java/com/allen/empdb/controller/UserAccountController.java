package com.allen.empdb.controller;


import com.allen.empdb.Repository.UserAccountRepository;
import com.allen.empdb.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
public class UserAccountController {


    @RequestMapping(value = "/login")
    @ResponseBody
    public String login() {
        return "All good.  You do not need to be authenticated to call /login";
    }
//
//    @RequestMapping(value = "/**")
//    @ResponseBody
//    public String anyRequest() {
//        return "All good. You can see this because you are Authenticated.";
//    }

//    private final UserAccountRepository userAccountRepository;

//    @Autowired
//    public UserAccountController(UserAccountRepository userAccountRepository) {
//        this.userAccountRepository = userAccountRepository;
//    }

//    @RequestMapping(value = "userAccounts/login", method = RequestMethod.GET)
//    @ResponseBody
//    public String login() {
//        return "All good.  You DO NOT need to be authenticated to call /login";
//    }
//
//
//    @RequestMapping(value = "userAccounts", method= RequestMethod.GET)
//    public List<UserAccount> list() {
//        return  userAccountRepository.findAll();
//    }
//
//    @RequestMapping(value = "userAccounts/{id}", method= RequestMethod.GET)
//    public UserAccount get(Long id) {
//        return  userAccountRepository.findOne(id);
//    }
//
}
