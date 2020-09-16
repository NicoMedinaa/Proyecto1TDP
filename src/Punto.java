
public class Punto {

	private int X;
	private int Y;
	
	public Punto(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	
	public void asignarX(int X) {
		this.X = X;
	}
	
	public void asignarY(int Y) {
		this.Y = Y;
	}
	
	public int valorX() {
		return X;
	}
	
	public int valorY() {
		return Y;
	}
	
}
