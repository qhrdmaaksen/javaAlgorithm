package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
				/*//1024 단어 1개 입력받아 나누어 출력하기
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		for (int i = 0; i< word.length(); i++) {
			System.out.println("\'"+word.charAt(i)+"\'");*//*한글자씩i만큼출력*//*
		}*/

		/*//1023 실수 1개 입력받아 부분별로 출력하기
		Scanner sc = new Scanner(System.in);
		String value = Double.toString(sc.nextDouble());
		// 문자 그대로 특수문자를 구분자로 사용하고 싶을 경우에는 이스케이프 문자인 "\\"를 앞에 붙여야함
		String[] data = value.split("\\.");
		sc.close();
		System.out.printf("%s\n%s",data[0],data[1]);*/

		/*//1022 문장 1개 입력받아 그대로 출력하기
		String data = "";
		Scanner sc = new Scanner(System.in);
		data = sc.nextLine();
		System.out.println(data);*/


		/*//1014 문자 2개 입력받아 순서 바꿔 출력하기
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		String[] data = name.split("\\s");

		*//*배열의 각 인덱스를 문자열로 변환함*//*
		String data01 = String.valueOf(data[1]);
		String data00 = String.valueOf(data[0]);

		System.out.format("%s %s", data01, data00);*/

		/*//1021 1개의 단어를 입력받아 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		System.out.print(data);*/

		/*//1020 주민번호 입력받아 형태 바꿔 출력하기
		Scanner sc = new Scanner(System.in);
		String identity = sc.nextLine();
		sc.close();
		String[] data = identity.split("-");
		System.out.format("%06d%07d",Integer.parseInt(data[0]),Integer.parseInt(data[1]));*/

		/*//1019 연월일 입력받아 그대로 출력하기
		Scanner sc = new Scanner(System.in);
		String ymd = sc.nextLine();
		sc.close();
		String[] data = ymd.split("\\.");
		System.out.format("%04d.%02d.%02d", Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));*/

		/*1018 시간 입력받아 그대로 출력하기
		int hour, minute;
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		minute = sc.nextInt();
		System.out.printf("%d:%d",hour,minute);
		sc.close();*/

	/*1017 정수 1개 입력받아 3번 출력하기
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

	/* 1010 useBuffer 정수 1개 입력받아 그대로 출력하기
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int n;
		n = Integer.parseInt(buffer.readLine());
		System.out.println(n);
		============================*/

	/*1012 실수 1개 입력받아 그대로 출력하기
		Scanner scan = new Scanner(System.in);
		float ch ;
		ch = Float.parseFloat(scan.nextLine());
		System.out.printf("%.6f",ch);
		scan.close();*/

		/*1013 정수 2개 입력받아 그대로 출력하기
		int a , b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("%d %d",a,b);
		sc.close();*/

		/*1015 실수 입력받아 둘째 자리까지 출력하기
		float a, temp;
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		temp = a ;
		System.out.printf("%.2f%n",temp);*/
	}
}

