package com.samplestring;

public class Palindrome {
	public static void main(String[] args)
	{
		String name = "maam";
		String reverseName="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverseName=  reverseName + name.charAt(i);			
		}
		System.out.println(reverseName);
	
	if(name.equals(reverseName))
	{
		System.out.println("It is a Palindrome");
	}
	else
		System.out.println("Not a Palindrome");
	}

}
