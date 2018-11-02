package com.yaros;

import java.util.Scanner;

public class Third {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int f = 1;
        for(;a>0;a--){
            f *= a;
        }
        System.out.println(f);
    }
}
