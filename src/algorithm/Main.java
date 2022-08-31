package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String ymd = sc.nextLine();
		sc.close();
		String[] data = ymd.split("\\.");
		System.out.format("%04d.%02d.%02d", Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
		/*1018
		int hour, minute;
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		minute = sc.nextInt();
		System.out.printf("%d:%d",hour,minute);
		sc.close();*/
	/*1017
	int a ;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	System.out.printf("%d %d %d",a,a,a);
	sc.close();*/
		/*codeup 1010 useScanner
		Scanner scan = new Scanner(System.in);
		int n ;
		n = Integer.parseInt(scan.nextLine());
		System.out.println(n);
		scan.close();
		===========================================*/
	/* 1010 useBuffer
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int n;
		n = Integer.parseInt(buffer.readLine());
		System.out.println(n);
		============================*/
	/*1012
		Scanner scan = new Scanner(System.in);
		float ch ;
		ch = Float.parseFloat(scan.nextLine());
		System.out.printf("%.6f",ch);
		scan.close();*/
		/*1013
		int a , b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("%d %d",a,b);
		sc.close();*/
		/*1015
		float a, temp;
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		temp = a ;
		System.out.printf("%.2f%n",temp);*/
	}
}

