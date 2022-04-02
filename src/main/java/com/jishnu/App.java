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
        menu += "2:power\n";
        menu += "3:logarithm\n";
        menu += "4:factorial\n";
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
            else if(choice == 2){

                System.out.println("Enter the base:");
                Double n = scanner.nextDouble();
                System.out.println("Enter the exponent:");
                Double e = scanner.nextDouble();
                n = calc.power(n,e);
                System.out.println("result: " + String.valueOf(n));
            }
            else if(choice == 3){

                System.out.println("Enter the number:");
                Double n = scanner.nextDouble();
                n = calc.logarithm(n);
                System.out.println("result: " + String.valueOf(n));
            }
            else if(choice == 4){
                System.out.println("Enter the number:");
                Double n = scanner.nextDouble();
                n = calc.factorial(n);
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

    public double logarithm(double n){
        logger.info("[LOGARITHM] - " + n);
        double l = Math.log(n);
        logger.info("[RESULT - LOGARITHM] - " + l);
        return l;
    }

    public double power(double n, double e){
        logger.info("[POWER] - " + n + " " + e);
        double p = Math.pow(n, e);
        logger.info("[RESULT - POWER] - " + p);
        return p;
    }

    public double factorial(double n){
        logger.info("[FACTORIAL] - " + n);
        
        double f = 1;

        for(int i = 2; i <= n; i++){
            f *= i;
        }

        logger.info("[RESULT - LOGARITHM] - " + f);
        return f;
    }
}
