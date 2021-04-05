package bit.raushan.project;

public class NationalBankAccount implements BankAccount {
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

//    public String getFullName() {
//
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    @Override
    public String getAccountNumber() {  return null;   }

    @Override
    public String getPinCode() {
        return null;
    }

    @Override
    public void setPinCode(String pinCode) { this.pinCode = pinCode; }

    @Override
    public int totalBalance() {  return balance;  }

    @Override
    public void creditBalance(int credit) {this.balance = balance - credit;  }

    @Override
    public void debitBalance(int debit) {System.out.println("добавили денег");    }

    @Override
    public String accountData() {
        return "NationalBankAccount";
    }
}
