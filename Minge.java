
public class Minge extends Joc {

	private int x;
	private int y;

	public Minge(String numeEchipa, int nrGoluri, int nrCornere, int nrOut, int x, int y) {
		super(numeEchipa, nrGoluri, nrCornere, nrOut);
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void suteaza() throws MyException {

		CoordinateGenerator a = new CoordinateGenerator();
		x = a.generateX();
		y = a.generateY();
		if (y == 50 || y == 0) {
			throw new MyException("Out");

		}
		if (y == 100 || y == 0) {
			if (y >= 20 && y <= 30)
				throw new MyException("Gol");
			else
				throw new MyException("Corner");
		}

	}

}
