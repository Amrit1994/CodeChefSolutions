package com.pkg.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++){
			String str = br.readLine();
			
			int sum =0;	
		    sum = str.charAt(0)+str.charAt(str.length()-1)-96;	
			System.out.println(sum);
			
		}
		

	}

}
