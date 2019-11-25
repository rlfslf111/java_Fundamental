package Homework;
import java.util.*;
import java.util.Arrays;

public class Homework1 {
	public static void main(String[] args) {
		//문자 reverse하기
		//1.input "abcd"->"dcba"
		//2.input "abcde"->"edcba"
		
		String input="abcd";
		char[] ch=input.toCharArray();
		Arrays.sort(ch);
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<ch.length-(i+1); j++){
				if(ch[j]<ch[j+1]){
					char temp;
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		
		System.out.println(ch);
		
		String input2="abcde";
		char[] ch2=input2.toCharArray();
		Arrays.sort(ch2);
		for(int i=0; i<ch2.length; i++){
			for(int j=0; j<ch2.length-(i+1); j++){
				if(ch2[j]<ch2[j+1]){
					char temp;
					temp=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp;
				}
			}
		}
		System.out.println(ch2);
		
		
		//1-100까지 소수를 구하시오
		int count=0;
		for(int i=2; i<=100; i++){
			for(int j=2; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				System.out.println(i);
			}
			count=0;
		}
	}
}
