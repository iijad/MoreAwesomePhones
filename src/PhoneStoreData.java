import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class PhoneStoreData {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("data//PhonesWithContract.txt"));
		
		ArrayList<String> lines = new ArrayList<String>();
		String line = "";
		
		String currentLine = reader.readLine();

		while (currentLine != null)
		{
		       lines.add(currentLine);
		       currentLine = reader.readLine();
		}
		
		Collections.sort(lines);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("data//PhonesWithContract.txt"));
		
		
		for (String l : lines)
		{
		       writer.write(line);

		       writer.newLine();
		}

	}
	
	

}
