package week1.day1;

public class Mobile {
public void makeCall() {
	String mobileModel="Iphone";
	float mobileWeight=2.1f;
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}
public void sendMsg() {
	boolean isFullCharged=true;
	int mobileCost = 20000;
	System.out.println(isFullCharged);
	System.out.println(mobileCost);
	 
}
public static void main(String[] args) {
	System.out.println("This is my mobile");
	Mobile obj=new Mobile();
	obj.makeCall();
	obj.sendMsg();
}
}
