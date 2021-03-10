package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static final String SEPARATOR = " ";
	
	public void readData () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		line = br.readLine();
		String[] parts = line.split(SEPARATOR);
		int [] prices = new int [parts.length];
		for (int j = 0; j < parts.length; j++) {
			prices[j] = Integer.parseInt(parts[j]);
		}
		line = br.readLine();
		int money = Integer.parseInt(line);
		
		br.close();	

	}

	public static void main(String[] args) {
		
		
		

	    	
	}		

}
