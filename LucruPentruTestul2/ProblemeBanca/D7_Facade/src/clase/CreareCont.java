package clase;

public class CreareCont {
    public void creareCont(String numePersoana, int varsta, boolean esteUrmaritDePolitie, boolean areCreanteLaAlteBanci) {
        VerificareVarstaPersoana verificareVarstaPersoana = new VerificareVarstaPersoana(varsta);
        VerificareUrmarirePolitie verificareUrmarirePolitie = new VerificareUrmarirePolitie(esteUrmaritDePolitie);
        VerificareCreanteLaAlteBanci verificareCreanteLaAlteBanci = new VerificareCreanteLaAlteBanci(areCreanteLaAlteBanci);

        if(verificareVarstaPersoana.verificareVarstaPersoana()) {
            System.out.println("Persoana " + numePersoana + " este majora");
            if(verificareUrmarirePolitie.verificareUrmaritDePolitie()) {
                System.out.println("Persoana nu e urmarita de politie");
                if(verificareCreanteLaAlteBanci.verificareCreanteLaAlteBanci()){
                    System.out.println("Persoana nu are creante la alte banci, creati cont");
                }
                else {
                    System.out.println("Persoana are creante la alte banci");
                }
            }
            else{
                System.out.println("Sunati la politie");
            }
        }
        else{
            System.out.println("Persoana e minora");
        }


    }
}
