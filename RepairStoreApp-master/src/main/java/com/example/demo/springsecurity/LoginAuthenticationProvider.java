///*
//package com.example.demo.springsecurity;
//
//import com.example.demo.domain.Owner;
//import com.example.demo.service.LoginService;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class LoginAuthenticationProvider implements AuthenticationProvider{
//
//    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(LoginAuthenticationProvider.class);
//
//    @Autowired
//    private LoginService loginService;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String email = authentication.getName();
//        String password = (String) authentication.getCredentials();
//        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
//
//        try {
//            Owner owner = loginService.login(email,password);
//
//            if(owner.getUserType() == "Admin") {
//                grantedAuthorityList.add(new SimpleGrantedAuthority("ADMIN"));
//            }else{
//                grantedAuthorityList.add(new SimpleGrantedAuthority("USER"));
//            }
//        } catch (javax.naming.AuthenticationException e) {
//            e.printStackTrace();
//        }
//
//
//        return new UsernamePasswordAuthenticationToken(email, password, grantedAuthorityList);
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}
//*/
