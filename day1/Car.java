package week.day1;

public class Car {
	public void applyGear() {
		System.out.println("Put first Gear");
	}
public void switchOnAC(){
	System.out.println("Turn on AC into number 4");
}
public void applyAcclerate() {
	System.out.println("Press Acclerate");
}
public void putGear() {
	System.out.println("put first gear to move a care");
}
public void turnOnmusic() {
    System.out.println("Play Ilayaraja music");
}
public void putHandbreak() {
	System.out.println("To stop a car");
}
public static void main(String[] args) {
	Car benz = new Car();
	benz.applyGear();
	benz.switchOnAC();
	benz.applyAcclerate();
	benz.putGear();
	benz.turnOnmusic();
	benz.putHandbreak();
}
}
