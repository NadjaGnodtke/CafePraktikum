package fileCreatorsGnodtke;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteCsvReaderProduct extends ReaderProductGnodtke {
	BufferedReader ein;

	public ConcreteCsvReaderProduct() throws FileNotFoundException {
		super();
		ein = new BufferedReader(new FileReader("Cafe.csv"));

	}

	@Override
	public String[] leseAusDatei() throws IOException {
		// TODO Auto-generated method stub

		String[] zeile = ein.readLine().split(";");

		return zeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		ein.close();

	}

}

//String[] cafe = new String[5];

// zeile = (zeile[0], zeile[1], zeile[2], zeile[3], zeile[4].split("_"));
