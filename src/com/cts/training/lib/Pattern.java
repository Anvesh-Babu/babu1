package com.cts.training.lib;
public class Pattern {
	 public Pattern (int n) {

	       for(int i=1;i<=n;i++)
	       {
	    	     for(int j=1;j<=n-i;j++)
	    	     {
	    	    	  System.out.print(" ");
	    	      }
	    	          for(int k=1;k<=i;k++)
	    	        {
	    	    	     System.out.print(k);
	    	        }
	    	          for(int l=i-1;l>=1;l--) 
	    	        {
	    	    	  System.out.print(l);
	    	      }
	    	       System.out.println(" ");
	       }
	 }
 public void  Pattern1 (int n) {
	for (int i=1;i<n;i++)
	{
		 for (int j=1;j<=i;j--)
		 {
			 System.out.print(" ");
		 }
		 for (int k=1;k<=i;k++)
		 {
			 System.out.print(i +" ");
		 }
		 System.out.println();
		 
	}
  }
}
