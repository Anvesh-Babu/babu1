package example.training;

public class longnumber {

	public static void main(String[] args) {
       double n1=40.3, n2=3.4,n3=1.2;
       if (n1>=n2 && n1>=n3) {
    	   System.out.println(n1 + "largest number ");
       }else if(n2>=n1 && n2>=n3) {
    	   System.out.println(n2 + "largest number ");
       }else {
    	    System.out.println(n3 + "largest number");
       }
	}

}
