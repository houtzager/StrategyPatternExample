package nl.skiphoutzager.duck;

public class IntensiveFlying implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Wow. Flying is soo intensive!");
	}

}
