package com.cts.training.lib;

public class Calculate {
  
	  public void reverse(int n)
	  {
		  int  rev=0;
		  while (n!=0)
		    {
		    	rev=rev*10;
		        rev=rev+n%10;
		        n=n%10; 
		   } 

		  System.out.println("the reverse number is :"+rev);
	  }
	  
	  public void expands(int number)
	  {
		  int div=0,temp,i=1,count=0; 
		  temp=number ; 
		  while(temp>10) { 
           temp =temp/10; 
           i *= 10; 
		   count++; 
		   }   
		  while(count >=0) { 
			  div=number/i;  
			  number = number%i;  
			  if(count >= 1)   
		     System.out.print(div+"*"+i+"+");
			  else     
				  System.out.print(div); 
			  count--; 
			  i=i/10; 
			  } 
	  }
	  public void words(int no)
	  {
		  String [] nos= {"Zero","One","two","three","four","five","six","seven","eight","nine"};
		  int r;
          String res="";
          while(no>0)
          {  
        	  r=no%10;
        	  res=nos[r]+" "+res;
        	  no/=10;

	}
   System.out.print("\n"+res);
}
	  }

