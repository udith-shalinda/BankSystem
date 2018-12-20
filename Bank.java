import java.util.*;
import java.io.*;
class Bank{
	ArrayList<Customer> customerarray = new ArrayList();
	static int count=0;
	customerQueue customerque = new customerQueue();
	customerQueue customerque2 = new customerQueue();
	
	public static void main(String []args){
		Bank bank = new Bank();
		
		bank.addcustomerstolist();
		bank.addtoque();
		bank.customerque.display();
		bank.customerque2.display();
		Cashier cashier = new Cashier(bank.customerque);
		cashier.dotransfer();
	}
	
	void addcustomerstolist(){
		try{
			File file = new File("customers.txt");
			Scanner scanfile = new Scanner(file);
			
			while(scanfile.hasNextLine()){
				Customer customer = new Customer();
				customer.setName(scanfile.next(),scanfile.nextInt());
				customerarray.add(customer);
			}
		}catch(Exception e){
			System.out.println("Exception");
		}
		
	}
	void addtoque(){
		
		FrontOfficer frontofficer = new FrontOfficer();
		customerque.setquesize(10);
		
		while(count< customerarray.size()){
			customerque.insertcustomer(customerarray.get(count));
			customerque.addObserver(frontofficer);
			count++;
			System.out.println(customerque.countObservers());
			if(count==10){
				addtoque2();
				System.exit(0);
			}
				
		}
		
	}
	void addtoque2(){
	
		FrontOfficer frontofficer = new FrontOfficer();
		customerque2.setquesize(4);
		
		while(count< customerarray.size()){
			customerque2.insertcustomer(customerarray.get(count));
			customerque2.addObserver(frontofficer);
			count++;	
		}
	}
}
















