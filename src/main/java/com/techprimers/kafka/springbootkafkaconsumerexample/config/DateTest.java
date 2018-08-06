package com.techprimers.kafka.springbootkafkaconsumerexample.config;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Calendar here = Calendar.getInstance();

        System.out.println(here);

        int gmtoffset = here.get(Calendar.ZONE_OFFSET);
        System.out.println("::" + gmtoffset);

        TimeZone zone = TimeZone.getDefault();

        System.out.println(zone);

        System.out.println(new Date(System.currentTimeMillis() - gmtoffset + zone.getRawOffset()).toString());

    }

}
