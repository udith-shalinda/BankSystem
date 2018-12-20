import java.util.*;
import java.io.*;

class Cashier{
	customerQueue queue1;
	
	Cashier(customerQueue queue){
		this.queue1 = queue;
	}
	void dotransfer(){
		Scanner scan = new Scanner(System.in);
		for(Customer cust : queue1.customerque){
			System.out.println("Enter the transfer");
			cust.finalmoneyinbank = scan.nextInt();
			writeobject(cust);
		}
	}
	void writeobject(Customer customer){
		try{
			FileOutputStream fileout = new FileOutputStream("Result.txt");
			ObjectOutputStream objectout = new ObjectOutputStream(fileout);
			objectout.writeObject(customer);
			objectout.close();
			System.out.println("copied");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}