package com.jacky.online.task;


import com.jacky.online.dao.ShowDataDao;
import com.jacky.online.pojo.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Configurable
@EnableScheduling
public class Qarutz {

    @Autowired
    private ShowDataDao showDataDao;

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }

    @Scheduled(cron = "* * * * * ? ")
    public void print(){
        String currentTime = dateFormat().format(new Date());
        Data data = new Data();
        data.setPayTime(currentTime);
        data.setTotalFee(getTotalFee());
        showDataDao.save(data);
        System.out.println(currentTime +" : 保存到数据库中 : "+data);
    }

    private Long getTotalFee() {
        String total = RandomStringUtils.randomNumeric(6);
        return Long.valueOf(total);

    }

}
