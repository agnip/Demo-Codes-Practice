//Series Calculation
public class MySeries 
{
	int myseries(int n)
	{
		int i,sum=0,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*(2*i-1)*(2*i);
			sum+=f;
		}
		return sum;
	}
	public static void main(String args[])
	{
		MySeries My = new MySeries();
		System.out.println("\tThe value of MySeries is : - " + My.myseries(3));
	}
}
