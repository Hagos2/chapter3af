package ASSIGNMENT5;

import java.util.Scanner;

public class FindAge {
    public static void main(String[]args){
        int currentYear,year,age;
        currentYear=2021;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a year you born");
        year=input.nextInt();
        age = currentYear-year;
        System.out.print("you  were born in " +  year + " and will be " + age + " this year ");
    }
}
