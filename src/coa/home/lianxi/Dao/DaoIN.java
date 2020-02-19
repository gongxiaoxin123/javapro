package coa.home.lianxi.Dao;

import coa.home.lianxi.pojo.Home;

import java.util.List;

public interface DaoIN {
    List<Home> chakan();
    int add1(Home home);
    int del(int id);
    int upda(Home home);
}
