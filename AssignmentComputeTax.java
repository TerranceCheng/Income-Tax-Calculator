/*
Program name : AssignmentComputeTax
Program description : This program calculate taxes according to user's filing status and taxable income.
Programmer : Cheng Yong Tat
Date : 28/06/2021
*/

//Start of program
import javax.swing.JOptionPane;

public class AssignmentComputeTax {
  public static void main(String[] args) {

    //Declare a variable to control the loop
    int option=0;

    //Start of the loop
    while(option==JOptionPane.YES_OPTION) {

    //Prompt the user to enter their filing status
    String statusString = JOptionPane.showInputDialog (null, 
      "Please enter your filing status: " + 
        "\n  0 - Single filers" +
        "\n  1 - Married filing jointly" +
        "\n  2 - Married filing seperately" +
        "\n  3 - Head of household",
      "Filing status", JOptionPane.QUESTION_MESSAGE);

    //Prompt the user to enter their taxable income
    String taxIncomeString = JOptionPane.showInputDialog (
      null, "Please enter the taxable income: ",
      "Taxable income", JOptionPane.QUESTION_MESSAGE);

    //Initiate a value to the variables
    double tax = 0;
    double finalTax = 0;

    //Convert the variable from string to integer and double
    int filingStatus = Integer.parseInt(statusString);
    double taxIncome = Double.parseDouble(taxIncomeString);

    //Start of the switch case statement
    switch(filingStatus) {

      //Case 0, used to calculate the tax for filing status 0
      case 0: {

        //Declare the variable to calculate highest tax for each income range
        double maxTax10 = 8350 * 0.10;
        double maxTax15 = (33950 - 8350) * 0.15;
        double maxTax25 = (82250 - 33950) * 0.25;
        double maxTax28 = (171550 - 82250) * 0.28;
        double maxTax33 = (372950 - 171550) * 0.33;

        //Starts to calculate the tax
        if(taxIncome >= 0 && taxIncome <= 8350) {
          tax = taxIncome * 0.10;
        }

        else if(taxIncome >= 8351 && taxIncome <= 33950) {
          tax = ((taxIncome - 8350) * 0.15) + maxTax10;
        }

        else if(taxIncome >= 33951 && taxIncome <= 82250) {
          tax = ((taxIncome - 33950) * 0.25) + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 82251 && taxIncome <= 171550) {
          tax = ((taxIncome - 82250) * 0.28) + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 171551 && taxIncome <= 372950) {
          tax = ((taxIncome - 171550) * 0.33) + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 372951) {
          tax = ((taxIncome - 372950) * 0.35) + maxTax33 + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        //If the user enters a negative number, the program will displays invalid
        else if(taxIncome < 0) {
          JOptionPane.showMessageDialog(null, 
            "Invalid taxable income. Please try again",
            "Invalid value", JOptionPane.ERROR_MESSAGE);
          break;
        }

        //Convert the final result into two decimal places
        finalTax = (int)(tax*100)/100.0;

        //Display the final result
        JOptionPane.showMessageDialog(null, 
          "Filing status: " + filingStatus +
          "\nTaxable income: " + taxIncome +
          "\nTax: " + finalTax,
          "Tax calculator", JOptionPane.INFORMATION_MESSAGE);

        //Exit the switch case statement
        break;
      }

      //Case 1, used to calculate the tax for filing status 1
      case 1: {

        //Declare the variable to calculate highest tax for each income range
        double maxTax10 = 16700 * 0.10;
        double maxTax15 = (67900 - 16700) * 0.15;
        double maxTax25 = (137050 - 67900) * 0.25;
        double maxTax28 = (208850 - 137050) * 0.28;
        double maxTax33 = (372950 - 208850) * 0.33;

        //Starts to calculate the tax
        if(taxIncome >= 0 && taxIncome <= 16700) {
          tax = taxIncome * 0.10;
        }

        else if(taxIncome >= 16701 && taxIncome <= 67900) {
          tax = ((taxIncome - 16700) * 0.15) + maxTax10;
        }

        else if(taxIncome >= 67901 && taxIncome <= 137050) {
          tax = ((taxIncome - 67900) * 0.25) + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 137051 && taxIncome <= 208850) {
          tax = ((taxIncome - 137050) * 0.28) + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 208851 && taxIncome <= 372950) {
          tax = ((taxIncome - 208850) * 0.33) + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 372951) {
          tax = ((taxIncome - 372950) * 0.35) + maxTax33 + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        //If the user enters a negative number, the program will displays invalid
        else if(taxIncome < 0) {
          JOptionPane.showMessageDialog(null, 
            "Invalid taxable income. Please try again",
            "Invalid value", JOptionPane.ERROR_MESSAGE);
          break;
        }

        //Convert the final result into two decimal places
        finalTax = (int)(tax*100)/100.0;

        //Display the final result
        JOptionPane.showMessageDialog(null, 
          "Filing status: " + filingStatus +
          "\nTaxable income: " + taxIncome +
          "\nTax: " + finalTax,
          "Tax calculator", JOptionPane.INFORMATION_MESSAGE);

        //Exit the switch case statement
        break;
      }

      //Case 2, used to calculate the tax for filing status 2
      case 2: {

        //Declare the variable to calculate highest tax for each income range
        double maxTax10 = 8350 * 0.10;
        double maxTax15 = (33950 - 8350) * 0.15;
        double maxTax25 = (68525 - 33950) * 0.25;
        double maxTax28 = (104425 - 68525) * 0.28;
        double maxTax33 = (186475 - 104426) * 0.33;

        //Starts to calculate the tax
        if(taxIncome >= 0 && taxIncome <= 8350) {
          tax = taxIncome * 0.10;
        }

        else if(taxIncome >= 8351 && taxIncome <= 33950) {
          tax = ((taxIncome - 8350) * 0.15) + maxTax10;
        }

        else if(taxIncome >= 33951 && taxIncome <= 68525) {
          tax = ((taxIncome - 33950) * 0.25) + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 68526 && taxIncome <= 104425) {
          tax = ((taxIncome - 68525) * 0.28) + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 104426 && taxIncome <= 186475) {
          tax = ((taxIncome - 104425) * 0.33) + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 186476) {
          tax = ((taxIncome - 186475) * 0.35) + maxTax33 + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        //If the user enters a negative number, the program will displays invalid
        else if(taxIncome < 0) {
          JOptionPane.showMessageDialog(null, 
            "Invalid taxable income. Please try again",
            "Invalid value", JOptionPane.ERROR_MESSAGE);
          break;
        }

        //Convert the final result into two decimal places
        finalTax = (int)(tax*100)/100.0;

        //Display the final result
        JOptionPane.showMessageDialog(null, 
          "Filing status: " + filingStatus +
          "\nTaxable income: " + taxIncome +
          "\nTax: " + finalTax,
          "Tax calculator", JOptionPane.INFORMATION_MESSAGE);

        //Exit the switch case statement
        break;
      }

      //Case 3, used to calculate the tax for filing status 3
      case 3: {

        //Declare the variable to calculate highest tax for each income range
        double maxTax10 = 11950 * 0.10;
        double maxTax15 = (45500 - 11950) * 0.15;
        double maxTax25 = (117450 - 45500) * 0.25;
        double maxTax28 = (190200 - 117450) * 0.28;
        double maxTax33 = (372950 - 190200) * 0.33;

        //Starts to calculate the tax
        if(taxIncome >= 0 && taxIncome <= 11950) {
          tax = taxIncome * 0.10;
        }

        else if(taxIncome >= 11951 && taxIncome <= 45500) {
          tax = ((taxIncome - 11950) * 0.15) + maxTax10;
        }

        else if(taxIncome >= 45501 && taxIncome <= 117450) {
          tax = ((taxIncome - 45500) * 0.25) + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 117451 && taxIncome <= 190200) {
          tax = ((taxIncome - 117450) * 0.28) + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 190201 && taxIncome <= 372950) {
          tax = ((taxIncome - 190200) * 0.33) + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        else if(taxIncome >= 372951) {
          tax = ((taxIncome - 372950) * 0.35) + maxTax33 + maxTax28 + maxTax25 + maxTax15 + maxTax10;
        }

        //If the user enters a negative number, the program will displays invalid
        else if(taxIncome < 0) {
          JOptionPane.showMessageDialog(null, 
            "Invalid taxable income. Please try again",
            "Invalid value", JOptionPane.ERROR_MESSAGE);
          break;
        }

        //Convert the final result into two decimal places
        finalTax = (int)(tax*100)/100.0;

        //Display the final result
        JOptionPane.showMessageDialog(null, 
          "Filing status: " + filingStatus +
          "\nTaxable income: " + taxIncome +
          "\nTax: " + finalTax,
          "Tax calculator", JOptionPane.INFORMATION_MESSAGE);

        //Exit the switch case statement
        break;
      }

      //Displays invalid when the user enters numbers other than 0, 1, 2 or 3
      default: {
        JOptionPane.showMessageDialog(null, 
          "Invalid filing status. Please try again.",
          "Invalid filing status", JOptionPane.ERROR_MESSAGE);
      }
    }

      //Asks the user whether to repeat the calculation or not
      option=JOptionPane.showConfirmDialog(null, "Calculate again?");
    }
  }
}
//End of program