package clase;

import com.sun.security.jgss.GSSUtil;

public class PlataCash implements ModPlata {
    @Override
    public void plateste() {
        System.out.println("Plata cash");
    }
}
