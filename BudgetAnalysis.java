import java.util.Scanner;

public class BudgetAnalysis {
    public static void main( String [] args) {       /*Accepting inputs from user*/
        Scanner scanner = new Scanner( System.in);
        double userBudget;     //Create a double variable because its a double amount
        char moreExpenses = '\0';
        double userExpense; //this is going to hold each expense at a time
        double totalExpenses = 0;


        System.out.print("Please enter your budget for the month: $");
        userBudget = scanner.nextDouble();

       do {
            System.out.print("Enter your expense: $");
            userExpense = scanner.nextDouble();
            totalExpenses = totalExpenses + userExpense;
            System.out.print("Do you have any more expenses? Enter y for yes and n for no: ");
            moreExpenses = scanner.next().charAt(0); //yes


        }  while( moreExpenses == 'y');
        if( totalExpenses < userBudget) {
            System.out.printf("You still have $%,.2f left of your monthly budget", (userBudget - totalExpenses));
        }else if(totalExpenses > userBudget){
            System.out.printf("You are over your monthly budget by $%,.2f", (totalExpenses - userBudget));
        }else {
            System.out.printf("You have reached your budget limit of $%,.2f", totalExpenses );
        }
    }
}
