package PlayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

    public  static  void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in the playlist");
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
        }
        while(!quit){
            int action = scanner.nextInt();
//            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    break;
                case 1 :
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;

                    if(listIterator.hasNext()){
                               System.out.println("Now playing: " + listIterator.next().toString());

                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward= false;
                        }
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the beginning of the playlist");
                        forward= false;
                    }
                    break;

                case 3:
                    break;

                case 4:
//                    printPlaylist();
                    break;

                case 5:
                   printMenu();
                    break;




            }

        }
    }

    public static void printMenu(){
        System.out.println("\n select action from here \n");
        System.out.println("1- forward song \n"+
                "2- rewind song \n"+
                "3- printPlaylist \n");
        System.out.println("choose an action");

        }
    }



    


