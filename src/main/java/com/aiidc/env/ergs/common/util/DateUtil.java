package com.aiidc.env.ergs.common.util;

import java.util.*;
import java.text.*;
/**
 * <p>Title: Dr</p>
 * <p>Description: 关于日期的一些助益方法</p>
 * <p>Company: </p>
 * @version 1.0
 */

public class DateUtil {

  public DateUtil() {
  }

  public static Date strToDate(String strDate){
    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    Date date=null;
    try{
      date=df.parse(strDate);
    }catch(ParseException e){
      e.printStackTrace();
    }
    return date;
  }

  public static Date strToDate(String strDate,String format){
    SimpleDateFormat df=new SimpleDateFormat(format);
    Date date=null;
    try{
      date=df.parse(strDate);
    }catch(ParseException e){
      e.printStackTrace();
    }
    return date;
  }

  public static String dateToStr(Date date){
    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
    return df.format(date);
  }

  public static java.sql.Date strToSqlDate(String strDate,String format){
    return new java.sql.Date(DateUtil.dateToLong(strToDate(strDate,format)));
  }

  public static String dateToStr(Date date,String format){
    SimpleDateFormat df=new SimpleDateFormat(format);
    return df.format(date);
  }

  public static long dateToLong(Date date){
    return date.getTime();
  }

  public static Date longToDate(long l){
    return new Date(l);
  }

  public static Date DateAdd(int year,int month,int day,int hour){
    return null;
  }

  public static String  beforeDate(String dateStr,int offset, String pattern){
    try{
      StringTokenizer st = new StringTokenizer(dateStr,"-");
      String year = st.nextToken();
      String month= st.nextToken();
      String day= st.nextToken();
      Calendar cal = Calendar.getInstance();
      cal.set(Calendar.YEAR, Integer.parseInt(year));
      cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
      cal.set(Calendar.DATE, Integer.parseInt(day)-offset);
      Date date = cal.getTime();
      if(pattern.equals(""))
        pattern="yyyy-MM-dd";
      SimpleDateFormat sdf = new SimpleDateFormat(pattern);
      return sdf.format(date);
    }catch (Exception e){
      return "";
    }
  }

  public static int getYear(Date date){
    Calendar cal = Calendar.getInstance();
    return cal.get(Calendar.YEAR);
  }
  public static int getMonth(Date date){
    Calendar cal = Calendar.getInstance();
    return cal.get(Calendar.MONTH);
  }
  public static int getDayOfMonth(Date date){
    Calendar cal = Calendar.getInstance();
    return cal.get(Calendar.DAY_OF_MONTH);
  }


  public static void main(String[] args) {
    System.err.println(DateUtil.strToDate("2008-01-06")); 
  }
}