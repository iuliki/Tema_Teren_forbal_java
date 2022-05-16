
public abstract class Joc {

	public String numeEchipa;
	public int nrGoluri;
	public int nrCornere;
	public int nrOut;

	public Joc(String numeEchipa, int nrGoluri, int nrCornere, int nrOut) {

		this.numeEchipa = numeEchipa;
		this.nrGoluri = nrGoluri;
		this.nrCornere = nrCornere;
		this.nrOut = nrOut;
	}

	@Override
	public String toString() {
		return "Joc [numeEchipa=" + numeEchipa + ", nrGoluri=" + nrGoluri + ", nrCornere=" + nrCornere + ", nrOut="
				+ nrOut + "]";
	}

	public void simuleaza() {
		CoordinateGenerator a = new CoordinateGenerator();
		Minge m = new Minge("Barca", 0, 0, 0, 2, 3);
		if( m.getX()==50 && m.getY()==25)
			Minge m = new Minge ("R",0,0,0,50,25);

	}

}
