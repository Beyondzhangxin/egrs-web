package com.aiidc.env.ergs.common.util;

import java.security.*;
import java.text.*;
import java.util.*;

/**
 * <p>
 * Title:
 */

public class StringUtil {

	private static final char[] QUOTE_ENCODE = "&quot;".toCharArray();
	private static final char[] AMP_ENCODE = "&amp;".toCharArray();
	private static final char[] LT_ENCODE = "&lt;".toCharArray();
	private static final char[] GT_ENCODE = "&gt;".toCharArray();

	/**
	 * 替换字符串中指定字符串
	 * 
	 * @param line
	 *            原来字符串
	 * @param oldString
	 *            被替换字符串
	 * @param newString
	 *            新字符串
	 * @return 返回替换后的字符串
	 */
	public static final String replace(String line, String oldString,
			String newString) {
		if (line == null) {
			return null;
		}
		int i = 0;
		if ((i = line.indexOf(oldString, i)) >= 0) {
			char[] line2 = line.toCharArray();
			char[] newString2 = newString.toCharArray();
			int oLength = oldString.length();
			StringBuffer buf = new StringBuffer(line2.length);
			buf.append(line2, 0, i).append(newString2);
			i += oLength;
			int j = i;
			while ((i = line.indexOf(oldString, i)) > 0) {
				buf.append(line2, j, i - j).append(newString2);
				i += oLength;
				j = i;
			}
			buf.append(line2, j, line2.length - j);
			return buf.toString();
		}
		return line;
	}

	/**
	* @param line
	 *            原来字符串
	 * @param oldString
	 *            被替换字符串
	 * @param newString
	 *            新字符串
	 * @return 返回替换后的字符串
	 */
	public static final String replaceIgnoreCase(String line, String oldString,
			String newString) {
		if (line == null) {
			return null;
		}
		String lcLine = line.toLowerCase();
		String lcOldString = oldString.toLowerCase();
		int i = 0;
		if ((i = lcLine.indexOf(lcOldString, i)) >= 0) {
			char[] line2 = line.toCharArray();
			char[] newString2 = newString.toCharArray();
			int oLength = oldString.length();
			StringBuffer buf = new StringBuffer(line2.length);
			buf.append(line2, 0, i).append(newString2);
			i += oLength;
			int j = i;
			while ((i = lcLine.indexOf(lcOldString, i)) > 0) {
				buf.append(line2, j, i - j).append(newString2);
				i += oLength;
				j = i;
			}
			buf.append(line2, j, line2.length - j);
			return buf.toString();
		}
		return line;
	}

	/**
	 * This method takes a string which may contain HTML tags (ie, &lt;b&gt;,
	 * &lt;table&gt;, etc) and converts the '&lt'' and '&gt;' characters to
	 * their HTML escape sequences.
	 * 
	 * @param in
	 *            the text to be converted.
	 * @return the input string with the characters '&lt;' and '&gt;' replaced
	 *         with their HTML escape sequences.
	 */
	public static final String escapeHTMLTags(String in) {
		if (in == null) {
			return null;
		}
		char ch;
		int i = 0;
		int last = 0;
		char[] input = in.toCharArray();
		int len = input.length;
		StringBuffer out = new StringBuffer((int) (len * 1.3));
		for (; i < len; i++) {
			ch = input[i];
			if (ch > '>') {
				continue;
			} else if (ch == '<') {
				if (i > last) {
					out.append(input, last, i - last);
				}
				last = i + 1;
				out.append(LT_ENCODE);
			} else if (ch == '>') {
				if (i > last) {
					out.append(input, last, i - last);
				}
				last = i + 1;
				out.append(GT_ENCODE);
			}
		}
		if (last == 0) {
			return in;
		}
		if (i > last) {
			out.append(input, last, i - last);
		}
		return out.toString();
	}

	/**
	 * Used by the hash method.
	 */
	private static MessageDigest digest = null;

