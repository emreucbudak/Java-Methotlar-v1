package test;

import java.util.Scanner;

public class Methot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,e;
		isimYazdir();
		topla(3,4);
		Scanner art = new Scanner(System.in);
		System.out.println("Sayıları Gir");
		d = art.nextInt();
		e = art.nextInt();
		topla(d,e);
		
	}
	public static void isimYazdir () 
	{
		System.out.println("Emre Üçbudak");
	}
	public static void topla (int a , int b) {
		int c = b+a;
		System.out.println("Girilen Sayı =  " + c);
	}
}
