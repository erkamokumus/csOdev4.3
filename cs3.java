package arrays;

import java.util.Scanner;

public class cs3 {
	public static void main(String[] args)
	{
		//Write a function that tests whether a string is a palindrome
		//3. �dev
		
		
		System.out.println("Lutfen bir kelime girin:");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		System.out.println(palindrome(word));
	}
	
	public static boolean palindrome(String wordf)
	{
		for(int i=0; i<wordf.length();i++)
		{
			if(wordf.charAt(i) == wordf.charAt( (wordf.length() )-1-i ))
			{
				return true;
			}
		}
		return false;
	}

}
