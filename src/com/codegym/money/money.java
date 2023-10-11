package com.codegym.money;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        double money =1.0;
        int month =1;
        double interrestRate=1.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter investment amount");
        money=scanner.nextDouble();
        System.out.println("Enter number of months:");
        month=scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interrestRate=scanner.nextDouble();
        double totalInterest=0;
        for (int i=0;i<month;i++){
            totalInterest+=money*(interrestRate/100)/12*month;
        }
        System.out.println("total of interest:"+totalInterest);
    }
}
