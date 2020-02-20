package coa.home.lianxi.Dao;

import coa.home.lianxi.pojo.Home;
import coa.home.lianxi.until.Jdbcu;

import java.util.List;

public class DaoMethod implements DaoIN {
    @Override
    public List<Home> chakan() {
        return Jdbcu.chaxun( "select id,name,age,birth from home" ,Home.class);
    }

    @Override
    public int add1(Home home) {
        return Jdbcu.Zsg( "insert into home(name,age,birth) values(?,?,?)",home.getName(),home.getAge(),home.getBirth() );
    }

    @Override
    public int del(int id) {
        return Jdbcu.Zsg( "delete from home where id=?", id);
    }

    @Override
    public int upda(Home home) {
        return Jdbcu.Zsg( "update home set name=?,age=?,birth=? where id=?" ,home.getName(),home.getAge(),home.getBirth(),home.getId());
    }
}
