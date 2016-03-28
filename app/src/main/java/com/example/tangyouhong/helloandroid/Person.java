package com.example.tangyouhong.helloandroid;

/**
 * Created by tangyouhong on 3/25/16.
 */
public class Person{

    String biaoti;
    String data;
    int id;
    String time;
    String miaoshu;

    public String getBiaoti() {
        return biaoti;
    }

    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    public Person(String biaoti, String data,int id, String time,String miaoshu) {
        super();
        this.biaoti = biaoti;
        this.data = data;
        this.id = id;
        this.time = time;
        this.miaoshu = miaoshu;

    }

}
