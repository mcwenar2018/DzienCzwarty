package pl.edu.wszib.music;

public class MP3Player extends MusicPlayer implements Player {

    public MP3Player(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3 odtwarza" + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("MP3 pauza" + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop" + getCurrentSong());
    }
}

