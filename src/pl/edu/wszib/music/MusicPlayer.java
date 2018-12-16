package pl.edu.wszib.music;

abstract public class MusicPlayer implements Player{
    private Song[] library;
    private int current;

    public MusicPlayer(Song[] library) {
        this.current = 0; // nadmiarowe ustawienie wskaznika na zero
        this.library = library;
    }

    public Song getCurrentSong(){
        return library[current];
    }

    public void next() {
        if (++current >= library.length) {
            current = 0;
        }
        play();
    }

    public void previous() {
        if(--current <= 0){
            current = (library.length -1);
        }
        play();
    }
}


