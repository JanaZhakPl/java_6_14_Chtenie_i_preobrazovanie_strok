package it.campe;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        System.out.println(s3);
        System.out.println(s2.toUpperCase(Locale.ROOT));
        System.out.println(s1.toLowerCase(Locale.ROOT));
    }
}
