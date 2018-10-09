
public class Kotak {
	
	//ini atributnya :v
	private double panjang, lebar, luas, keliling	;

	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	public double getLuas() {
		luas = panjang * lebar;
		return luas;
	}

	public void setLuas(double luas) {
		this.luas = luas;
	}

	public double getKeliling() {
		return keliling;
	}

	public void setKeliling(double keliling) {
		keliling = lebar + panjang + lebar + panjang;
		this.keliling = keliling;
	}
	
}
