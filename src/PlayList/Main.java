package PlayList;

import java.util.ArrayList;

public class Main {

    private ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Sade", "Soldier of love");
       album.addSong("lover's galore",4.23);
       album.addSong("sugar cane",4.23);
       album.addSong("sweetest Taboo",4.23);
       album.addSong("prisoner",4.23);

    }



    

}
