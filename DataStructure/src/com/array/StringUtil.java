package com.array;

public class StringUtil {
	
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

	public static void main(String[] args) {
		
System.out.println(isPalindrome("adda"));
	}

}
