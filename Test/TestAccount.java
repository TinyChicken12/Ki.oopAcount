import java.util.Date;

public class TestAcount {
    public static void main(String[] args) {
        Acount acount = new Acount();

        acount.setId(1122);
        acount.setBalance(20000);
        acount.setAnnualInterestRate(4.5);
        acount.setDateCreated();
        acount.withdraw(2500);
        acount.deposit(3000);

        System.out.println("Id: " + acount.getId());
        System.out.println("Balance: " + acount.getBalance());
        System.out.println("Date: " + acount.getDateCreated());
        System.out.println("MonthlyInterest: " + acount.getMonthlyInterest());
    }
}