// Marta Rosińska
package Zad6;

public class PersonalLoan extends Loan {
    public PersonalLoan(int number, String lastName, double amount, int term, double basicInterestRate) {
        super(number, lastName, amount, basicInterestRate + 0.02, term);
    }
}
