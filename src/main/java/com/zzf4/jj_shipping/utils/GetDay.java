package com.zzf4.jj_shipping.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDay {
    //根据相差日期算出天数
    public static long  getDay(Date begin,Date end){


        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");

        Date d1=begin;

        Date d2=end;

        long daysBetween=(d2.getTime()-d1.getTime()+1000000)/(60*60*24*1000);
        return daysBetween;
    }
}
