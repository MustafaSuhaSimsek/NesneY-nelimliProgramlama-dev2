
package TestAccount;
import odevbanka.Account;

public class testAccount {
    
    public static void main(String[] args) {
        
        Account hesap = new Account(1122, 20000.0);
        hesap.setAnnualInterestRate(4.5);
        hesap.withdraw(2500.0);
        hesap.deposit(3000.0);
        System.out.println("HESAP BILGILERI");
        System.out.println("Guncel Bakiye: " + hesap.getBalance() + " TL");
        System.out.println("Aylik Faiz Tutari: " + hesap.getMonthlyInterest() + " TL");
        System.out.println("Hesabin acilis tarihi: " + hesap.getDateCreated());
    }
    
}
