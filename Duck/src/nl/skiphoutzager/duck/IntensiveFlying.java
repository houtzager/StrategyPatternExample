package nl.skiphoutzager.duck;

public class IntensiveFlying implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("IntensiveFlying::fly has been called!");
	}

}
