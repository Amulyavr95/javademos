package enumsdemo;
public class EnumsDemo {
	public static void main(String[] args) {
		PaymentType pt = PaymentType.DEBITCARD;
		System.out.println(pt);
		PaymentType []values=PaymentType.values();
		for(PaymentType paymenttype : values ) {
			System.out.println(paymenttype);
			System.out.println(paymenttype.ordinal());
			System.out.println(paymenttype.getFee ());
		}
	}
}

enum PaymentType{
	DEBITCARD(5),
	CREDITCARD(6),
	CASH(7);
	
	int fee;
	PaymentType(int fee){
		this.fee=fee;
	}
	
	public int getFee() {
		return fee;
	}
}
//class PaymentT{
//	static final PaymentT DBITCARD =new PaymentT();
//}