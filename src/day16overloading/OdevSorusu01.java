package day16overloading;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {

		/*
		 Kullaniciya sayi girmesini soyleyin.
		 Kullanicinin girdigi sayininrakamlari toplamini ekrana
		 yazdiran bir program yazin.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz:");
		 int num = scan.nextInt();
		 
		 rakamToplami(num);
		 scan.close();
	}
	
	public static void rakamToplami(int num) {
		int sum = 0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("Rakamlar toplami: " + sum);
	}
	


}
