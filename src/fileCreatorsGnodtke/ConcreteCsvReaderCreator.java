package fileCreatorsGnodtke;

import java.io.IOException;

public class ConcreteCsvReaderCreator extends ReaderCreatorGnodtke {

	@Override
	public ReaderProductGnodtke factoryMethod(String typ) throws IOException {
		// TODO Auto-generated method stub
		if (typ.equals("csv")) {
			return new ConcreteCsvReaderProduct();
		} else {
			return new ConcreteTxtReaderProduct();
		}
	}

}
