package fileCreatorsGnodtke;

import java.io.IOException;

public abstract class ReaderCreatorGnodtke {
	
	public abstract ReaderProductGnodtke factoryMethod(String typ) throws IOException;

}
