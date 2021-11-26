package chapter12_1;

public class ThreeDPrinter {
	Object material;
	
	public void addMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
	
	@Override 
	public String toString() {
		return material.toString();
	}
}
