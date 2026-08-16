package Shalini;

public class NoRepDigit {
	
		public static void main(String[] args)
		{
			int[] arr= {65,78,11};
			 int count=0;
			 int n=arr.length;
			 for(int num:arr)
			 {
				if(hasrep(num))
				{
					count++;
				}
			 } 
			 System.out.println(count);
		}
		
		
			 public static boolean hasrep(int n)
			 {
				 boolean[] seen= new boolean[10];
				
				 while(n>0)
				 {
			 int r=n%10 ;		
			 if(seen[r]==true)
			 {
				 return false;
			 }		 
			 seen[r]=true;
			 n=n/10;
				 }
		return true;
		
		
	}
}


