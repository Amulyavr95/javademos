package javademoproject;

public class typecastingdemo {
  public static void main(String[] args) {
	int a= 10;
	byte b = 100;
	System.out.println(b);
	
	b=(byte) a;
	System.out.println(b);
	
	char c='a';
	int x=c;
	System.out.println(x);
	
	int i=112;
	char y= (char) i;
	System.out.println(y);
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	
  }
}
