package Playlist;
import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> A;




     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        A = new ArrayList<Song>();
    }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a son
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void AddSong(Song a){
        A.add(a);
      }
      public void LikeSong(Song b){
        int index = -1;
        for(int i = 0; i <A.length; i++){
            if (A.get(i).equals(a)){
                index = i;

            }
        }
        A.get(i).setLike();
      }
}
