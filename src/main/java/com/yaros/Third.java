package com.yaros;

import java.util.Scanner;

public class Third {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long f = 1;
        if (a >= 0) {
            for (; a > 0; a--) {
                f *= a;
            }
            System.out.println(f);
        }else{
            System.out.println("no factorial");
        }
    }
}
