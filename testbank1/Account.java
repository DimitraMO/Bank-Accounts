package testbank1;

public class Account {

    private int code;
    private double balance;

    public Account(int code) {
        this.code = code;
        this.balance = 0;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCode() {
        return code;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "code=" + code + ", balance=" + balance + '}';
    }

    /*ΑΝΑΛΗΨΗ -- ΓΙΑ ΝΑ ΚΑΝΩ ΜΙΑ ΑΝΑΛΗΨΗ ΘΑ ΠΡΕΠΕΙ ΑΡΧΙΚΑ ΝΑ ΔΩΣΩ ΤΟ ΠΟΣΟ ΠΟΥ ΘΕΛΩ ΝΑ ΠΑΡΩ(ΑΥΤΟ ΕΙΝΑΙ ΜΕΘΟΔΟΣ ΤΗΣ ΚΥΡΙΑΣ ΚΛΑΣΗΣ)
    ΜΕΤΑ ΘΑ ΠΡΕΠΕΙ ΝΑ ΔΗΜΙΟΥΡΓΗΣΩ ΜΙΑ ΜΕΘΟΔΟ ΕΔΩ ΣΕ ΑΥΤΗΝ ΤΗΝ ΚΛΑΣΗ Η ΟΠΟΙΑ ΕΙΝΑΙ ΜΙΑ ΔΟΜΗ ΕΛΕΓΧΟΥ ΣΤΗΝ ΟΥΣΙΑ
    Η ΟΠΟΙΑ ΘΑ ΕΛΕΓΧΕΙ ΑΝ ΤΟ ΠΟΣΟ ΠΟΥ ΘΕΛΩ ΝΑ ΑΝΑΛΗΨΩ ΕΙΝΑΙ ΤΟ ΚΑΤΑΛΛΗΛΟ ΜΕ ΒΑΣΗ ΤΟ ΥΠΟΛΟΙΠΟ ΤΟΥ ΛΟΓΑΡΙΑΣΜΟΥ*/
    public boolean withdraw(double money) {
        if (money == balance) {
            balance -= money;
            return true;
        } else if (money > balance) {
            return false;
        } else {
            return false;
        }
    }

    public double deposit(double money) {
        balance += money;
        return balance;
    }

}
