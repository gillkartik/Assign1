
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
public class test {

    
     
     
    public static void main(String[] args) {
        PersonalBudget p1 = new PersonalBudget();
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number of income sources?");
        int incomeSources= scan.nextInt();
        System.out.println(incomeSources);
     
   
      for(int i=0; i<incomeSources; i++) {
               System.out.println("Please enter an income");
      double inc=scan.nextDouble();
     
               p1.setIncome(inc);
      
      }
      System.out.println("please enter number of expenses?");
        int numExpenses= scan.nextInt();
        System.out.println(numExpenses);
      for(int i=0; i <numExpenses; i++) {
        System.out.println("Please enter a expense");
         double exp=scan.nextDouble();

        p1.setExpense(exp);
      }
    p1.outcome();

    }
 System.out.println();   
}
