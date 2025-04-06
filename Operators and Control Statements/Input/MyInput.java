package Input;
import java.util.Scanner;

public class  MyInput
{
	Scanner sc = new Scanner(System.in);
	
	public int getInt(String msg)
	{
		System.out.print(msg);
		return sc.nextInt();
	}
	
	public double getDouble(String msg)
	{
		System.out.print(msg);
		return sc.nextDouble();
	}
	
	public char getChar(String msg)
	{
		System.out.print(msg);
		char ch = sc.next().charAt(0);
		return ch;
	}
	public String getString(String msg)
	{
		System.out.println(msg);
		return sc.nextLine();
	}
	
	public void closeScanner()
	{
		sc.close();
	}
}
