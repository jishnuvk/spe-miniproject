package com.jishnu;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App 
{   
    public static void main( String[] args )
    {   
        String menu = "Choose an oparation\n";
        menu += "1:squareRoot\n";
        menu += "0:Exit\n";
        
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        
        while(choice != 0){

            System.out.println(menu);

            try{
                choice = scanner.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Enter a valid option");
                continue;
            }

            if(choice == 0){
                break;
            }
            else if(choice == 1){

                System.out.println("Enter the number:");
                Double n = scanner.nextDouble();
                System.out.println(Math.sqrt(n));
            }
            
            
        }

        scanner.close();

    }
}
