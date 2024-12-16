package util;

import java.util.Scanner;

public class Util {
	public static void main(String[] args) {

		System.out.println("Title:");

		Scanner sc = new Scanner(System.in);

		String title = sc.nextLine();
		title = title.toLowerCase().replaceAll(" ", "");

		System.out.println(title);

		sc.close();

	}
}
