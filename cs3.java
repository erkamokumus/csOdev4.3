package arrays;

import java.util.Scanner;

public class cs3 {
	public static void main(String[] args)
	{
		//Write a function that tests whether a string is a palindrome
		//3. ödev
		
		
		System.out.println("Lutfen bir kelime girin:");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		System.out.println(palindrome(word));
	}
	
	public static boolean palindrome(String wordf)
	{
		int flag=1;
		for(int i=0; i<wordf.length();i++)
		{
			if(wordf.charAt(i) != wordf.charAt( (wordf.length() )-1-i ))
			{
				flag=0;
				return false;
			}
			if(flag==0)
			{
				break;
			}
			
			
		}
		return true;
	}

}
