package enumeration;

public enum Planets {
	Mercur(100000e8,12e12),Earth(1e9,1e12);
	
	public final double mRadius;
	private final double mWeight;
	
	private Planets(double pRadius,double pWeight) {
		mRadius = pRadius;
		mWeight = pWeight;
	}

	public double getRadius() {
		return mRadius;
	}

	public double getWeight() {
		return mWeight;
	}
	
	public void rotate() {
		System.out.println("Rotate:" + this.name());
	}
	
}