	/**
	 * Hashes a String using the Md5 algorithm and returns the result as a
	 * String of hexadecimal numbers. This method is synchronized to avoid
	 * excessive MessageDigest object creation. If calling this method becomes a
	 * bottleneck in your code, you may wish to maintain a pool of MessageDigest
	 * objects instead of using this method.
	 * <p>
	 * A hash is a one-way function -- that is, given an input, an output is
	 * easily computed. However, given the output, the input is almost
	 * impossible to compute. This is useful for passwords since we can store
	 * the hash and a hacker will then have a very hard time determining the
	 * original password.
	 * <p>
	 * In Jive, every time a user logs in, we simply take their plain text
	 * password, compute the hash, and compare the generated hash to the stored
	 * hash. Since it is almost impossible that two passwords will generate the
	 * same hash, we know if the user gave us the correct password or not. The
	 * only negative to this system is that password recovery is basically
	 * impossible. Therefore, a reset password method is used instead.
	 * 
	 * @param data
	 *            the String to compute the hash of.
	 * @return a hashed version of the passed-in String
	 */
	public synchronized static final String hash(String data) {
		if (digest == null) {
			try {
				digest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException nsae) {
				System.err.println("Failed to load the MD5 MessageDigest. "
						+ "Jive will be unable to function normally.");
				nsae.printStackTrace();
			}
		}
		// Now, compute hash.
		digest.update(data.getBytes());
		return encodeHex(digest.digest());
	}

	/**
	 * Turns an array of bytes into a String representing each byte as an
	 * unsigned hex number.
	 * <p>
	 * Method by Santeri Paavolainen, Helsinki Finland 1996<br>
	 * (c) Santeri Paavolainen, Helsinki Finland 1996<br>
	 * Distributed under LGPL.
	 * 
	 * @param bytes
	 *            an array of bytes to convert to a hex-string
	 * @return generated hex string
	 */
	public static final String encodeHex(byte[] bytes) {
		StringBuffer buf = new StringBuffer(bytes.length * 2);
		int i;

		for (i = 0; i < bytes.length; i++) {
			if (((int) bytes[i] & 0xff) < 0x10) {
				buf.append("0");
			}
			buf.append(Long.toString((int) bytes[i] & 0xff, 16));
		}
		return buf.toString();
	}

	/**
	 * Converts a line of text into an array of lower case words using a
	 * BreakIterator.wordInstance().
	 * <p>
	 * 
	 * This method is under the Jive Open Source Software License and was
	 * written by Mark Imbriaco.
	 * 
	 * @param text
	 *            a String of text to convert into an array of words
	 * @return text broken up into an array of words.
	 */
	public static final String[] toLowerCaseWordArray(String text) {
		if (text == null || text.length() == 0) {
			return new String[0];
		}
		ArrayList wordList = new ArrayList();
		BreakIterator boundary = BreakIterator.getWordInstance();
		boundary.setText(text);
		int start = 0;

		for (int end = boundary.next(); end != BreakIterator.DONE; start = end, end = boundary
				.next()) {
			String tmp = text.substring(start, end).trim();
			// Remove characters that are not needed.
			tmp = replace(tmp, "+", "");
			tmp = replace(tmp, "/", "");
			tmp = replace(tmp, "\\", "");
			tmp = replace(tmp, "#", "");
			tmp = replace(tmp, "*", "");
			tmp = replace(tmp, ")", "");
			tmp = replace(tmp, "(", "");
			tmp = replace(tmp, "&", "");
			if (tmp.length() > 0) {
				wordList.add(tmp);
			}
		}
		return (String[]) wordList.toArray(new String[wordList.size()]);
	}

	/**
	 * Pseudo-random number generator object for use with randomString(). The
	 * Random class is not considered to be cryptographically secure, so only
	 * use these random Strings for low to medium security applications.
	 */
	private static Random randGen = new Random();

