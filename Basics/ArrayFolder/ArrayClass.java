package ArrayFolder;

import ControlStatements.*;
import Input.*;

public class ArrayClass 
{
	
	public int[] defineArray(int n)
	{
		Loops newLoop = new Loops();
		MyInput newInput = new MyInput();
		
		int[] arr = newLoop.arrayLoop(n);
		
		return arr;
	}
}
