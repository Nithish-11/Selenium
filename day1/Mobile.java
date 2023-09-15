package week.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("Hii Everyone");
	}
public void document() {
	System.out.println("send this document into pdf ");
}
public void makeCall() {
	System.out.println("Call me in Whatsapp");
}
public void makeVideocall() {
	System.out.println("Make a video call");
}
public void takePhoto() {
	System.out.println("Take a photo");
}
		
public static void main(String[] args) {
	Mobile lgg8x = new Mobile();
	lgg8x.sendMessage();
	lgg8x.document();
	lgg8x.makeCall();
	lgg8x.makeVideocall();
	lgg8x.takePhoto();
}

}
