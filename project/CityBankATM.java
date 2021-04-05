package bit.raushan.project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount [] bankAccount =  Database.allAccounts;
        System.out.println("введите номер счёта и пин код");
        String account = scanner.next();
        String pin = scanner.next();
        if (checkAccountAndPin(account, pin, bankAccount)) {
            if (checkAccountType(account, bankAccount) == 1){
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO EXIT");
                int choice = scanner.nextInt();

//использовать методы с udemy.lambda.StudentInfo
//                smallMenuChoiceSelector();
            }else {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO CHANGE PIN CODE");
                System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                System.out.println("PRESS [6] TO EXIT");
                int choice = scanner.nextInt();
                
                
            }
        }

    }



    static void withdrawal(int sum, String account, BankAccount [] accounts){
        for (BankAccount client: accounts) {
            if (client.getAccountNumber().equals(account)){
                client.creditBalance(sum);
            }
        }
    }

    static void smallMenuChoiceSelector(int choice, String account, BankAccount [] accounts){
        Scanner scanner = new Scanner(System.in);
        if (choice == 1){
            System.out.println("сколько снять?");
            int sum = scanner.nextInt();
            withdrawal(sum, account, accounts);
            //int sum = scanner.nextInt();
            //метод который вычтет из баланса введёггую сумму
        }else if (choice == 2){

        }else System.out.println("exit");
    }

    static int checkAccountType(String account, BankAccount [] bankAccounts){
        for (BankAccount client: bankAccounts) {
            if (client.accountData().equals("NationalBankAccount"))return 1;
            else return 2;
        }
        return 0;
    }

    static boolean checkAccountAndPin(String account, String pin, BankAccount [] bankAccounts){
        for (BankAccount client: bankAccounts) {
            if (client.getAccountNumber().equals(account)){
                if (client.getPinCode().equals(pin)){
                    return true;
                }
            }else return false;
        }
        return false;
    }

}
