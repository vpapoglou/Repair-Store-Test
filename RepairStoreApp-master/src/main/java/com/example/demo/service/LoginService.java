package com.example.demo.service;

import com.example.demo.domain.Owner;

import javax.naming.AuthenticationException;

public interface LoginService {

    Owner login(String email, String password) throws AuthenticationException;

    void logout(String email) throws Exception;

}
