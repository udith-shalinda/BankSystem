import java.io.*;

class Customer implements Serializable{
	String name;
	int Id;
	int finalmoneyinbank;
	
	void setName(String name, int Id){
		this.name = name;
		this.Id = Id;
	}
	void setMoney(int finalmoneyinbank){
		this.finalmoneyinbank = finalmoneyinbank;
	}
}