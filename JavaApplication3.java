package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        double a,b,hipotenüs,alan,cevre,u,g;
        Scanner input=new Scanner(System.in);
        System.out.println("hesapaması yapılması istenen kenarlar: ");
        a=input.nextDouble();
        b=input.nextDouble();
        hipotenüs=input.nextDouble();
        
       cevre=(a+b+hipotenüs);
       u=cevre/2;
       alan = Math.sqrt(u*(u-a)*(u-b)*(u-hipotenüs));
       
        System.out.println("cevre:"+cevre+"alan:"+alan);
    }
    
}
