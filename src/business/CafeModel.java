package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import fileCreatorsGnodtke.ConcreteCsvReaderCreator;
import fileCreatorsGnodtke.ReaderCreatorGnodtke;
import fileCreatorsGnodtke.ReaderProductGnodtke;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import ownUtil.MeldungsfensterAnzeiger;

public class CafeModel {
	private Cafe cafe;

	public void leseAusCsvDatei(String typ) throws IOException {
		ReaderCreatorGnodtke rc = new ConcreteCsvReaderCreator();
		ReaderProductGnodtke reader = rc.factoryMethod(typ);
		
		String[] zeile = reader.leseAusDatei();
		// this.cafe = new Cafe(zeile[0], Float.parseFloat(zeile[1]),
		// Float.parseFloat(zeile[2]), zeile[3], zeile[4].split("_"))

		this.cafe = new Cafe(zeile[0], zeile[1], (zeile[2]), zeile[3], zeile[4].split("_"));
		reader.schliesseDatei();

	}
	
	public void leseAusTxtDatei(String typ) throws IOException {
		ReaderCreatorGnodtke rc = new ConcreteCsvReaderCreator();
		ReaderProductGnodtke reader = rc.factoryMethod(typ);
		
		String[] zeile = reader.leseAusDatei();
		// this.cafe = new Cafe(zeile[0], Float.parseFloat(zeile[1]),
		// Float.parseFloat(zeile[2]), zeile[3], zeile[4].split("_"))

		this.cafe = new Cafe(zeile[0], zeile[1], (zeile[2]), zeile[3], zeile[4].split("_"));
		reader.schliesseDatei();

	}
	
	
	
	
	

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public Cafe getCafe() {
		return cafe;
	}

	public void schreibeCafesInCsvDatei() throws IOException {

		BufferedWriter aus = new BufferedWriter(new FileWriter("cafesAusgabe.csv", true));
		aus.write(this.cafe.gibCafeZurueck(';'));
		aus.close();
	}

}

//BufferedReader ein = new BufferedReader(new FileReader("Cafe.csv"));
//	String[] zeile = ein.readLine().split(";");
//	this.cafe = new Cafe(zeile[0], 
//		zeile[1], 
//		zeile[2], 
//		zeile[3], 
//		zeile[4].split("_"));
//		ein.close();
// nur 3 Klassen 