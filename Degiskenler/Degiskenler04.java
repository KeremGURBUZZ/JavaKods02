package Degiskenler;

import java.util.Scanner;

public class Degiskenler04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int sayi1 = scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz:");
		int sayi2 = scanner.nextInt();
		
		int toplam = sayi1 + sayi2;
		System.out.println("1. Ve 2. sayının toplamı : " + toplam);

	}

}
