package object;

public class ClassOrderTest {

	Long orderId;
	String Id;
	String date;
	String name;
	String ProductId;
	String address;
	
	public static void main(String[] args) {
		
		ClassOrderTest order = new ClassOrderTest();
		order.orderId = 202002110001L;
		order.Id = "abc123";
		order.date = "2020년 2월 11일";
		order.name = "홍길동";
		order.ProductId = "PD0345-12";
		order.address = "SEOUL";
		
		System.out.println(order.orderId);
		System.out.println(order.Id);
		System.out.println(order.date);
		System.out.println(order.name);
		System.out.println(order.ProductId);
		System.out.println(order.address);
		
	}
	
}
