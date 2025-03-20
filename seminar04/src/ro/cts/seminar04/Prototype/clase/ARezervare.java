package ro.cts.seminar04.Prototype.clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length() > 3) {
            this.numeClient = numeClient;
        }else{
            this.numeClient = "Necunoscut";
        }

        if(nrPersoane > 2) {
            this.nrPersoane = nrPersoane;
        }else{
            this.nrPersoane = 20;
        }

        if(data.length() == 8) {
            this.data = data;
        }else{
            this.data = "Necunoscut";
        }

        if(ora.length() == 5) {
            this.ora = ora;
        }else{
            this.ora = "Necunoscut";
        }
    }

    public ARezervare() {
        this.numeClient = "Necunoscut";
        this.nrPersoane = 20;
        this.data = "Necunoscut";
        this.ora = "Necunoscut";
    }

    @Override
    public String toString() {
        return "ARezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                '}';
    }

    public abstract void descriere();

    public abstract ARezervare copiaza();
}
