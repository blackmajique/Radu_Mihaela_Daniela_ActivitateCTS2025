package ro.cts.seminar2.clase;

import ro.cts.seminar2.readers.AngajatiReader;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		AngajatiReader reader = new AngajatiReader("angajati.txt");
		List<Aplicant> listaAplicanti ;
		try {
			listaAplicanti = reader.readAplicant();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
