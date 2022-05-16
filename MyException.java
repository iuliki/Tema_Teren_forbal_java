
public class MyException extends Exception {

	private int nrAruncari = 0;
	private String mesajDeEroare;

	public MyException(String mesajDeEroare) {
		this.mesajDeEroare = mesajDeEroare;
		nrAruncari++;
	}

	public int getNrAruncari() {
		return nrAruncari;
	}

}
