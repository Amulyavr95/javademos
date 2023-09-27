package functionalprogramming;
public class FunctionalProgramming {
	public static void main(String[] args) {
		
//				Calculator cal=new Calculator();
//				cal.calculate(10, 10);
//				
//		ICalculator mul=new ICalculator(){
//
//			@Override
//			public int calculate(int a, int b) {
//			int	r=a*b;
//			System.out.println(r);
//				return r;
//			}
//		};
//		mul.calculate(5, 4);
		
		
		
		ICalculator divider=(a,b)->{return a/b;};
		System.out.println(divider.calculate(10, 5));
		
		sum add=(a,b)->{return a+b;};
		System.out.println(add.sum(1, 2));
		
	}
}

interface ICalculator{
	int calculate(int a,int b);
}

interface sum{
	int sum(int a,int b);
}

//class Calculator implements ICalculator{
//	public int calculate(int a,int b) {
//		int result=a+b;
//		System.out.println(result);
//		return result;
//	}
//}