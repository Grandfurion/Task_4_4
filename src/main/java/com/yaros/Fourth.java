package com.yaros;

import java.util.Scanner;

public class Fourth {
//не работает
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        int[] d = new int[] {0,1};

        for(int i = 0; d[0] < Math.sqrt(a) || d[1] < Math.sqrt(a); i++){

            if(d[0] < Math.sqrt(a)){
                d[0]++;
            }else if (d[1] < Math.sqrt(a)){
                d[1]++;
            }



            if(d[0] * d[1] == a){
                System.out.println("slojnoe");
            }else if ((d[0] >= Math.sqrt(a)) && (d[1] >= Math.sqrt(a))){
                System.out.println("prostoe");
                break;
            }else{
                continue;
            }

            break;
        }
    }
}
