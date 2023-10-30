package prodigy_intern;
import java.util.Scanner;
public class tempconversion {
	

	 
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the temperature value: ");
	        double temp = input.nextDouble();
	        System.out.print("Enter the temperature unit (C, F, or K): ");
	        String unit = input.next().toUpperCase();

	        if (unit.equals("C")) {
	            double fahrenheit = (temp * 9/5) + 32;
	            double kelvin = temp + 273.15;
	            System.out.printf("%.2f°C is equivalent to %.2f°F and %.2f K.", temp, fahrenheit, kelvin);
	        } else if (unit.equals("F")) {
	            double celsius = (temp - 32) * 5/9;
	            double kelvin = celsius + 273.15;
	            System.out.printf("%.2f°F is equivalent to %.2f°C and %.2f K.", temp, celsius, kelvin);
	        } else if (unit.equals("K")) {
	            double celsius = temp - 273.15;
	            double fahrenheit = (celsius * 9/5) + 32;
	            System.out.printf("%.2f K is equivalent to %.2f°C and %.2f°F.", temp, celsius, fahrenheit);
	        } else {
	            System.out.println("Invalid input. Please enter a valid temperature unit (C, F, or K).");
	        }
	    }
	}


