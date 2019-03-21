package com.jacky.online.dao;

import com.jacky.online.pojo.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowDataDao extends JpaRepository<Data,Object> {

    public Data findByPayTime(String payTime);

}
