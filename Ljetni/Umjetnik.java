package drezgic.ljetnizadatak;

public class Umjetnik {

	private int sifra;
	private String ime;
	private String zanr;
	private String podzanr;
	private String mjesto;
	private String datumpocetka;
	private String datumkraja;
	
	
	public Umjetnik() {
	}
	
	
	public Umjetnik(int sifra, String ime, String zanr, String podzanr, String mjesto, String datumpocetka,
			String datumkraja) {
		this.sifra = sifra;
		this.ime = ime;
		this.zanr = zanr;
		this.podzanr = podzanr;
		this.mjesto = mjesto;
		this.datumpocetka = datumpocetka;
		this.datumkraja = datumkraja;
	}
	

	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getZanr() {
		return zanr;
	}
	public void setZanr(String zanr) {
		this.zanr = zanr;
	}
	public String getPodzanr() {
		return podzanr;
	}
	public void setPodzanr(String podzanr) {
		this.podzanr = podzanr;
	}
	public String getMjesto() {
		return mjesto;
	}
	public void setMjesto(String mjesto) {
		this.mjesto = mjesto;
	}
	public String getDatumpocetka() {
		return datumpocetka;
	}
	public void setDatumpocetka(String datumpocetka) {
		this.datumpocetka = datumpocetka;
	}
	public String getDatumkraja() {
		return datumkraja;
	}
	public void setDatumkraja(String datumkraja) {
		this.datumkraja = datumkraja;
	}
	
	@Override
	public String toString() {
		return datumpocetka + " " + ime;
	}
}
