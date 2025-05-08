package src.ro.cts.clase;

public class SpitalPrivat extends TemplateInternare{
    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("avem paturi suficiente");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("pt pacientul " + pacient.getNume() + " a fost emisa fisa de internare");
    }
}
