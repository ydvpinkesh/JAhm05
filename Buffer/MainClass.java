package Buffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {
   public MainClass() {
   }

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the length :- ");
         int length = Integer.parseInt(br.readLine());
         System.out.println("Enter the breadth :- ");
         int breadth = Integer.parseInt(br.readLine());
         Area area = new Area(length, breadth);
         System.out.println("The Area of rectangle is " + area.getArea());
      } catch (Exception var5) {
      }

   }
}