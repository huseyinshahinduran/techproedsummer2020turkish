package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		/*
		 Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin 
		 bastan ikinci harfi ile sondan ikinci harfini
         büyük harf olarak ekrana yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yasadiginiz ulkenin ismini giriniz:");
		String ulke = scan.nextLine();
		
		System.out.println(ulke.toUpperCase().charAt(1)); //2. harfin indexi 1 dir.
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
		
		scan.close();

	}

}
