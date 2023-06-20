import models.BankAccount;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
                //nome iniziale banca
                BankAccount.setBankName("Banca Sella");
                BankAccount b1 = new BankAccount("A0");
                BankAccount b2 = new BankAccount("A1");
                //operazioni deposito
                b1.deposit(1000);
                b2.deposit(500);
                //verifica informazioni BankAccounts
                b1.getAccountInfo();
                b2.getAccountInfo();
                //operazioni di prelievo
                b1.withDraw(1200);
                b1.withDraw(800);
                //verifica operazioni prelievo
                b1.getAccountInfo();
                //cambio nome banca
                BankAccount.setBankName("Banca Intesa San Paolo");
                //verifica nome banca cambiato per tutte le istanze di BankAccount
                b1.getAccountInfo();
                b2.getAccountInfo();
        }
}