package innerclasses;

public class AnonDemo {
	public static void main(String[] args) {
		PrinterConnection con=PrinterDriver.getConnection();
		con.print();
	}
}

class PrinterDriver{
	static PrinterConnection getConnection() {
		
			PrinterConnection con=new PrinterConnection() {

				@Override
				public void print() {
					System.out.println("printing");
					
				}
				
			};
			return con;
			
		}
	}


interface PrinterConnection{
	void print();
}