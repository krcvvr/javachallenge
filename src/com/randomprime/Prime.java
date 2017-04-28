package com.randomprime;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Prime {
	private Integer keyNumber;
	public Integer getKeyNumber() {
		return keyNumber;
	}

	public void setKeyNumber(Integer keyNumber) {
		this.keyNumber = keyNumber;
	}


	private Boolean valueBoolean;
	
	public Boolean getValueBoolean() {
		return valueBoolean;
	}

	public void setValueBoolean(Boolean valueBoolean) {
		this.valueBoolean = valueBoolean;
	}

	Prime()
	{
		
	}
	
	Prime(Integer i, Boolean b)
	{
		this.keyNumber=i;
		this.valueBoolean=b;
	}
	
	
	public Queue<Prime> primeCheck(Queue<Integer> q)
	{
		Queue<Prime> resultQueue = new ArrayDeque<>();
		Iterator<Integer> iter = q.iterator();
		 boolean primeornot = false;
		
		while(iter.hasNext())
		{
			Integer n = iter.next();
			if(n <=3)
			{
				if(n<=1)
				{
					primeornot=false;					
				}
				else
				{
					primeornot=true;					
				}
				resultQueue.add(new Prime(n, primeornot));
			}
			else
			{
				for(int i=2;i<=n/2;i++)
				{
					if(n%i == 0)
					{
						primeornot=false;
						break;					
					}
					else
					{
						primeornot=true;						
					}
						
				}
				resultQueue.add(new Prime(n, primeornot));
			}			
			
		}
		return resultQueue;
	
	}

}
