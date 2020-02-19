package coa.home.lianxi.server;

import coa.home.lianxi.pojo.Home;

import java.util.List;

public interface ServerIn {
    List<Home> chakan();
    int add1(Home home);
    int del(int id);
    int upda(Home home);
}
