package ro.cts.seminar2.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;
	private static final int punctajMinimPentruAcceptare = 80;

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {

		this.varsta = varsta;
	}

	public int getPunctaj() {

		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}


	public void statut() {
		String mesaj = punctaj > punctajMinimPentruAcceptare
				? "Aplicantul %s %s a fost acceptat."
				: "Aplicantul %s %s nu a fost acceptat.";
		System.out.printf((mesaj) + "%n", nume, prenume);
	}

	
	public Aplicant() {
		super();
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}

	public int getNr_proiecte() {

		return nr_proiecte;
	}

	public void setNr_proiecte(int nr_proiecte,String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
		this.nr_proiecte = nr_proiecte;
	}

	public abstract void afiseazaFinantarePrimita();
}
