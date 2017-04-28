package com.samplestring;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Table {
	public static class Row
	{
		public Integer id;
		public String name;
		public String phone;
		public String address;
		
		public Row(Integer i, String n, String p, String a)
		{
			this.id =i;
			this.name = n;
			this.phone=p;
			this.address=a;
		}
		public static void main(String[] args)
		{
			Row firstRow = new Row(1,"Roopa","123456789","XYZ");
			Row secondRow = new Row(2,"ABC","123456888","PQR");
			Row thirdRow = new Row(3,"JJJ","666666666","LLL");
			Row fourthRow = new Row(4,"yyyy","8888888888","uuuuu");	
			
			Map<Integer,Row> map = new HashMap<>();
			map.put(firstRow.id,firstRow);
			map.put(secondRow.id, secondRow);
			map.put(thirdRow.id, thirdRow);
			map.put(fourthRow.id, fourthRow);
			
			System.out.println("ID " + "NAME " + "PHONE " + "ADDRESS ");
			for(Entry<Integer,Row> e : map.entrySet())
			{
				System.out.print(e.getValue().id + " ")  ;
				System.out.print(e.getValue().name+ " ");
				System.out.print(e.getValue().phone+ " ");
				System.out.print(e.getValue().address+ " ");
				System.out.println("");
			}			
		}
		
	}

}
