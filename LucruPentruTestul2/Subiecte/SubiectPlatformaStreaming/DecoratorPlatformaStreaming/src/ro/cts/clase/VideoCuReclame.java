package ro.cts.clase;

public class VideoCuReclame extends VideoDecorator{
    private String sponsor;
    private float sumaSponsorizare;

    public VideoCuReclame(IClip video, String sponsor, float sumaSponsorizare) {
        super(video);
        this.sponsor = sponsor;
        this.sumaSponsorizare = sumaSponsorizare;
    }


    @Override
    public void redareVideoCuReclame() {
        System.out.println("Video cu reclame de la " + sponsor + " platit cu " + sumaSponsorizare);
    }
}
