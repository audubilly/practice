package PlayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Sade", "Soldier of love");
       album.addSong("lover's galore",4.23);
       album.addSong("sugar cane",4.23);
       album.addSong("sweetest Taboo",4.23);
       album.addSong("joe budden",5.23);
       album.addSong("same as old",4.53);
       album.addSong("prisoner",4.34);
       albums.add(0,album);


       Album album1 = new Album("No woman No cry","Bob Marley");
       album1.addSong("stir it up",4.68);
       album1.addSong("redemption song",5.68);
       album1.addSong("3 little birds",4.68);
       album1.addSong("road to zion",4.90);
       album1.addSong("just for you",5.08);
       album1.addSong("run to me",4.88);
       album1.addSong("love leads",5.68);
       albums.add(1,album1);

    LinkedList<Song> playlist = new LinkedList<>();
    albums.get(0).addToPlaylist("lover's galore",playlist);
    albums.get(0).addToPlaylist("sugar cane",playlist);
    albums.get(0).addToPlaylist("sweetest Taboo",playlist);
    albums.get(0).addToPlaylist("joe budden",playlist);

    albums.get(1).addToPlaylist(1,playlist);
    albums.get(1).addToPlaylist(2,playlist);
    albums.get(1).addToPlaylist(10,playlist);

    play(playlist);
    }

    public  static  void play(LinkedList<Song> playlist){
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0){
            System.out.println("No songs in the playlist");
        }else {
            System.out.println("Now playing: " + listIterator.next().toString());
        }
    }



    

}
