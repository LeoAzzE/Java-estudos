package Application;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter file full Path: ");
	String path = sc.nextLine();
	
	Map<String, Integer> database = new TreeMap();
	
	try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		String line = br.readLine();
		while (line != null) {
			String[] fields = line.split(",");
			String name = fields[0];
			int vote = Integer.parseInt(fields[1]);
			
			if (database.containsKey(name)) {
				int votesFar = database.get(name);
				database.put(name, vote + votesFar);
			}
			else {
				database.put(name, vote);
			}
			
			line = br.readLine();
		}
			
		for (String data : database.keySet()) {
			System.out.println(data + ": " +database.get(data));
		}
		
	}

	catch (IOException e){
		System.out.println("Error " + e.getMessage());
		
		}
	sc.close();
	}

}
