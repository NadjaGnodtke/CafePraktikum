package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import business.Cafe;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import ownUtil.MeldungsfensterAnzeiger;

public class CafeModel {
	private Cafe cafe;
	
	
	   
    public void leseAusDatei(String typ) throws IOException{
    	
      		
      			BufferedReader ein = new BufferedReader(new FileReader("Cafe.csv"));
      			String[] zeile = ein.readLine().split(";");
      			this.cafe = new Cafe(zeile[0], 
      				zeile[1], 
      				zeile[2], 
      				zeile[3], 
      				zeile[4].split("_"));
      				ein.close();
      	
	}
    
    public void setCafe(Cafe cafe) {
    	this.cafe=cafe;
    }
    
    public Cafe getCafe() {
    	return cafe;
    }
		
    
	public void schreibeCafesInCsvDatei() throws IOException {
		
			BufferedWriter aus 
				= new BufferedWriter(new FileWriter("cafesAusgabe.csv", true));
			aus.write(this.cafe.gibCafeZurueck(';'));
			aus.close();		
	}



}