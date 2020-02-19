package coa.home.lianxi.server;

import coa.home.lianxi.Dao.DaoIN;
import coa.home.lianxi.pojo.Home;

import java.util.List;

public class Servermethod implements ServerIn {
    DaoIN daoIN=null;
    @Override
    public List<Home> chakan() {
        return null;
    }

    @Override
    public int add1(Home home) {
        return 0;
    }

    @Override
    public int del(int id) {
        return 0;
    }

    @Override
    public int upda(Home home) {
        return 0;
    }
}
