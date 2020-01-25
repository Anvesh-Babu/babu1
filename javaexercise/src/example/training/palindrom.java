package example.training;

public class palindrom {

	public static void main(String[] args) {
		int r,temp=0,sum=0;
		int n=121;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("the number is palindrom");
		}
		else {
			 System.out.println("the number is not palindrom");
		}
	}

}
