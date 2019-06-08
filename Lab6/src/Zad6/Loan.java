// Marta Rosińska
package Zad6;

public abstract class Loan implements LoanConstants{
    private int number;
    private String lastName;
    private double amount;
    private double interestRate;
    private int term;

    public Loan(int number, String lastName, double amount,double interestRate,int term)
    {
        this.number = number;
        this.lastName = lastName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }
    public double getAmount() {
        if(amount < maxAmount)
        {
            amount = maxAmount;
        }
        return (amount * interestRate) + amount;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTerm()
    {
        return term;
    }
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return number+", Last name: "+lastName+", amount: "+getAmount()+", interest rate: "+interestRate;
    }
}