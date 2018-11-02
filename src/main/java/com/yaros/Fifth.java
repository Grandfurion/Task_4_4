package com.yaros;

public class Fifth {

    public static void main(String[] args) {

        int[] num = new int[]{0,0,0,0,0};
        int sum = 0;

        for (int i = 0; num[4] < 5; i++) {

            num[0] += i;
            if (num[0] == 2 || num[1] == 2 || num[2] == 2 || num[3] == 2 || num[4] == 2){
                sum += 1;
            }


            if (num[0] > 9){
                num[0] = 0;
                num[1] += 1;
                if (num[1] > 9){
                    num[1] = 0;
                    num[2] += 1;
                    if (num[2] > 9){
                        num[2] = 0;
                        num[3] +=1;
                        if (num[3] > 9){
                            num[3] = 0;
                            num[4] += 1;
                            if (num[4] > 4){
                                System.out.println(sum);
                            }
                        }
                    }
                }
            }

        }

        System.out.println(sum);

    }

}
