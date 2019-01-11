import java.util.Scanner;
public class Main {
    public static void main(String[] args){

      int NUMBER,hours;
      float amount,SALARY;
      Scanner sc = new Scanner(System.in);
      
      NUMBER = sc.nextInt();
      hours = sc.nextInt();
      amount = sc.nextFloat();
      SALARY = hours * amount;

      System.out.printf("NUMBER = %d\n",NUMBER);
      System.out.printf("SALARY = U$ %0.2f\n", SALARY);//SALARY = U$ 4100.00 
 
  }
}