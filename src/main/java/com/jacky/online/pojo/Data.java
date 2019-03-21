package com.jacky.online.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Entity(name = "tb_data")
public class Data implements Serializable {

    @Id
    private int id;

    @Column(name = "pay_time")
    private String payTime;

    @Column(name = "total_fee")
    private Long totalFee;

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", payTime='" + payTime + '\'' +
                ", totalFee='" + totalFee + '\'' +
                '}';
    }
}
