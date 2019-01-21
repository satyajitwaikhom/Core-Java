
public class PrimeNumber {
public static void main(String[] args) {
	System.out.println(9%3);
	for(int j=2;j<=10;j++) {
		boolean flag=true;
	int num=j;
	//System.out.println(num/2);
	for(int i=2; i<=10; i++)
	{
		if (num%i == 0)
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.print(j+" ");
	}
	}
}
}
