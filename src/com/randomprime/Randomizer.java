package com.randomprime;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;

public class Randomizer {
	
//to generate series of positive random integers
	
	public static void main(String [] args)
	{
		Queue<Integer> integerQueue = new ArrayDeque<>();;
		
		for(int j=0;j<5;j++){
			Integer i = new Random().nextInt(100);
			integerQueue.add(i);
		}		

		Iterator<Integer> iter = integerQueue.iterator();	
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}	
		System.out.println("entering prime class");
		Prime prime = new Prime();
		Queue<Prime> results =  prime.primeCheck(integerQueue);
		
		for(Prime p:results)
		{
			System.out.println("Input value is " + p.getKeyNumber() + " and Prime result is "+p.getValueBoolean());		
			//System.out.println("Prime result is " + p.getValueBoolean());
		}			
		
	}
}
