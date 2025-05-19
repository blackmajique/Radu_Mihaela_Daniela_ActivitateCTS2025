package ro.cts.clase;

public class VideoFaraReclame implements IClip {
    private String nume;
    private int fizionari;

    public VideoFaraReclame(String nume, int fizionari) {
        this.nume = nume;
        this.fizionari = fizionari;
    }

    @Override
    public void redareVideo() {
        System.out.println("Video Fara Reclame: " + nume + " are " + fizionari + " vizionari");
    }
}
