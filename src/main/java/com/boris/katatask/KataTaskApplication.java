package com.boris.katatask;


import java.util.Scanner;

public class KataTaskApplication {

	public static void main(String[] args) {
	    Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите математическое выражение");
		String given = scanner.nextLine();
		System.out.println(controller.start(given));
	}

}
