
package file;

import java.io.*;

public class Bt3_Car implements Serializable {
	
	public Bt3_Car() {
		
	}
	
	String name;
	String engine;
	int seats;
	String productionDate;
	
	
	
	public Bt3_Car(String name, String engine, int seats, String productionDate) {
		super();
		this.name = name;
		this.engine = engine;
		this.seats = seats;
		this.productionDate = productionDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", engine=" + engine + ", seats=" + seats + ", productionDate=" + productionDate;
				
	}
	
	
	
}
public class bai2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Bt3_Car c = new Bt3_Car("ASAMA\n", "2 Bàn đạp\n", 2, "28-2-2017");
		
		
		FileOutputStream fos = new FileOutputStream("D:\\Car.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(c);
	    
	   
	    FileInputStream fis = new FileInputStream("D:\\Car.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Bt3_Car b = (Bt3_Car)ois.readObject(); 
	  
	    System.out.print(b.toString());
	
	    
	    oos.close();
	    ois.close();
	}

}

