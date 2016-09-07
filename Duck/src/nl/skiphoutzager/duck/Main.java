package nl.skiphoutzager.duck;

public class Main {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.fly();
		duck.setFlyBehavior(new GlideFlying());
		duck.fly();
	}

}
