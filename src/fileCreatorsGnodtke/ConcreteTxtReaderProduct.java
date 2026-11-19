package fileCreatorsGnodtke;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteTxtReaderProduct extends ReaderProductGnodtke {
	BufferedReader ein;

	public ConcreteTxtReaderProduct() throws FileNotFoundException {
		super();
		ein = new BufferedReader(new FileReader("Cafe.txt"));
	}

	@Override
	public String[] leseAusDatei() throws IOException {
		// TODO Auto-generated method stub
		String[] ergebnisZeile = new String[5];
		String zeile = ein.readLine();
		int i=0;
		
		while(i<ergebnisZeile.length){
			ergebnisZeile[i]=zeile;
			zeile=ein.readLine();
			i++;
		}
		
		return ergebnisZeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		ein.close();
		
	}

}
