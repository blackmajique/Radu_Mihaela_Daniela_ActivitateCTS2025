public class Main {
    public static void main(String[] args) {
        ARezervare rezervare = new Rezervare("daria maria", 10, "21.10.2023", "14:00");
        ARezervare rezervare2 = rezervare.copiaza();
        System.out.println(
                rezervare2.toString()
        );
    }
}