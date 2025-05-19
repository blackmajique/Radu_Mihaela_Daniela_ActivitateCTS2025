package ro.cts.clase;

public abstract class VideoDecorator implements IClip {
    private IClip video;

    public VideoDecorator(IClip video) {
        this.video = video;
    }

    @Override
    public void redareVideo() {
        video.redareVideo();
        redareVideoCuReclame();
    }

    public abstract void redareVideoCuReclame();
}
