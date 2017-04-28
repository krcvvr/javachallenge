package com.samplestring;

public class Reverse {
	public static void main(String[] args)
	{
		String name = "maam";
		String reverseName="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverseName=  reverseName + name.charAt(i);			
		}
		System.out.println(reverseName);
	}

}
