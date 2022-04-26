package Test;

import java.util.Scanner;

interface Area {
	int calculate(int l,int b);
}

public class Ex2 {

	public static void main(String[] args) {
		Area Square = (int l,int b) -> {
			l=7;
			b=5;
			System.out.println("Area of square: " + l * b);
			return 0;
		};
		Square.calculate(0,0);
	}
}
