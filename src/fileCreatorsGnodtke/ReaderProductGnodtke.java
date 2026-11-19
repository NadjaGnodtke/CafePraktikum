package fileCreatorsGnodtke;

import java.io.IOException;

public abstract class ReaderProductGnodtke {
	
	public abstract String[] leseAusDatei() throws IOException;
	public abstract void schliesseDatei() throws IOException;

}
