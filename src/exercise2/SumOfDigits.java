package exercise2;

import java.util.Scanner;

<<<<<<< HEAD
public class SumOfDigits {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

  
      int number = input.nextInt();

      int firstDigit = number % 10;
      number = number / 10;
      int secondDigit = number % 10;
      number = number / 10;
      int thirdDigit = number % 10;
      
      int sum = firstDigit + secondDigit + thirdDigit;

      System.out.println("Sum of digits: " + sum);
    
=======
public class BasicInput {

    public static void main(String[] args) {
>>>>>>> 63dff2eef559dbe384555733a2439bd6da57b9b7
        
    }

}
