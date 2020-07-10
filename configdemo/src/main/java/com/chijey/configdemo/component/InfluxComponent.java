package com.chijey.configdemo.component;

import org.influxdb.InfluxDB;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InfluxComponent {
    @Autowired
    private InfluxDB influxDB;
    @PostConstruct
    public void test(){
        QueryResult queryResult = influxDB.query(new Query("show databases", "device"));
        System.out.println(queryResult);
    }
}
