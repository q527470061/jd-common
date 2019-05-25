package com.jd.util.verifycode;

import java.util.UUID;

public class VerifyUtil {
	public static String randomUUID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static void main(String[] args){
		System.out.println(randomUUID());
		System.out.println(randomUUID());
	}
	
	
}
