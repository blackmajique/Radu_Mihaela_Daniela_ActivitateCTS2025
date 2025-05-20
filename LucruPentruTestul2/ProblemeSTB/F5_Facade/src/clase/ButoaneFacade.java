package clase;

public class ButoaneFacade {
    public void butoaneDeschidereUsi(boolean suntUsileDeschiseFortat){
        Usa fata = new Usa("fata");
        Usa mijloc = new Usa("mijloc");
        Usa spate = new Usa("spate");
        SistemUsiAutobuz sistemUsiAutobuz = new SistemUsiAutobuz(fata, mijloc, spate);
        if(suntUsileDeschiseFortat){
            fata.deschidereUsaFortat();
            mijloc.deschidereUsaFortat();
            spate.deschidereUsaFortat();
        }
        else{
            fata.deschidereUsaNormala();
            mijloc.deschidereUsaNormala();
            spate.deschidereUsaNormala();
        }
    }
}
