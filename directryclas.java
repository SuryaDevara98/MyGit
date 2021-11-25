
import java.util.Scanner;
import java.util.TreeMap;

public class Class {
	
	TreeMap<String, String> data = new TreeMap<>();
	private String name;
	private String number;
	
	public Class(String name, String number) {
		this.name = name;
		this.number = number;
		
	}
	
	public String getNumber(String name) {
		
		
		String number = data.get(name);
		if(number != null) {
			return number;
		}
		return null;
		
	}
	
	public boolean getName(String number) {
		
		String name = data.get(number);
		if(name!=null) {
			return true;
		}
		
		return false;
	}
	 public boolean putNumber(String name , String number) {
		 
		  number =data.get(name);
		  name = data.get(number);
		  if (name == null || number == null) {
			  
			  data.put(name, number);
		  }
		  return true;
	 }
	 
	 public TreeMap print(TreeMap<String,String> treemap ) {
		 
		 
		return treemap;
		 
		 
		 
		 
	 }

}