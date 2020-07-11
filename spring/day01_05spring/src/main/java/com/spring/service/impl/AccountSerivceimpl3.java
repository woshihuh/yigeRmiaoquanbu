package com.spring.service.impl;

import com.spring.service.IAccountService;

import java.util.*;

public class AccountSerivceimpl3 implements IAccountService {
    private String[] myStrs;
    private List<String> mylist;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;

    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(mylist);
        System.out.println(myMap);
        System.out.println(myProps);
        System.out.println(mySet);
    }
}
