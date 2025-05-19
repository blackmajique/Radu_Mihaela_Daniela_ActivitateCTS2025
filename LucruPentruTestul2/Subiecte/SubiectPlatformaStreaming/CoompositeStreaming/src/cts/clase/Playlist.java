package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IClip {
    private String numePlaylist;
    private int nrVideoclipuri;
    private List<IClip> colectieClipuriVideo;

    public Playlist(String numePlaylist, int nrVideoclipuri) {
        this.numePlaylist = numePlaylist;
        this.nrVideoclipuri = nrVideoclipuri;
        this.colectieClipuriVideo = new ArrayList<IClip>();
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Videourile din playlistul " + numePlaylist + " sunt in nr de " + nrVideoclipuri);
        for(IClip clip : colectieClipuriVideo) {
            clip.afiseazaDetalii();
        }
    }

    @Override
    public void adaugaClip(IClip clip) throws Exception {
        colectieClipuriVideo.add(clip);
    }

    @Override
    public void stergeClip(IClip clip) throws Exception {
        colectieClipuriVideo.remove(clip);
    }

    @Override
    public IClip getClip(int cheie) throws Exception {
        return colectieClipuriVideo.get(cheie);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "numePlaylist='" + numePlaylist + '\'' +
                ", nrVideoclipuri=" + nrVideoclipuri +
                ", colectieClipuriVideo=" + colectieClipuriVideo +
                '}';
    }
}
