package com.jason.common.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Jason.Chen
 * @create 2024/5/16 11:21
 */
public class DateUtils {

    public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";
    public static final String DATE_FORMAT_YYYYMMDD = "yyyy-MM-dd";

    public static Date getYMDDate(String strDate){
        if (StringUtils.isEmpty(strDate)) {
            return null;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_YYYYMMDD);
        Date date = null;
        try {
            date = simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
