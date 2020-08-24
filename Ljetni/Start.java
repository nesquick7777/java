package drezgic.ljetnizadatak;

import java.awt.Desktop;
import java.net.URI;
import java.util.List;


import javax.swing.JOptionPane;

public class Start {
	public Start() {
		izbornik();
		Baza.zatvoriVezu();
	}
	
	private void izbornik() {
		System.out.println("-------------------------------------");
		System.out.println("| 1. Izlistaj sve umjetnike iz baze |");
		System.out.println("| 2. Unesi novog umjetnika          |");
		System.out.println("| 3. Promjeni umjetnika             |");
		System.out.println("| 4. Obriši umjetnika               |");
		System.out.println("| 5. ERA dijagram                   |");
		System.out.println("| 6  GitHub kod                     |");
		System.out.println("| 7. Izlaz iz programa              |");
		System.out.println("-------------------------------------");
		izvedi();
	}
	
	
	private void izvedi() {
		switch (Pomocno.ucitajBroj("Odaberite broj za željenu akciju")) {
		case 1:
			izlistajUmjetnike();
			izbornik();
			break;
		case 2:
			CRUD.create(new Umjetnik(1,
					Pomocno.ucitajString("Unesi ime"),
					Pomocno.ucitajString("Unesi zanr"),
					Pomocno.ucitajString("Unesi podzanr"),
					Pomocno.ucitajString("Unesi mjesto"),
					Pomocno.ucitajString("Unesi datumpocetka"),
					Pomocno.ucitajString("Unesi datumkraja")));
			izbornik();
			break;
		case 3:
			promjeniUmjetnika();
			izbornik();
			break;
		case 4:
			obrisiUmjetnika();
			izbornik();
			break;
		case 5:
			gitHubKod();
			izbornik();
			break;
		case 6:
			eraDijagram();
			izbornik();
			break;
		default:
			break;
		}
		
	}
	
	private void obrisiUmjetnika() {
		Umjetnik umjetnik = odaberiUmjetnika("Unesi redni broj osobe koju želite brisati");
		if(umjetnik==null) {
			JOptionPane.showMessageDialog(null, "Neispravan redni broj");
			return;
		}
		CRUD.delete(umjetnik.getSifra());
	}

	private void promjeniUmjetnika() {
		Umjetnik umjetnik = odaberiUmjetnika("Unesi redni broj osobe koju želite mjenjati");
		if(umjetnik==null) {
			JOptionPane.showMessageDialog(null, "Neispravan redni broj");
			return;
		}
		umjetnik.setIme(Pomocno.ucitajString("Promjeni ime", umjetnik.getIme()));
		umjetnik.setZanr(Pomocno.ucitajString("Promjeni zanr", umjetnik.getZanr()));
		umjetnik.setPodzanr(Pomocno.ucitajString("Promjeni podzanr", umjetnik.getPodzanr()));
		umjetnik.setMjesto(Pomocno.ucitajString("Promjeni mjesto", umjetnik.getMjesto()));
		umjetnik.setDatumpocetka(Pomocno.ucitajString("Promjeni datumpocetka", umjetnik.getDatumpocetka()));
		umjetnik.setDatumkraja(Pomocno.ucitajString("Promjeni datumkraja", umjetnik.getDatumkraja()));
		CRUD.update(umjetnik);
	}
	
	private Umjetnik odaberiUmjetnika(String poruka) {
		izlistajUmjetnike();
		int redniBroj=Pomocno.ucitajBroj(poruka);
		return CRUD.getUmjetnik(redniBroj);
	}

	private void izlistajUmjetnike() {
		List<Umjetnik> umjetnici = CRUD.read();
		String redniBroj;
		for(int i=0;i<umjetnici.size();i++) {
			redniBroj=Pomocno.vodecePraznine(umjetnici.size())+(i+1);
			redniBroj=redniBroj.substring(redniBroj.length()-Pomocno.brojZnamenki(umjetnici.size()));
			System.out.println(redniBroj + ". " + umjetnici.get(i));
		}
		}
	
	
		private void gitHubKod() {

		adresa("https://github.com/nesquick7777/java/tree/master/Ljetni");

		}

		private void eraDijagram() {

		adresa("https://github.com/nesquick7777/hellojp22/blob/master/era.jpg");

		}
		
		public static void adresa(String url) {

			try {
				Desktop desktop = java.awt.Desktop.getDesktop();
				URI goTo = new URI(url);
				desktop.browse(goTo);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		
public static void main(String[] args) {
	new Start();
}
}
