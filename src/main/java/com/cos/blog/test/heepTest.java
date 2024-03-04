package com.cos.blog.test;

import java.util.Arrays;

public class heepTest {

	public static void main(String[] args) {
		
		System.out.println("@ int[] data = null;");
		int[] data = null;
		System.out.printf("data의 주소 : %s\n", data);
		
		
		System.out.println();
		
		
		System.out.println("@ data = new int[10];");
		data = new int[10];
		
		System.out.print("배열 원소 출력 : ");
		System.out.println(Arrays.toString(data));
		System.out.printf("data의 주소 : %s\n", data);
		
		
		
		
		
		
		
		
		
	}
}
