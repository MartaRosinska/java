// Marta Rosińska
package Zad6;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateLoans {
    public static int main(String[] args)
    {
        ArrayList<Loan> loan = new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            int number = i;

            Scanner typeScanner = new Scanner(System.in);
            System.out.println("give the type of loan");
            String type = typeScanner.nextLine();

            Scanner lastNameScanner = new Scanner(System.in);
            System.out.println("give the last name");
            String lastName = lastNameScanner.nextLine();

            Scanner amountScanner = new Scanner(System.in);
            System.out.println("give the amount of the loan");
            double amount = amountScanner.nextDouble();

            Scanner termScanner = new Scanner(System.in);
            System.out.println("give term of loan");
            int term = termScanner.nextInt();

            Scanner basicInterestRateScanner = new Scanner(System.in);
            System.out.println("give basic interest rate");
            double basicInterestRate = basicInterestRateScanner.nextDouble();

            if(type.equals("personal"))
            {
                loan.add(new PersonalLoan(number, lastName, amount, term, basicInterestRate));
            }
            else if(type.equals("business"))
            {
                loan.add(new BusinessLoan(number, lastName, amount, term, basicInterestRate));
            }
            else
            {
                System.out.println("wrong type of loan!");
                i--;
                continue;
            }
        }

        for (int j=0;j<loan.size();j++)
        {
            System.out.println(loan.get(j).toString());
        }

        return 0;
    }
}
