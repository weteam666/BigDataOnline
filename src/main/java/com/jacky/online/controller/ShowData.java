package com.jacky.online.controller;

import com.jacky.online.pojo.Data;
import com.jacky.online.pojo.Result;
import com.jacky.online.service.ShowDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/show")
public class ShowData {

    @Autowired
    private ShowDataService showDataService;

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }

    @RequestMapping("/getData")
    public Result showData(String currentTime){
        Data data = showDataService.query(dateFormat().format(new Date(Long.valueOf(currentTime))));
        return new Result(true,"查询成功",data);
    }
}
