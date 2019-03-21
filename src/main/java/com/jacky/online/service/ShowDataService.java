package com.jacky.online.service;

import com.jacky.online.controller.ShowData;
import com.jacky.online.dao.ShowDataDao;
import com.jacky.online.pojo.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowDataService {
    @Autowired
    private ShowDataDao showDataDao;

    public Data query(String currentTime) {
        return showDataDao.findByPayTime(currentTime);
    }
}
