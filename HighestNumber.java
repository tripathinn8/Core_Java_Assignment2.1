
import java.util.*;

public class HighestNumber 
{
	static int a;
	
public	int HighestNumber()
	{
		int x;
		int y;
		int z;
Scanner digi= new Scanner(System.in);
System.out.println("Enter the three numbers");
x=digi.nextInt();
y=digi.nextInt();
z=digi.nextInt();

if (x>y && x>z)
	return x;
	else if (y>x && y>z)
	return y;
	else if (z>x && z> y)
	return z;
return 1;		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HighestNumber obj= new HighestNumber();
a=obj.HighestNumber();

if (a==1)
	System.out.println("None is greatest");
else
System.out.println("The highest number is " + a);
	}

}
