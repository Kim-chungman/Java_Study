package Java0324.Lecture13.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {			// 2중 try-catch

	public static void main(String[] args) {
		
		
		try {
			FileReader fr = new FileReader("a.txt");	// checked exception
		} catch(FileNotFoundException fnfe) {
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
