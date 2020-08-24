package drezgic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUD {

	
	//UNOŠENJE U BAZU
	public static void create(Umjetnik umjetnik) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("insert into umjetnik "
					+ " (ime,zanr,podzanr,mjesto,datumpocetka,datumkraja) "
					+ " values (?,?,?,?,?,?)");
			izraz.setString(1, umjetnik.getIme());
			izraz.setString(2, umjetnik.getZanr());
			izraz.setString(3, umjetnik.getPodzanr());
			izraz.setString(4, umjetnik.getMjesto());
			izraz.setString(5, umjetnik.getDatumpocetka());
			izraz.setString(6, umjetnik.getDatumkraja());
			
			izraz.executeUpdate();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	
	//LISTA
	public static List<Umjetnik> read(){
		List<Umjetnik> umjetnici = new ArrayList<>();
		
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"select * from umjetnik order by datumpocetka asc");
			ResultSet rs = izraz.executeQuery();
			while(rs.next()) {
				umjetnici.add(
						new Umjetnik(
								rs.getInt("sifra"), 
								rs.getString("ime"), 
								rs.getString("zanr"), 
								rs.getString("podzanr"), 
								rs.getString("mjesto"),
								rs.getString("datumpocetka"),
								rs.getString("datumkraja")
								)
						);
			}
			rs.close();
			izraz.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return umjetnici;
	}
	
	//IZMJENE
	public static void update(Umjetnik umjetnik) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"update umjetnik set "
					+ " ime=?, "
					+ " zanr=?, "
					+ " podzanr=?, "
					+ " mjesto=?, "
					+ " datumpocetka=?, "
					+ " datumkraja=? "
					+ " where sifra=? ");
			izraz.setString(1, umjetnik.getIme());
			izraz.setString(2, umjetnik.getZanr());
			izraz.setString(3, umjetnik.getPodzanr());
			izraz.setString(4, umjetnik.getMjesto());
			izraz.setString(5, umjetnik.getDatumpocetka());
			izraz.setString(6, umjetnik.getDatumkraja());
			izraz.setInt(7, umjetnik.getSifra());
			
			izraz.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//BRISANJE
	public static void delete(int sifra) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"delete from umjetnik  "
					+ " where sifra=? ");
			
			izraz.setInt(1, sifra);
			
			izraz.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Umjetnik getUmjetnik(int redniBroj) {
		int rb=0;
		for(Umjetnik u : read()) {
			if(++rb==redniBroj) {
				return u;
			}
		}
		return null;
	}
}
