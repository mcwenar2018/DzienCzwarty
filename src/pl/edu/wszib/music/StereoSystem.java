package pl.edu.wszib.music;

public class StereoSystem {
    public static void main(String[] args) {
        Song[] library = new Song[3];
        library[0] = new Song("Michael Jackson","Beat It","Thriller",1992);
        library[1] = new Song("Pearl Jam","Even FLow","Ten",1998);
        library[2] = new Song("Portishead","Over","New Your City",2001);

        Player[] players = {new CDPlayer(library), new MP3Player(library)};

        players[0].play();
        players[0].stop();
        players[0].next();

        System.out.println();

        players[1].play();
        players[1].play();
        players[1].stop();
        players[1].next();
        players[1].previous();

    }
}
