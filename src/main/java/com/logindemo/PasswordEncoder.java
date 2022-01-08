package com.logindemo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String args[]) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPasswordString = "maruti1993";
		String encodedPAssString = encoder.encode(rawPasswordString);
		System.out.print(encodedPAssString);
	}
}
