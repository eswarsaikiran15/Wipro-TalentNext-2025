package Interface.live;

import Interface.Music.String.Veena;
import Interface.Music.Wind.Saxophone;
import Interface.Music.*;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        Saxophone sax = new Saxophone();
        sax.play();

        Playable p1 = veena;
        p1.play();

        Playable p2 = sax;
        p2.play();
    }
}
