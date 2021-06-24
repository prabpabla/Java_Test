import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

import org.apache.commons.csv.*;

public class TradeLog_Parser {

	public TradeLog_Parser() throws IOException{
		File csvDataFile = new File("C:\\Users\\prab_\\Downloads\\DU3292618_20210616.csv");
		CSVFormat format = CSVFormat.newFormat(',').withHeader();
		CSVParser parser = CSVParser.parse(csvDataFile, Charset.defaultCharset(), format);

		System.out.println(parser.getHeaderNames());
		
		for (CSVRecord csvRecord : parser) {
			
			System.out.println(csvRecord.get("Symbol"));
			//System.out.println(csvRecord.toString());
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		new TradeLog_Parser();
	}
	
	
}
