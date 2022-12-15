package uuu;
import java.util.*;

public class Admin {
    static Discound   discound;
    Account account;
    DataBase dataBase;
    static boolean Overall=false;
    ArrayList<Customer> list = new ArrayList();
    Map<Customer,Services> refunds=new HashMap<Customer,Services>();
    Vector<Integer> amount=new Vector<Integer>();


    public Admin(String username, String pass) {
        account = new AdminAccount(username, pass);


    }
    public void InsertServices(){
        dataBase.donation.add("CancerHospital");
        dataBase.donation.add("NGOs");
        dataBase.donation.add("schools");
        dataBase.landline.add("monthly");
        dataBase.landline.add("QuarterReceipt");
        dataBase.mobile.add("Orange");
        dataBase.mobile.add("Vodafone");
        dataBase.mobile.add("Etisalat");
        dataBase.mobile.add("WE");
        dataBase.payment.add("Orange");
        dataBase.payment.add("Vodafone");
        dataBase.payment.add("We");
        dataBase.payment.add("Etisalat");
    }
    public Admin(){}
    public void createSpecificDis(Services services){

        specificDiscound.discounds.add(new specificDiscound(15,services));


    }

    public void refund(Customer customer) {
        list.add(customer);
    }

    public void DisplayRefund() {
        for (Customer customer1 : list) {

            customer1.account.toString();

        }
    }

    public void accepted(int id) {
        if(id==0){
            System.out.println("Zero index is not found");
        }
        else {

            boolean flag=false;
            for (int i=0;i<list.size();i++) {
                if (id == (list.get(i).getID())){
                    this.Notify(id);
                    list.get(i).getAccount().Wallet+=list.get(i).payed;

                    list.remove(id-1);

                    flag=true;
                }


            }
            if(flag==false)
                System.out.println("this inedex not exist");


        }
    }

    public Discound createOverallDiscound(double discoundValue) {
        discound=OverallDiscound.getOverallDiscound(discoundValue);
        Overall=true;


        return discound;




    }
    public void Subscrib(Customer customer,Services service){
        refunds.put(customer,service);
        list.add(customer);
    }
    public void UnSubscrib(Customer customer){
       if( refunds.containsKey(customer))
        refunds.remove(customer);
       else
           System.out.println("No Customer");
    }
    public void Notify(int x){
        boolean flag=false;
        for (Map.Entry<Customer,Services> me:refunds.entrySet()){
            System.out.println(me.getKey().getID());
            if(me.getKey().getID()==x){
                me.getKey().update();
                flag=true;
                        break;
            }


        }
        if(flag==false){
            System.out.println("this refund not exist");
        }


        }
}






