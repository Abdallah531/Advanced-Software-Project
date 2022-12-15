package uuu;
public abstract class Account {
    String username;
    String pass;
    String email;
    Payment payment;
    public static double Wallet=0;

    public static double getWallet() {
        return Wallet;
    }

    public static void setWallet(double wallet) {
        Wallet = wallet;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
