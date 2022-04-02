package com.jishnu;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class App 
{   
    private static App calc = new App();
    private static Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {   
        
        String menu = "\n\nChoose an oparation\n";
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
                n = calc.squareRoot(n);
                System.out.println("result: " + String.valueOf(n));
            }
            
            
        }

        scanner.close();

    }

    public double squareRoot(double n){
        logger.info("[SQUARE ROOT] - " + n);
        double r = Math.sqrt(n);
        logger.info("[RESULT - SQUARE ROOT] - " + r);
        return r;
    }
}
