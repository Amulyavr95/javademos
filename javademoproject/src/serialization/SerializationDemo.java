package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	public static void main(String[] args) {
//		Employee emp=new Employee(1, "mark", 1500, 1234);
//		System.out.println(emp);
//		Employee emp1=new Employee(2, "john", 1800, 1235);
//		System.out.println(emp1);
		
		serializationsimplified();
		deserialization();
	}

	private static void deserialization() {
		try( FileInputStream fis = new FileInputStream("C:\\Users\\Amulya VR\\objectstreams\\emp.scr");
				 ObjectInputStream ois=new ObjectInputStream(fis);) {
				Employee emp= (Employee) ois.readObject();
				System.out.println("object Desreialized"+emp);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}

	private static void serialization() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			 fos = new FileOutputStream("C:\\Users\\Amulya VR\\objectstreams\\emp.scr");
			 oos=new ObjectOutputStream(fos);
			Employee emp=new Employee(1, "mark", 1500, "A1234");
			oos.writeObject(emp);
			System.out.println("object sreialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void serializationsimplified() {
		
		try( FileOutputStream fos = new FileOutputStream("C:\\Users\\Amulya VR\\objectstreams\\emp.scr");
			 ObjectOutputStream oos=new ObjectOutputStream(fos);) {
			Employee emp=new Employee(1, "mark", 1500, "A1234");
			oos.writeObject(emp);
			System.out.println("object sreialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Employee implements Serializable{
	int id;
	String name;
	double salary;
	transient String aadharno;
	
	Employee(int id,String name,double salary,String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
		
	}
	public String toString() {
		return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadharno;
	}		
	
}