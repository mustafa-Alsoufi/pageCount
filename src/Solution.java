import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int pageCount(int n, int p) {
		int count=0;
    	
		// If the number of pages in the book is even
		if (n%2==0)
			n++;
		
		// Calculate the minimum number of pages you need to flip
		count = Math.min(p/2, (n-p)/2);
		
    	return count;
    	
		}
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
    	System.out.print("Enter the Number of pages: ");
		int n = scanner.nextInt();
		System.out.print("Enter the Number of page required: ");
		int p = scanner.nextInt();
		int result = pageCount(n,p);
		System.out.print(result);
    }
}
