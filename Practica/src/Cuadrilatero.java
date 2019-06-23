
public class Cuadrilatero {
	private float l1;
	private float l2;
	
	public Cuadrilatero(float l1, float l2) {
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public Cuadrilatero(float l1) {
		this.l1 = this.l2 = l1;
	}
	
	public float getArea() {	
		return l1*l2;
	}
	
	public float getPerimetro() {
		return 2*(l1+l2);
	}

}
