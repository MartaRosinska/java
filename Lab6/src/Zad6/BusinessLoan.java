// Marta Rosińska
package Zad6;

public class BusinessLoan extends Loan {
    public BusinessLoan(int number, String lastName, double amount, int term, double basicInterestRate)
    {
        super(number, lastName, amount, basicInterestRate + 0.01, term);
    }
}
