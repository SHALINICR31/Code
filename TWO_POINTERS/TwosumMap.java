package August;

import java.util.*;

public class Twosum {

	
	public static void main(String[] args)
	{
		Map<Integer,Integer> m= new HashMap<>();
		int t= 3;
		int[] arr= { 1,3,2,1};
		int n=4;
		int complement;
		for(int i=0;i<n;i++)
		{
			 complement=t-arr[i];
			
			if(m.containsKey(complement))
			{
				System.out.println(complement+ " " +arr[i] +" = " +t);
				System.out.println(m.get(complement)+ " " +i);
				return;
			}
			
			m.put(arr[i], i);
		}
	}
}
