package day06_arithmetic__operators;

public class SalaryCalculator {

    /*
    create a class SalaryCalculator
add a main method
declare and assign these variables:

   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)

Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
     */

    // TODO: Unclear Do we have to count totalTax ourselves?? ASK THE GROUP/SAIM

    public static void main(String[] args) {

        double salary = 1_000_115;
        double stateTaxRate = 0.07;
        double federalTax = 0.24;
        double totalTax = (stateTaxRate+federalTax);
        double salaryAfterAllTaxes = (salary-(stateTaxRate+federalTax));

        System.out.println(stateTaxRate+", "+federalTax+", $"+salary+", $"+((salary*stateTaxRate)/100)+", $"+((salary*federalTax)/100)+", "+totalTax+", $"+salaryAfterAllTaxes);



    }
}
