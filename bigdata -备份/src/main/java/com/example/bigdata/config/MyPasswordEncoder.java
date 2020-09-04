package com.example.bigdata.config;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

    final static String SALT="123456";

    @Override
    public String encode(CharSequence charSequence){
        System.out.println(charSequence+SALT);
        return charSequence+SALT;

    }
    public boolean matches(CharSequence charSequence,String s){
        System.out.println("加密的密码"+s);
        System.out.println("未加密的密码"+charSequence);

        return s.equals(charSequence+SALT);
    }

}
