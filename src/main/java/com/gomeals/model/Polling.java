package com.gomeals.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

import java.sql.Date;

@Entity
public class Polling {

    @Id
    private int poll_id;
    private Date poll_date;
    private String vote;
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;
    private TinyIntJdbcType status;

    public Polling() {
    }

    public Polling(int poll_id, Date poll_date, String vote, String item1, String item2, String item3, String item4, String item5, TinyIntJdbcType status) {
        this.poll_id = poll_id;
        this.poll_date = poll_date;
        this.vote = vote;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.status = status;
    }

    public int getPoll_id() {
        return poll_id;
    }

    public void setPoll_id(int poll_id) {
        this.poll_id = poll_id;
    }

    public Date getPoll_date() {
        return poll_date;
    }

    public void setPoll_date(Date poll_date) {
        this.poll_date = poll_date;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    public TinyIntJdbcType getStatus() {
        return status;
    }

    public void setStatus(TinyIntJdbcType status) {
        this.status = status;
    }

}
