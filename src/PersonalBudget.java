/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kartik gill
 */
class PersonalBudget {
    private  double Income;
    private  double Expense;
    double totalIncome;
    double totalExpense;

    public double getIncome() {
        return Income;
    }

    public double getExpense() {
        return Expense;
    }

    public void setIncome(double Income) {
        this.Income = Income;
        this.totalIncome();
    }

    public void setExpense(double Expense) {
        this.Expense = Expense;
        this.totalExpense();
    }
    
    public void totalIncome() {
        
        totalIncome+=this.Income;
        System.out.println("total income is:" +totalIncome);
    }
    public void totalExpense() {
        totalExpense+=this.Expense;
        System.out.println("total expense is:" + totalExpense);
    }
    public void outcome() {
        if (totalIncome>totalExpense) {
            System.out.println("OK");
        } 
        else {
            System.out.println("Warning");
        }
    }
}
