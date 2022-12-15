package uuu;

public class main {

	public static void main(String[] args) {
		
		 Admin admin=new Admin();
	        admin.InsertServices();
//	        Discound discound= admin.createOverallDiscound(15);
//	        Customer customer=new Customer("Abdeltwab","01289038072");
	        Discound discound1=new specificDiscound(45,new EtisalatInternetPayment());
//	        Discound discound2=new specificDiscound(44,new VodafoneInternetPayment());//EtisalatInternetPayment
//	        customer.pay(discound2);
	          Customer customer=new Customer();
	          customer.sginup("Abdeltwab","123");
	          customer.signin("Abdeltwab","123");
	     System.out.println("wallet before payment");
	          customer.getAccount().Wallet=50;

	          customer.pay(new EtisalatInternetPayment());
	     System.out.println("wallet after payment");
	     System.out.println(          customer.getAccount().Wallet
	);

	          customer.refund(admin,customer.getServices());
	          admin.DisplayRefund();
	          admin.accepted(1);
	          admin.DisplayRefund();
	     System.out.println("wallet after refund");
	     System.out.println(          customer.getAccount().Wallet
	     );
	          customer.search("mobile");

		
	}

}
