package com.company;

public class calcurator {
	public int totalResult(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; ++i) {
			sum += i;
		}
		return sum;
	}

	public void viewResult() {
		System.out.println("10부터20까지 더한다면!? : " + totalResult(10, 20));
	}
}
