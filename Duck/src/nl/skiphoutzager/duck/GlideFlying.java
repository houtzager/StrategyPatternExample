package nl.skiphoutzager.duck;

public class GlideFlying implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("GlideFlying::fly has been called!");
	}

}
