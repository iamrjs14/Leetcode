package com.cerner.code;

import java.util.Scanner;
import java.util.logging.Logger;

public class BinaryToDecimal {

    Logger log = Logger.getLogger(BinaryToDecimal.class.getName());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        int n = sc.nextInt();
        int decimal=0,p=0;
        while(n!=0) {
            decimal = (int) (decimal + ((n%10)*Math.pow(2,p)));
            n=n/10;
            p++;
        }
        System.out.println(decimal);

    }
}
