package coa.home.lianxi.server;

import coa.home.lianxi.Dao.DaoIN;
import coa.home.lianxi.Dao.DaoMethod;
import coa.home.lianxi.pojo.Home;

import java.util.List;

public class Servermethod implements ServerIn {
    DaoIN daoIN=new DaoMethod();
    @Override
    public List<Home> chakan() {
        return daoIN.chakan();
    }

    @Override
    public int add1(Home home) {
        return daoIN.add1( home );
    }

    @Override
    public int del(int id) {
        return daoIN.del( id );
    }

    @Override
    public int upda(Home home) {
        return daoIN.upda( home );
    }
}
