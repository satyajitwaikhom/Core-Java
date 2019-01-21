
/*armstrong number is equal to the sum of cubes of its digits for
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  
 * 153 = 1+125+27  
 *  */
public class Armstrong {
	public static void main(String[] args)  {  
	    int c=0,a,temp;  
	    int n=154;//It is the number to check armstrong  
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
}
