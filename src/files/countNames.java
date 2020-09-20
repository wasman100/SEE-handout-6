package files;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;

import acm.program.*;

public class countNames extends ConsoleProgram {
public void run() {
		
		HashMap<String, String> Names = new HashMap<String, String>();
		Names=nameGenerator();
		println("Unique name list contains:");
		singleLineList(Names);
	}

	private void singleLineList(HashMap<String, String> names) {
		// TODO Auto-generated method stub
		for(int i =0; i<names.size(); i++) {
			println(names.get(Integer.toString(i)));
		}
	}

	private HashMap<String, String> nameGenerator() {
		String name ="";
		int counter = 0;
		HashMap<String, String> Names = new HashMap<String, String>();
		do {
			name = readLine("Enter name: ");
			
			Names.put(Integer.toString(counter), name);
			counter++;

		}while(!(name.equals("")));
		return Names;
	}
}
