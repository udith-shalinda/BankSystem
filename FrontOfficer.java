import java.util.*;

class FrontOfficer implements Observer{
	public void update(Observable o,Object arg){
		Bank bank = new Bank();
		if(arg == "went_over"){
			System.out.println("went over the limit");
			bank.addtoque2();
		}else{
			System.out.println("Don't know how to handle");
		}
	}
	
}