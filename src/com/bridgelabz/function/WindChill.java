package function;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        double temperature,windSpeed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Temperature t and it's must be not greater than 50  :");
        temperature = sc.nextDouble();
        System.out.println("Enter the value of wind speed v and it's must be greater than 3 and less than 120 :");
        windSpeed = sc.nextDouble();

        if(temperature <= 50 && windSpeed >= 3 && windSpeed <= 120) {
            // formula to calculate the value of wind chill
            double w = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
            //Above formula only valid when the value of t and v with in the rang
            System.out.println("Temperature = " + temperature);
            System.out.println("windSpeed = " + windSpeed);
            System.out.println("wind chill = " + w);
        }
        else {
            System.out.println("Note - input must be with in a rang ");
        }
    }
}