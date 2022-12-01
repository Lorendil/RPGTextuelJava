package RPG;

import java.util.Scanner;
import java.io.*;

public class ImportCreatures {
	public static void main (String[] args) throws Exception {
		Scanner ScanCSV = new Scanner(new File("RPGTextuelJava/src/RPG/creatures.csv"));
		ScanCSV.useDelimiter(",");
		while (ScanCSV.hasNext()) {
			System.out.println(ScanCSV.next());
		}
	}
}
