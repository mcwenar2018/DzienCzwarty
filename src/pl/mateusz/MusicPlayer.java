package pl.mateusz;

abstract public class MusicPlayer implements Player {

}


class CDPlayer extends MusicPlayer{



    @Override
    public void odtwarzaj() {
        System.out.println("Gra " + getClass().getName());

    }

    @Override
    public void pauza() {
        System.out.println("Pauza");

    }

    @Override
    public void stop() {
        System.out.println("Stop");

    }

    @Override
    public void poprzedni() {
        System.out.println("Poprzedni utwor");
    }

    @Override
    public void nastepny() {
        System.out.println("Nastepny utwor");
    }
}

class IPod extends MusicPlayer{




    @Override
    public void odtwarzaj() {
        System.out.println("Gra: " + getClass().getName());
    }

    @Override
    public void pauza() {
        System.out.println("Pauza");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void poprzedni() {
        System.out.println("Poprzedni utwor");
    }

    @Override
    public void nastepny() {
        System.out.println("Nastepny utwor");
    }
}