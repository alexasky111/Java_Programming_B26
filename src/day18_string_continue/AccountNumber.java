package day18_string_continue;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        /*
        ask the user enter an account number and check if the account number is
valid. Accounts are valid if:
handle empty inputs. If there is an empty input, do not check anything
else and print: "Empty input given"
- If the account number begins with a "2" the account number should
be 7 characters long
Print: "Valid 7-digit account number"
Otherwise: "Invalid 7-digit account number"
- If the account number begins with a "5" the account number should
be 10 characters long
Print: "Valid 5-digit account number"
Otherwise: "Invalid 5-digit account number"
â If the account number does not begin with a 2 or a 5 OR the
account number lengths do not meet the expected results print âInvalid
account numberâ
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your account number: ");
        String accountNum = input.next();
        boolean isEmpty = accountNum.isEmpty();
        boolean isBlank = accountNum.isBlank();

        String result = "";

        if (!isEmpty && !isBlank) {
            if (accountNum.startsWith("2") && accountNum.length() == 7) {
                result = accountNum + "\nValid 7-digit account number";
            } else if (accountNum.startsWith("5") && accountNum.length() == 10) {
                result = accountNum + "\nValid 5-digit account number";
            }
        } else {
            if (accountNum.length() < 7) {
                result = accountNum + " Invalid 7-digit account number";
            } else if (accountNum.length() < 10) {
                result = accountNum + "Invalid 10-digit account number";
            } else {
                if (isEmpty && isBlank) {
                    System.out.println(accountNum + " Invalid account number");
                }
            }
        }

                System.out.println(result);


            }
        }
