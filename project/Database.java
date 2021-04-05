package bit.raushan.project;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[5];
    static{
        allAccounts[0] = new CityBankAccount("Raushan","Manabayeva",20000,"KZ01","1111" );
        allAccounts[1] = new CityBankAccount("Nazym","Zhylkybayeva",30000,"KZ02", "2222");
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev", 40000,"KZ03", "3333");
        allAccounts[3] = new NationalBankAccount("Akerke Akerke", 50000,"KZ04", "4444");
        allAccounts[4] = new NationalBankAccount("Akbope Akbope", 60000,"KZ05", "5555");

    }

}
