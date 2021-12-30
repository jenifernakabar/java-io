package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
	
		PrintWriter pw = new PrintWriter("Loren2.txt");
		
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pw.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
	
		
		pw.close();
	}
}
