class Area {
	int radius;
	final float pi = 3.14f;
	
	float calcArea(int r) {
		return pi*r*r;
	}
	
	public static void main(String a[]) {
		Area ar = new Area();
		System.out.println("The area if a circle is "+ ar.calcArea(10));
	}
	
}