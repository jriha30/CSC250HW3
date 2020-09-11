import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		String decString = myObj.nextLine();
		int decNum = Integer.parseInt(decString);
		String binString = "";
		while(decNum != 0)
		{
			int remainder = decNum % 2;
			decNum = decNum / 2;
			binString = remainder + binString;
		}
		System.out.println("The decimal number " + decString + " is " + binString + " in binary.");
	}
}