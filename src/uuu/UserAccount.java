package uuu;
public class UserAccount extends Account{
    private int ID=0;

    private Payment payment;
    public  UserAccount(String usrename,String pass){
        super.username=usrename;
        super.pass=pass;
        ID++;
    }


    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        System.out.println( "UserAccount{" +
                "ID='"+ID+'\''+
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", email='" + email + '\'' +
                '}');
        return null;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
