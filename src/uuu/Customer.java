package uuu;
import java.util.Scanner;

public class Customer {
Account account;
private  int ID=0;
Services services;
SinUp sinUp;
signin signin;
boolean signed=false;
 static double  payed;


    public Customer() {
        ID++;

    }

    public void addRefund( Admin admin){

            admin.refund(this);

    }
    public void search(String name){
        if(name.equals("landline")){
            System.out.println(DataBase.landline);

        } else if(name.equals("mobile")){
            System.out.println(DataBase.mobile);

        }else  if(name.equals("donation")){
            System.out.println(DataBase.donation);

        }else  if(name.equals("payment")){
            System.out.println(DataBase.payment);

        }

    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public  int getID() {
        return ID;
    }

    public  void setID(int ID) {
        this.ID = ID;
    }
    public void useService(String service){
        this.services=services;


    }
    public double pay(Services services){

        if(signed==true) {
            this.services = services;

            System.out.println("Enter payment method");
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();

            if(s.equals("wallet")){
                System.out.println("You now pay using wallet");
                getAccount().setPayment(new Wallet());}
            else if(s.equals("cache")){
                    System.out.println("You now pay using Cache");

                getAccount().setPayment(new Cache());}

            else{
                System.out.println("You now pay using CreditCard");
                getAccount().setPayment(new CreditCard());}




            getAccount().getPayment().setCost(services.getCost());

            System.out.println(getAccount().getPayment().getCost());

            Payment payment = getAccount().getPayment();

            System.out.println(services.toString());

            for (int i = 0; i < specificDiscound.discounds.size(); i++) {


                    if (services.toString().equals(specificDiscound.discounds.get(i).getServices().toString())) {
                        specificDiscound.discounds.get(i).setPayment(payment);
                        payment =specificDiscound.discounds.get(i);
                        System.out.println(payment.cost());

                    } else
                        System.out.println("This discound not for this services ");


//
            }
             if(Admin.Overall) {
                    Admin.discound.setPayment(payment);
                    payment=Admin.discound;
                 System.out.println("OverAll :"+payment.cost());
                }
            if(s.equals("wallet")){
                if(account.Wallet>payment.cost())
                    account.Wallet=account.Wallet-payment.cost();
            }
            else {
                System.out.println("u dont have enoght money");
            }
            payed=payment.cost();
            return payment.cost();


        }

        else{
            System.out.println(" You have to Sign in first ");
        }
        return 0;

        }


    public void sginup(String username,String pass){
        sinUp=new SinUp(username,pass);
        account=sinUp.getAccount();

    }
    public void signin(String username,String pass){
        signin=new signin(username,pass);
        if(signin.isConditions()) {
            System.out.println("sign in successfully");
            signed = true;
        }
        else
            signed=false;


    }

    public boolean isHasAccount() {
        return signed;
    }

    public void setHasAccount(boolean hasAccount) {
        this.signed = hasAccount;
    }
    public void update(){
        System.out.println("your refund is accept");
    }

    public void refund(Admin admin,Services service){


        admin.Subscrib(this,service);



    }


}
