package com.aiidc.env.ergs.common.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * @version 1.0
 */

public class CodeUtil {

  public static String convertUTF8String2Unicode(String instr)
      throws IOException {
    //byte[] strbytes = instr.getBytes();
    int charindex = instr.length();
    int actualValue;
    int inputValue;
    StringBuffer sbtemp = new StringBuffer();

    for (int i = 0; i < charindex;) {

      actualValue = -1;
      inputValue = instr.charAt(i++);

      inputValue &= 0xff;

      if ((inputValue & 0x80) == 0) {
        actualValue = inputValue;
     }
     else if ((inputValue & 0xF8) == 0xF0) {
       actualValue = (inputValue & 0x1f) << 18;

       int nextByte = instr.charAt(i++) & 0xff;
       if ((nextByte & 0xC0) != 0x80)
             throw new IOException("Invalid UTF-8 format");
       actualValue += (nextByte & 0x3F) << 12;

       nextByte = instr.charAt(i++) & 0xff;
         if ((nextByte & 0xC0) != 0x80)
           throw new IOException("Invalid UTF-8 format");
         actualValue += (nextByte & 0x3F) << 6;

         nextByte = instr.charAt(i++) & 0xff;
         if ((nextByte & 0xC0) != 0x80)
         throw new IOException("Invalid UTF-8 format");
         actualValue += (nextByte & 0x3F);
     }
     else if ((inputValue & 0xF0) == 0xE0) {
       actualValue = (inputValue & 0x1f) << 12;

       int nextByte = instr.charAt(i++) & 0xff;
       if ((nextByte & 0xC0) != 0x80)
             throw new IOException("Invalid UTF-8 format");
       actualValue += (nextByte & 0x3F) << 6;

     nextByte = instr.charAt(i++) & 0xff;
     if ((nextByte & 0xC0) != 0x80)
       throw new IOException("Invalid UTF-8 format");
     actualValue += (nextByte & 0x3F);
     }
     else if ((inputValue & 0xE0) == 0xC0) {
     actualValue = (inputValue & 0x1f) << 6;

     int nextByte = instr.charAt(i++) & 0xff;
     if ((nextByte & 0xC0) != 0x80)
     throw new IOException("Invalid UTF-8 format");
     actualValue += (nextByte & 0x3F);
     }
     sbtemp.append((char) actualValue);
     }

     return sbtemp.toString();
     }

  public static byte[] convertUnicode2UTF8Byte(String instr) {
  int len = instr.length();
  byte[] abyte = new byte[len << 2];
  int j = 0;
  for (int i = 0; i < len; i++) {
  char c = instr.charAt(i);

  if (c < 0x80) {
  abyte[j++] = (byte) c;
  }
  else if (c < 0x0800) {
  abyte[j++] = (byte) (((c >> 6) & 0x1F) | 0xC0);
  abyte[j++] = (byte) ((c & 0x3F) | 0x80);
  }
  else if (c < 0x010000) {
  abyte[j++] = (byte) (((c >> 12) & 0x0F) | 0xE0);
  abyte[j++] = (byte) (((c >> 6) & 0x3F) | 0x80);
  abyte[j++] = (byte) ((c & 0x3F) | 0x80);
  }
  else if (c < 0x200000) {
  abyte[j++] = (byte) (((c >> 18) & 0x07) | 0xF8);
  abyte[j++] = (byte) (((c >> 12) & 0x3F) | 0x80);
  abyte[j++] = (byte) (((c >> 6) & 0x3F) | 0x80);
  abyte[j++] = (byte) ((c & 0x3F) | 0x80);
  }
  }

  byte[] retbyte = new byte[j];
  for (int i = 0; i < j; i++) {
  retbyte[i] = abyte[i];
  }
  return retbyte;
  }




  public static String GBToUnicode(String s)
  {
      String s1 = null;
      if(s == null || s.equals(""))
        return s;
      try
      {  
        s1 = new String(s.getBytes("ISO8859_1"), "GBK");
      }
      catch(UnsupportedEncodingException unsupportedencodingexception)
      {
        System.err.println("Table:GBToUnicode:" + unsupportedencodingexception);
          unsupportedencodingexception.printStackTrace(System.err);
      }
    
      return s1;
  }

  public  static String unicodeToGB(String s)
  {
    if(s == null || s.equals(""))
      return s;
    String s1 = null;
    try
    {
      s1 = new String(s.getBytes("GBK"), "ISO8859_1");
    }
    catch(UnsupportedEncodingException _ex) { }
    return s1;
  }

  String native2Unicode(String s)
  {
    if (s == null || s.length() == 0)
      {
      return "";
    }
    char c;
      int j = 0;
      byte[] buffer = new byte[s.length() * 2], buf;
      for (int i = 0; i < s.length(); i++)
      {
        c = s.charAt(i);
        if (c >= 0x100)
        {
          buf = (""+c).getBytes();
          buffer[j++] = buf[0];
          buffer[j++] = buf[1];
        }
        else
        {
          buffer[j++] = (byte)c;
        }
      }

      return new String(buffer, 0, j);
  }

  public static String encode(String s){
    if (s==null||(s.equals("")))
      return s;
    else
       return URLEncoder.encode(GBToUnicode(s));
  }

  public static String decode(String s){
    if (s==null||(s.equals("")))
      return s;
    else
       return java.net.URLDecoder.decode(CodeUtil.unicodeToGB(s));
  }
  public static void main(String[] args) { 
}
}
