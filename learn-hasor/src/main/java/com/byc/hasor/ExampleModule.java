package com.byc.hasor;

import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by baiyc
 * 2020/7/30/030 20:17
 * Description：
 */
@DimModule
@Component
public class ExampleModule implements SpringModule {
    @Autowired
    DataSource dataSource;

    @Override
    public void loadModule(ApiBinder apiBinder) throws Throwable {
        apiBinder.installModule(new JdbcModule(Level.Full,this.dataSource));
    }
}
