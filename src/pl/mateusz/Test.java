package pl.mateusz;
//program niekompletny
public class Test {
    public static void main(String[] args) {

        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.odtwarzaj();

        IPod iPod = new IPod();
        iPod.odtwarzaj();
        iPod.stop();

    }
}
