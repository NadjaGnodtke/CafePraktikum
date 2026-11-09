package gui;

import java.io.IOException;

import business.Cafe;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CafeControl {

	 
	  private CafeModel cafeModel;
	  private CafeView cafeView;
	  
	    
	    public CafeControl(Stage primaryStage){
	    	
	    	this.cafeModel=new CafeModel(); //richtig 
	    	
	    	this.cafeView= new CafeView(this, primaryStage, cafeModel);
	    	
	    
	    }
	    
	    
	    public void schreibeCafesInCsvDatei() {
			try {
				
				this.cafeModel.schreibeCafesInCsvDatei();
	   			cafeView.zeigeInformationsfensterAn(
		   			"Die Cafes wurden gespeichert!");
			}	
			catch(IOException exc){
				cafeView.zeigeFehlermeldungsfensterAn(
					"IOException beim Speichern!");
			}
			catch(Exception exc){
				cafeView.zeigeFehlermeldungsfensterAn(
					"Unbekannter Fehler beim Speichern!");
			}
		}
	    
	    public void leseAusDatei(String typ) {
	        try {
	            if ("csv".equals(typ)) {
	                cafeModel.leseAusDatei(typ);
	                cafeView.zeigeInformationsfensterAn("Das Cafe wurde gelesen!");
	            } else {
	                cafeView.zeigeInformationsfensterAn("Noch nicht implementiert!");
	            }
	        } catch (IOException exc) {
	            cafeView.zeigeFehlermeldungsfensterAn("IOException beim Lesen!");
	        } catch (Exception exc) {
	            cafeView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Lesen!");
	        }
	    }
	    
	  
}

