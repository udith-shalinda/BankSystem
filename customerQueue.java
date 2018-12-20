import java.util.*;
class customerQueue extends Observable{
	int queueSize;
	static int rear = -1;
	
	void setquesize(int queueSize){
		this.queueSize = queueSize;
	}
	
	ArrayList<Customer> customerque = new ArrayList();
	
	
	void insertcustomer(Customer customer){
		if(rear<queueSize-1){
			customerque.add(customer);
			rear++;
		}else{
			setChanged();
			notifyObservers("went_over");
			System.out.println("queue is full");
		}
		
		
	}
	void display(){
		for(Customer customer : customerque){
			if(customer != null){
				System.out.println(customer.name + " "+ customer.Id+" " +queueSize);
			}
		}
	}
	
}