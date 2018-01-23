package com.example.user.baby1;

/**
 * Created by user on 2018/1/23.
 */

public class Feed_Data {
    int feednum;
    String recordtime;
    int mothermilk;
    int formula;
    int weaning;
    public  Feed_Data(int feednum, String recordtime, int mothermilk, int formula, int weaning)
    {
        this.feednum = feednum;
        this.recordtime = recordtime;
        this.mothermilk = mothermilk;
        this.formula = formula;
        this.weaning = weaning;

    }

}
