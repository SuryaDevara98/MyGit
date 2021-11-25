public class czae
{
	String name;
	String carname;
	double price;
	
	Car(String name,String carname,double price)
	{
		this.name=name;
		this.carname=carname;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * @Override public String toString() { return "Car [name=" + name +
	 * ", carname=" + carname + ", price=" + price + "]"; }
	 */
	

	  @Override
	  public String toString() { 
		  
	  return "[Name is"+name+" CarName is "+carname+" Price is "+price+"]"; 
	  }
}

public class CarImplementation {
	
	public double sumOfPrices(List<Car> carList)
	{
		double d=0;
		for(Car c:carList)
		{
			d=d+c.getPrice();
		}
		return d;
	}
	public List<String> printName(List<Car> carList)
	{
		ArrayList<String> s=new ArrayList<>();
		for(Car c:carList)
		{
			if(c.getPrice()>25000)
			{
				s.add(c.getCarname());
			}
		}
		//List s=carList.stream().filter(x->x.getPrice()>25000).filter(x->x.getName()).collect(Collectors.toList());
		
		return s;
	}
	public double maxPrice(List<Car> carList)
	{
		double d=0;
		for(Car c:carList)
		{
			if(d<c.getPrice())
			{
				d=c.getPrice();
			}
		}
		return d;
	}
}
public class CarTest {

	public static void main(String[] args) {
		
		Car c1=new Car("Brahmi","Rangerover",70000);
		Car c2=new Car("Sai","Maruthi",50000);
		Car c3=new Car("Sasi","Nano",10000);
		
		List<Car> c=new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		CarImplementation ci=new CarImplementation();
		double d=ci.sumOfPrices(c);
		
		List<String> l=new ArrayList<>();
		l=ci.printName(c);
		
		double m=ci.maxPrice(c);
		
		System.out.println(d+"\n"+l+"\n"+m);
		
		/*
		 * for(Car o:c) { //System.out.println(o); String s=o.getName();
		 * System.out.println(s); }
		 */
	}
}