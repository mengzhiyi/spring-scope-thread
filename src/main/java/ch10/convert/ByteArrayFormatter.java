package ch10.convert;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class ByteArrayFormatter implements Formatter<byte []> {

	@Override
	public String print(byte[] object, Locale locale) {
		return new String(object);
	}

	@Override
	public byte[] parse(String text, Locale locale) throws ParseException {
		//以空格分割
		String[] arr = text.split(" ");
		byte [] bs = new byte[arr.length];
		for(int i=0; i<arr.length; i++){
			if(arr[i].startsWith("0x") && arr[i].length() == 4)
				bs[i] = hexStringToBytes(arr[i].substring(2));
		}
		return bs;
	}
	
	/** 
	 * Convert hex string to byte[] 
	 * @param hexString the hex string 
	 * @return byte[] 
	 */  
	public static byte hexStringToBytes(String hexString) {  
	    if (hexString == null || hexString.equals("")) {  
	        return 0;  
	    }  
	    hexString = hexString.toUpperCase();  
	    char[] hexChars = hexString.toCharArray();  
	    byte d = (byte) (charToByte(hexChars[0]) << 4 | charToByte(hexChars[1]));  
	    return d;  
	}
	
	/** 
	 * Convert char to byte 
	 * @param c char 
	 * @return byte 
	 */  
	 private static byte charToByte(char c) {  
	    return (byte) "0123456789ABCDEF".indexOf(c);  
	}  
}