	/**
	 * Array of numbers and letters of mixed case. Numbers appear in the list
	 * twice so that there is a more equal chance that a number will be picked.
	 * We can use the array to get a random number or letter by picking a random
	 * array index.
	 */
	private static char[] numbersAndLetters = ("0123456789abcdefghijklmnopqrstuvwxyz"
			+ "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

	/**
	 * Returns a random String of numbers and letters (lower and upper case) of
	 * the specified length. The method uses the Random class that is built-in
	 * to Java which is suitable for low to medium grade security uses. This
	 * means that the output is only pseudo random, i.e., each number is
	 * mathematically generated so is not truly random.
	 * <p>
	 * 
	 * The specified length must be at least one. If not, the method will return
	 * null.
	 * 
	 * @param length
	 *            the desired length of the random String to return.
	 * @return a random String of numbers and letters of the specified length.
	 */
	public static final String randomString(int length) {
		if (length < 1) {
			return null;
		}
		// Create a char buffer to put random letters and numbers in.
		char[] randBuffer = new char[length];
		for (int i = 0; i < randBuffer.length; i++) {
			randBuffer[i] = numbersAndLetters[randGen.nextInt(71)];
		}
		return new String(randBuffer);
	}

	/** ����m-n֮�������� **/
	public static final int randomInt(int m, int n) {
		return (int) (Math.random() * (m - n)) + n;
	}

	/**
	 * Intelligently chops a String at a word boundary (whitespace) that occurs
	 * at the specified index in the argument or before. However, if there is a
	 * newline character before <code>length</code>, the String will be chopped
	 * there. If no newline or whitespace is found in <code>string</code> up to
	 * the index <code>length</code>, the String will chopped at
	 * <code>length</code>.
	 * <p>
	 * For example, chopAtWord("This is a nice String", 10) will return
	 * "This is a" which is the first word boundary less than or equal to 10
	 * characters into the original String.
	 * 
	 * @param string
	 *            the String to chop.
	 * @param length
	 *            the index in <code>string</code> to start looking for a
	 *            whitespace boundary at.
	 * @return a substring of <code>string</code> whose length is less than or
	 *         equal to <code>length</code>, and that is chopped at whitespace.
	 */
	public static final String chopAtWord(String string, int length) {
		if (string == null) {
			return string;
		}

		char[] charArray = string.toCharArray();
		int sLength = string.length();
		if (length < sLength) {
			sLength = length;
		}

		// First check if there is a newline character before length; if so,
		// chop word there.
		for (int i = 0; i < sLength - 1; i++) {
			// Windows
			if (charArray[i] == '\r' && charArray[i + 1] == '\n') {
				return string.substring(0, i + 1);
			}
			// Unix
			else if (charArray[i] == '\n') {
				return string.substring(0, i);
			}
		}
		// Also check boundary case of Unix newline
		if (charArray[sLength - 1] == '\n') {
			return string.substring(0, sLength - 1);
		}

		// Done checking for newline, now see if the total string is less than
		// the specified chop point.
		if (string.length() < length) {
			return string;
		}

		// No newline, so chop at the first whitespace.
		for (int i = length - 1; i > 0; i--) {
			if (charArray[i] == ' ') {
				return string.substring(0, i).trim();
			}
		}

		// Did not find word boundary so return original String chopped at
		// specified length.
		return string.substring(0, length);
	}

	/**
	 * Escapes all necessary characters in the String so that it can be used in
	 * an XML doc.
	 * 
	 * @param string
	 *            the string to escape.
	 * @return the string with appropriate characters escaped.
	 */
	public static final String escapeForXML(String string) {
		if (string == null) {
			return null;
		}
		char ch;
		int i = 0;
		int last = 0;
		char[] input = string.toCharArray();
		int len = input.length;
		StringBuffer out = new StringBuffer((int) (len * 1.3));
		for (; i < len; i++) {
			ch = input[i];
			if (ch > '>') {
				continue;
			} else if (ch == '<') {
				if (i > last) {
					out.append(input, last, i - last);
				}
				last = i + 1;
				out.append(LT_ENCODE);
			} else if (ch == '&') {
				if (i > last) {
					out.append(input, last, i - last);
				}
				last = i + 1;
				out.append(AMP_ENCODE);
			} else if (ch == '"') {
				if (i > last) {
					out.append(input, last, i - last);
				}
				last = i + 1;
				out.append(QUOTE_ENCODE);
			}
		}
		if (last == 0) {
			return string;
		}
		if (i > last) {
			out.append(input, last, i - last);
		}
		return out.toString();
	}

	/**
	 * Unescapes the String by converting XML escape sequences back into normal
	 * characters.
	 * 
	 * @param string
	 *            the string to unescape.
	 * @return the string with appropriate characters unescaped.
	 */
	public static final String unescapeFromXML(String string) {
		string = replace(string, "&lt;", "<");
		string = replace(string, "&gt;", ">");
		string = replace(string, "&quot;", "\"");
		return replace(string, "&amp;", "&");
	}

	private static final char[] zeroArray = "0000000000000000".toCharArray();

	/**
	 * Pads the supplied String with 0's to the specified length and returns the
	 * result as a new String. For example, if the initial String is "9999" and
	 * the desired length is 8, the result would be "00009999". This type of
	 * padding is useful for creating numerical values that need to be stored
	 * and sorted as character data. Note: the current implementation of this
	 * method allows for a maximum <tt>length</tt> of 16.
	 * 
	 * @param string
	 *            the original String to pad.
	 * @param length
	 *            the desired length of the new padded String.
	 * @return a new String padded with the required number of 0's.
	 */
	public static final String zeroPadString(String string, int length) {
		if (string == null || string.length() > length) {
			return string;
		}
		StringBuffer buf = new StringBuffer(length);
		buf.append(zeroArray, 0, length - string.length()).append(string);
		return buf.toString();
	}

	/**
	 * Formats a Date as a fifteen character long String made up of the Date's
	 * padded millisecond value.
	 * 
	 * @return a Date encoded as a String.
	 */
	public static final String dateToMillis(Date date) {
		return zeroPadString(Long.toString(date.getTime()), 15);
	}

	/**
	 * �ж��Ƿ�����
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isNumeric(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} catch (NumberFormatException sqo) {
			return false;
		}
	}

	public static String arrayToString(String[] s) {
		StringBuffer sb = new StringBuffer();
		if (s == null || s.length == 0) {
			return "";
		}
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]);
		}
		return sb.toString();
	}

	// �ж��Ƿ�Ϊ����
	public static int toInt(String number) {
		try {
			return (int) Integer.parseInt(number);
		} catch (NumberFormatException sqo) {
			return 0;
		}
	}

	// ����ת��Ϊ�ַ�
	public static String intToStr(int number) {
		return (String) String.valueOf(number);
	}

	public static String intToStrAll(int i) {
		if (i >= 65) {
			return String.valueOf(Chr(i));
		} else {
			return i + "";
		}
	}

	// �ַ�ת��Ϊ����
	public static int strToInt(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}
		if (s.equals("A")) {
			return 'A';
		}
		if (s.equals("B")) {
			return 'B';
		}
		if (s.equals("E")) {
			return 'E';
		}
		if (s.equals("C")) {
			return 'C';
		}
		if (s.equals("D")) {
			return 'D';
		}
		if (s.equals("F")) {
			return 'F';
		}
		if (s.equals("G")) {
			return 'G';
		}
		if (s.equals("H")) {
			return 'H';
		}
		if (s.equals("I")) {
			return 'I';
		}
		if (s.equals("J")) {
			return 'J';
		}
		if (s.equals("K")) {
			return 'K';
		}
		if (s.equals("L")) {
			return 'L';
		}
		if (s.equals("M")) {
			return 'M';
		}
		if (s.equals("N")) {
			return 'N';
		}
		if (s.equals("P")) {
			return 'P';
		}
		if (s.equals("Q")) {
			return 'Q';
		}
		if (s.equals("R")) {
			return 'R';
		}
		if (s.equals("S")) {
			return 'S';
		}
		if (s.equals("T")) {
			return 'T';
		}
		if (s.equals("U")) {
			return 'U';
		}
		if (s.equals("V")) {
			return 'V';
		}
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	// �ַ�ת��Ϊ����
	public static int objToInt(Object o) {
		if (o == null) {
			return 0;
		}
		String s = o.toString();
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	// �ַ�ת��Ϊlong
	public static long strToLong(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}
		try {
			return Long.getLong(s).longValue();
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	// �ָ����ĺ�Ӣ��
	public static String[] splitC(String s) {
		StringBuffer sbc = new StringBuffer();
		StringBuffer sbe = new StringBuffer();
		String[] x = { "--", "--" };
		char ch = ' ';
		boolean flag = true;

		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			// �Ƿ�������

			if (Asc(ch) == 22411) {
				flag = false;
			}
			if (Asc(ch) < 100 && flag) {
				sbe.append(ch);
			} else {
				sbc.append(ch);
			}

		}

		if (sbe.toString() != null && (!sbe.toString().equals(""))) {
			x[0] = sbe.toString();

		}
		if (sbc.toString() != null && (!sbc.toString().equals(""))) {
			if (sbc.toString().indexOf("��") != -1
					&& sbc.toString().substring(0, 1).equals("��")) {
				x[1] = sbc.toString().substring(1);
			} else {
				x[1] = sbc.toString();
			}
		}

		return x;
	}

	// �������ı�Ƿָ��ַ���
	public static String[] split(String source, String div) {
		int arynum = 0, intIdx = 0, intIdex = 0, div_length = div.length();
		if (source.compareTo("") != 0) {
			if (source.indexOf(div) != -1) {
				intIdx = source.indexOf(div);
				for (int intCount = 1;; intCount++) {
					if (source.indexOf(div, intIdx + div_length) != -1) {
						intIdx = source.indexOf(div, intIdx + div_length);
						arynum = intCount;
					} else {
						arynum += 2;
						break;
					}
				}
			} else {
				arynum = 1;
			}
		} else {
			arynum = 0;

		}
		intIdx = 0;
		intIdex = 0;
		String[] returnStr = new String[arynum];

		if (source.compareTo("") != 0) {
			if (source.indexOf(div) != -1) {
				intIdx = (int) source.indexOf(div);
				returnStr[0] = (String) source.substring(0, intIdx);

				for (int intCount = 1;; intCount++) {
					if (source.indexOf(div, intIdx + div_length) != -1) {
						intIdex = (int) source
								.indexOf(div, intIdx + div_length);
						returnStr[intCount] = (String) source.substring(intIdx
								+ div_length, intIdex);
						intIdx = (int) source.indexOf(div, intIdx + div_length);
					} else {
						returnStr[intCount] = (String) source.substring(intIdx
								+ div_length, source.length());
						break;
					}
				}
			} else {
				returnStr[0] = (String) source.substring(0, source.length());
				return returnStr;
			}
		} else {
			return returnStr;
		}
		return returnStr;
	}

	public static String dealNull(String str) {
		if (str == null || str.equals("")) {
			return "";
		}
		return str;
	}

	public static String dealNullNot(String str) {
		if (str == null || str.equals("")) {
			return "";
		}
		return str;
	}

	public static String trim(String str) {
		return dealNull(str).trim();
	}

	public static String gotourl(String msg, String url) {
		StringBuffer sb = new StringBuffer();
		sb.append("<script LANGUAGE='javascript'>");
		if (msg != null && (!msg.equals(""))) {
			sb.append("alert('" + msg + "');");
		}
		if (url != null) {
			sb.append("window.location='" + url + "';");
		}
		sb.append("</SCRIPT>");
		return sb.toString();
	}

	public static boolean isAvild(String str) {
		if (str == null || (str.trim().equals(""))) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
	}

	public static String toStrings(String[] ss) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ss.length; i++) {
			sb.append(ss[i]);
			if (i < ss.length - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}

	public static String getNo(String i, int length) {
		String t = "0";
		if (i.length() == length) {
			return i;
		}

		for (int j = 0; j < (length - i.length() - 1); j++) {
			t += "0";
		}
		return t + i;
	}

	public static int Asc(char c) {
		return (int) c;
	}

	public static char Chr(int c) {
		return (char) c;
	}

	public static String simpleDate(String ldate) {
		if (ldate != null && ldate.length() >= 10) {
			return ldate.substring(0, 10);
		} else {
			return StringUtil.dealNull(ldate);
		}
	}

	

	/*public static String filterIllegal(String s) {
		if (s == null || s.equals("")) {
			return s;
		}
		if (s.toString().equals("-") || s.toString().equals("--")
				|| s.toString().equals("---") || s.toString().equals("----")) {
			return "";
		}
		s = StringUtil.replace(s, "&nbsp;", "").trim();
		return SBCchangeGB(s);
	}*/

	public static final int howmany(String line, String p) {
		if (line == null || p == null || line.indexOf(p) == -1) {
			return 0;
		}

		int i = 0;

		int nums = 0;
		while ((i = line.indexOf(p, i)) >= 0) {
			i += p.length();
			nums++;
		}

		return nums;
	}

	public static double uround(double f, double y) {
		double n = 0;
		double x = 0;
		int z = 0;
		n = Math.pow(10, y);
		x = f * n;
		z = (int) (x);
		if (z % 2 != 0) {
			x = (double) ((int) (x + 0.6));
		} else {
			x = (double) ((int) (x + 0.4));
		}
		x = x / n;
		return (x);
	}

	/*
	 * public static final String SBCchange(String BJstr) {
	 * 
	 * String outStr = ""; String Tstr = ""; byte[] b = null;
	 * 
	 * outStr=ToSBC(BJstr);
	 * 
	 * return outStr; }
	 */

	/*public static final String SBCchangeGB(String QJstr) {
		String outStr = "";
		String Tstr = "";
		byte[] b = null;

		QJstr = CodeUtil.GBToUnicode(QJstr);

		outStr = ToDBC(QJstr);

		return CodeUtil.unicodeToGB(outStr);
	}
*/
	/*
	 * public static final String SBCchange(String QJstr) {
	 * 
	 * String outStr = ""; String Tstr = ""; byte[] b = null;
	 * 
	 * for (int i = 0; i < QJstr.length(); i++) { try { Tstr =
	 * QJstr.substring(i, i + 1); b = Tstr.getBytes("unicode"); } catch
	 * (java.io.UnsupportedEncodingException e) { e.printStackTrace(); }
	 * 
	 * if (b[3] == -1) { b[2] = (byte) (b[2] + 32); b[3] = 0;
	 * 
	 * try { outStr = outStr + new String(b, "unicode"); } catch
	 * (java.io.UnsupportedEncodingException e) { e.printStackTrace(); } } else
	 * { outStr = outStr + Tstr; } }
	 * 
	 * return outStr; }
	 * 
	 * public static final String SBCchangeGB(String QJstr) { String outStr =
	 * ""; String Tstr = ""; byte[] b = null;
	 * 
	 * QJstr = CodeUtil.GBToUnicode(QJstr); //���·��� ���� ������ Ϊ ���� Ŀǰ������������֣����� for
	 * (int i = 0; i < QJstr.length(); i++) { try { Tstr = QJstr.substring(i, i
	 * + 1); b = Tstr.getBytes("unicode"); } catch
	 * (java.io.UnsupportedEncodingException e) { e.printStackTrace(); }
	 * 
	 * if (b[3] == -1) { b[2] = (byte) (b[2] + 32); b[3] = 0;
	 * 
	 * try { outStr = outStr + new String(b, "unicode"); } catch
	 * (java.io.UnsupportedEncodingException e) { e.printStackTrace(); } } else
	 * { outStr = outStr + Tstr; } }
	 * 
	 * return CodeUtil.unicodeToGB(outStr); }
	 */

	/*
	 * // ���תȫ�� public static final String BQchange(String QJstr) { String
	 * outStr = ""; String Tstr = ""; byte[] b = null;
	 * 
	 * for (int i = 0; i < QJstr.length(); i++) { try { Tstr =
	 * QJstr.substring(i, i + 1); b = Tstr.getBytes("unicode"); } catch
	 * (java.io.UnsupportedEncodingException e) { e.printStackTrace(); } if
	 * (b[3] != -1) { b[2] = (byte) (b[2] - 32); b[3] = -1; try { outStr =
	 * outStr + new String(b, "unicode"); } catch
	 * (java.io.UnsupportedEncodingException e) { e.printStackTrace(); } } else
	 * { outStr = outStr + Tstr; } } return outStr; }
	 * 
	 * // ȫ��ת��� public static final String QBchange(String QJstr) { String
	 * outStr = ""; String Tstr = ""; byte[] b = null;
	 * 
	 * for (int i = 0; i < QJstr.length(); i++) { try { Tstr =
	 * QJstr.substring(i, i + 1); b = Tstr.getBytes("unicode"); } catch
	 * (java.io.UnsupportedEncodingException e) { e.printStackTrace(); } if
	 * (b[3] == -1) { b[2] = (byte) (b[2] + 32); b[3] = 0; try { outStr = outStr
	 * + new String(b, "unicode"); } catch (java.io.UnsupportedEncodingException
	 * e) { e.printStackTrace(); } } else { outStr = outStr + Tstr; } } return
	 * StringUtil.replace(outStr,"��"," ") ; }
	 */

	/**
	 * ���תȫ��
	 * 
	 * @param input
	 *            String.
	 * @return ȫ���ַ���.
	 */
	public static String ToSBC(String input) {
		char c[] = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = '\u3000';
			} else if (c[i] < '\177') {
				c[i] = (char) (c[i] + 65248);

			}
		}
		return new String(c);
	}

	/**
	 * ȫ��ת���
	 * 
	 * @param input
	 *            String.
	 * @return ����ַ���
	 */
	public static String ToDBC(String input) {
		if (input == null || input.isEmpty()) {
			return null;
		}
		char c[] = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '\u3000') {
				c[i] = ' ';
			} else if (c[i] > '\uFF00' && c[i] < '\uFF5F') {
				c[i] = (char) (c[i] - 65248);
			}
		}
		String returnString = new String(c);

		return returnString;
	}

	/**
	 * ȫ��ת��ǵ� ת������
	 */
	public static String full2HalfChange(String QJstr) {
		StringBuffer outStrBuf = new StringBuffer("");
		String Tstr = "";
		byte[] b = null;
		for (int i = 0; i < QJstr.length(); i++) {
			Tstr = QJstr.substring(i, i + 1);
			// ȫ�ǿո�ת���ɰ�ǿո�
			if (Tstr.equals("��")) {
				outStrBuf.append(" ");
				continue;
			}
			try {
				b = Tstr.getBytes("unicode");
				// �õ� unicode �ֽ�����
				if (b[2] == -1) {
					// ��ʾȫ��
					b[3] = (byte) (b[3] + 32);
					b[2] = 0;
					outStrBuf.append(new String(b, "unicode"));
				} else {
					outStrBuf.append(Tstr);
				}
			} catch (java.io.UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // end for.
		return outStrBuf.toString();
	}

	/**
	 * ���תȫ��
	 * 
	 * @Methods Name half2Fullchange
	 * @Create In 2012-8-24 By v-jiangwei
	 * @param QJstr
	 * @return String
	 */
	public static final String half2Fullchange(String QJstr) {
		StringBuffer outStrBuf = new StringBuffer("");
		String Tstr = "";
		byte[] b = null;
		for (int i = 0; i < QJstr.length(); i++) {
			Tstr = QJstr.substring(i, i + 1);
			if (Tstr.equals(" ")) {
				// ��ǿո�
				outStrBuf.append(Tstr);
				continue;
			}
			try {
				b = Tstr.getBytes("unicode");
				if (b[2] == 0) {
					// ���
					b[3] = (byte) (b[3] - 32);
					b[2] = -1;
					outStrBuf.append(new String(b, "unicode"));
				} else {
					outStrBuf.append(Tstr);
				}
				return outStrBuf.toString();
			} catch (java.io.UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return outStrBuf.toString();
	}

	/** ���ַ�������len��ֵ�ss���� **/
	private void toSplit(String[] ss, String content, int len) {
		int l = ss.length;
		for (int i = 0; i < l; i++) {
			if (content.length() > len) {
				ss[i] = content.substring(0, len);
				content = content.substring(len, content.length());
			} else {
				ss[i] = content;
				content = "";
			}
		}
	}

	/** ���ַ�������������� **/
	public static int getMax(String s) {
		String ch = "";
		int max = 0;
		boolean lastNumber = false;
		for (int i = 0; i < s.length(); i++) {
			char chtmp = s.charAt(i);
			int maxtmp = 0;
			if (isNumeric(chtmp + "")) {
				if (lastNumber) {
					ch = ch + chtmp;
				} else {
					ch = ch + chtmp;
				}
				maxtmp = Integer.parseInt(ch);
				if (maxtmp > max) {
					max = maxtmp;
				}
				lastNumber = true;
			} else {
				ch = "";
				lastNumber = false;
			}
		}
		return max;
	}

	public static String toHtmlStr(String sStr) {
		if (sStr == null || sStr.equals("")) {
			return sStr;
		}
		StringBuffer sTmp = new StringBuffer();
		int i = 0;
		while (i <= sStr.length() - 1) {
			if (sStr.charAt(i) == '\n' || sStr.charAt(i) == '\r') {
				sTmp = sTmp.append("<br>");
			} else if (sStr.charAt(i) == ' ') {
				sTmp = sTmp.append("&nbsp;");
			} else {
				sTmp = sTmp.append(sStr.substring(i, i + 1));
			}
			i++;
			{
			}
		}
		String S1;
		S1 = sTmp.toString();
		return S1;
	}

}