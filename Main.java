import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {
    // double weight=0;
    // double height=0;
    // double bmi=0;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your weight(kg) and height(m): ");
    double weight = scanner.nextFloat();
    double height = scanner.nextFloat();

    double bmi = weight 
      / (Math.pow(height, 2));

    if (bmi < 18.5) {
    System.out.println("You are underweight");
    }

    else {
      if (bmi > 25) {
        System.out.println("You are overweight, do something about it! ");
      }
      else {
        System.out.println("You have a normal weight");
      }
    }
    NumberFormat bmiFormatted = NumberFormat.getInstance();

    //set the number of decimal places
    bmiFormatted.setMaximumFractionDigits(3);
    
    System.out.println("Your bmi is " + bmiFormatted.format(bmi));
  }
}