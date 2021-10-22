package exercise2;

import java.util.Scanner;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e7e29d804bb2c541e371e4654a87982105cb91e4
public class SumOfDigits {

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a number: ");
     int number = input.nextInt();

     int firstDigit = number % 10;
     number = number / 10;
     int secondDigit = number % 10;
     number = number / 10;
     int thirdDigit = number % 10;
      
<<<<<<< HEAD
     int sum = firstDigit + secondDigit + thirdDigit;
=======
      int sum = firstDigit + secondDigit + thirdDigit;

      System.out.println("Sum of digits: " + sum);
    
=======
public class BasicInput {

    public static void main(String[] args) {
>>>>>>> 63dff2eef559dbe384555733a2439bd6da57b9b7
        
    }
>>>>>>> e7e29d804bb2c541e371e4654a87982105cb91e4

     System.out.println("Sum of digits: " + sum); 
  }
  
}
