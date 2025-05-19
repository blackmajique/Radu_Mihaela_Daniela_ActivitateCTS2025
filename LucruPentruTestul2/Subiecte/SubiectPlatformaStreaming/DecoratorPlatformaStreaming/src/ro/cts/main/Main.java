package ro.cts.main;//2p. Platforma se ocupă de gestiunea clipurilor video de tip tutorial precum și clipuri video live. Pentru a
//facilita acest lucru, soluția software trebuie să permită crearea de obiecte din familia IClip pe baza unui
//parametru primit de la utilizator. Clasele din familie conțin minim 2 atribute (cu tipuri diferite) specifice
//unui clip video.
//2p. Să se testeze soluția, prin implementarea interfeței primită și prin crearea a minim patru obiecte din cele
//două categorii evidențiindu-se avantajele pattern-ului ales.
//        5p. Pentru clipurile video care implementează interfața primită trebuie realizate anumite modificări în
//timpul execuției (la run-time). Soluția propusă trebuie să permită modificarea unor clipuri, astfel încât
//să permită difuzarea de reclame. Modificarea în timpul execuției trebuie să permită adăugarea a cel
//puțin un atribut reprezentând durata reclamei sau momentul la care aceasta va fi afișată în cadrul
//        clipului. De asemenea, trebuie să permită apelarea unei noi funcționalități de rulare a reclamei
//respective.
//2p. Să se testeze soluția prin definirea a 4 entități distincte. Două dintre entități sunt modificate la run-time
//prin adăugarea atributului nou și a noii funcționalități. Pentru cele 4 entități se vor apela metodele
//interfeței pentru a demonstra comportamentul diferit al acestora.
//        7p. Soluția trebuie să permită gestiunea pe categorii a clipurilor video încărcate. Utilizatorii pot încărca
//clipuri independente sau playlisturi cu mai multe clipuri. Soluția trebuie să permită crearea unei structuri
//ierarhice în cadrul platformei cu clipurile si playlisturile încărcate. Acțiunile permise asupra acestor
//entități sunt prezentate în interfața primită IClip. Entitățile din soluție conțin și cel puțin 3 atribute (cu
//                                                                                                                    tipuri diferite) specifice unui clip video.
//        2p. Pattern-ul este testat în main() prin definirea și utilizarea unei structuri ierarhice care să conțină
//minim 3 niveluri cu minim 6 elemente. Pe nivelurile 2 și 3 trebuie să existe cel puțin un clip și un playlist.
//Pentru ierarhie sau pentru anumite elemente din ierarhie se vor apela metodele specifice interfeței (dacă
//                                                                                                             Downloaded by Mihaela Petcu (mpetcu900@gmail.com)
//lOMoARcPSD|19723716
//Nume:_______________________________ CTS - #1 RO 14.05 2021
//implementarea permite apelul lor doar pentru clipuri sau pentru clipuri și playlist).

import ro.cts.clase.IClip;
import ro.cts.clase.VideoCuReclame;
import ro.cts.clase.VideoFaraReclame;

public class Main {
    public static void main(String[] args) {
        IClip clipFaraReclame = new VideoFaraReclame("Ce gasim ieftin prin DM", 60000);
        clipFaraReclame.redareVideo();

        IClip clipCuReclame = new VideoCuReclame(clipFaraReclame, "Essence", 5000);
        clipCuReclame.redareVideo();
    }
}