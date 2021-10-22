package exercise2;

import java.util.Scanner;

public class Circle {

<<<<<<< HEAD
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double r = input.nextDouble();
     double c = 2*Math.PI*r;
     double a = r*r*Math.PI;
     System.out.println("Circumference: " + c);
     System.out.println("Area: " + a); 
=======
public static void main(String[] args) {
<<<<<<< HEAD
   Scanner input = new Scanner(System.in);

   double r = input.nextDouble();
   double c = 2 * r * Math.PI;
   double a = r * r * Math.PI;

=======
   Scanner scanner = new Scanner(System.in);
   double r = Double.parseDouble(scanner.nextLine());
   double c = 2 * r * Math.PI;
   double a = r*r*Math.PI;
>>>>>>> 63dff2eef559dbe384555733a2439bd6da57b9b7
   System.out.println("Circumference:" + c);
   System.out.println("Area:" + a); 
   
>>>>>>> e7e29d804bb2c541e371e4654a87982105cb91e4
   }
}