package ro.cts.seminar2.readers;

import ro.cts.seminar2.clase.Aplicant;
import ro.cts.seminar2.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public StudentReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicant() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student aplicant = new Student();
            super.readAplicantData(input, aplicant);
            int an_studii = input.nextInt();
            String facultate = (input.next());
            aplicant.setAn_studii(an_studii);
            aplicant.setFacultate(facultate);
            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }

}
