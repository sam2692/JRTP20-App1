package com.sam.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	    int i=10;
        int j=20;
	public static String encode(String txt)
	{
		// Making changes for BUG-101
		int k=30;
		int l=40;
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}
	public static String decode(String encodeTxt)
	{
		// Changes for BUG-121
		String name = "Raj";
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
	}
	
	public static void main(String[] args) {
		String encode = PasswordService.encode("Sameer");
		System.out.println(encode);
		String decode = PasswordService.decode(encode);
		System.out.println(decode);
	}
}
