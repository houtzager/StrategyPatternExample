package nl.skiphoutzager.duck;

public class Duck {
	private FlyBehavior flyBehavior = new IntensiveFlying();

	public void fly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
