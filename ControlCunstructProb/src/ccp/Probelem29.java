package ccp;

public class Probelem29 {
	public static void sumDig(int num)
	
	{
		//initiating integer sum as 0
		int sum=0;
		//Running a loop till n not equal to 0
        while (num!= 0){
        	//initiating a integer digit to store digit value of no
           int digit=(num%10);
           //Adding the digit to sum
            sum+=digit;
            //Deleting the used digit value of no
            num/=10;
            }
            System.out.println("\nSum of digits in the given number is "+sum+".");
            
	}
}
