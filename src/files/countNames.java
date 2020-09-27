package files;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

import acm.program.*;

public class countNames extends ConsoleProgram {
	public void run() {

		HashMap<String, Integer> Names = new HashMap<String, Integer>();
		Names = nameGenerator();
		singleLineList(Names);
	}

	private void singleLineList(HashMap<String, Integer> names) {
		// TODO Auto-generated method stub
		Iterator<String> it = names.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int count = names.get(key);
			if (key.equals("")) {

			} else {
				println("Entry [" + key + "] has count " + count);
			}

		}
	}

	private HashMap<String, Integer> nameGenerator() {
		String name = "";
		HashMap<String, Integer> Names = new HashMap<String, Integer>();
		do {

			name = readLine("Enter name: ");
			Integer count = Names.get(name);
			if (count == null) {
				count = new Integer(1);
			} else {
				count = new Integer(count + 1);
			}
			Names.put(name, count);

		} while (!(name.equals("")));
		return Names;
	}
}
