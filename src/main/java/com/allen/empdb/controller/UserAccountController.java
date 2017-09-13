package com.allen.empdb.controller;


import com.allen.empdb.Repository.UserAccountRepository;
import com.allen.empdb.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/userAccounts")
public class UserAccountController {

    private final UserAccountRepository userAccountRepository;

    @Autowired
    public UserAccountController(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }


    @RequestMapping(value = "userAccounts", method= RequestMethod.GET)
    public List<UserAccount> list() {
        return  userAccountRepository.findAll();
    }

    @RequestMapping(value = "userAccounts/{id}", method= RequestMethod.GET)
    public UserAccount get(Long id) {
        return  userAccountRepository.findOne(id);
    }



}
