package loop;
import java.util.*;
public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num=sc.nextInt();
		        int sum=0;
		        while (num!= 0){
		           int digit=(num%10);
		            sum+=digit;
		            num/=10;
		            }
		            System.out.println("\nSum of digits in the given number is "+sum+".");
		            
		    
		
	}

}
