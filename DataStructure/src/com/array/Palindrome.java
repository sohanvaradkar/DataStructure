package com.array;

public class Palindrome {
	
	public static boolean isPalindrome(String word ) {
		
		char[] ch=word.toCharArray();
		int start=0;
		int end=word.length()-1;
		
		while (start<end) {
			if(ch[start]!=ch[end])
				return false;

            start++;
            end--;
		}
		return true;
	}
	public static boolean isPalindrome(int num ) {

		if (num<=0)
			return  false;
		int rev=0;
		int orgnum=num;
		while (num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev+" :: "+num);

		return (rev==orgnum );

	}

	public static void main(String[] args) {
		
System.out.println(isPalindrome(-121));
	}

}
