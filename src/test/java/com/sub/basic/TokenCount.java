package com.sub.basic;

public class TokenCount {
	public static void main(String[] args) {
		String inputString = "He is a very very good boy, isn't he?";
		
		String allTokens[] = inputString.split("[\\s!,?._'@]+");
		System.out.println(allTokens.length);
		for (String tokens : allTokens) {
			System.out.println(tokens);
		}
	}
}
