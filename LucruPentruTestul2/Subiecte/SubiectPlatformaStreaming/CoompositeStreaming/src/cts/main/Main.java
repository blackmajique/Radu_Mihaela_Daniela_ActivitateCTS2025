package cts.main;

import cts.clase.ClipVideo;
import cts.clase.IClip;
import cts.clase.Playlist;

public class Main {
    public static void main(String[] args) {
        IClip clip1 = new ClipVideo("Clip 1", 2.4f, "comedie", 3454);
        IClip clip2 = new ClipVideo("Clip 2", 1.2f, "drama", 345411);
        IClip clip3 = new ClipVideo("Clip 3", 4.5f, "tragedie", 34544543);

        IClip playlist1 = new Playlist("Bombastic", 3);
        IClip playlist2 = new Playlist("wOOow", 1);

        try {
            playlist2.adaugaClip(clip1);
            playlist2.adaugaClip(clip2);
            playlist2.stergeClip(clip2);

            playlist1.adaugaClip(clip3);
            playlist1.adaugaClip(clip1);
            playlist1.adaugaClip(clip2);

            IClip clipAles = playlist1.getClip(1);
            clipAles.afiseazaDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        playlist1.afiseazaDetalii();
    }
}