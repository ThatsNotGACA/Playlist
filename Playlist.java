
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
    private ArrayList<String> B;





     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        A = new ArrayList<Song>();
        B = new ArrayList<String>();
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
      public void addSong(Song a){
        A.add(a);
      }
      
      public void likeSong(int index){
          A.get(index).setLike();

        }

      public void removeSong(int index){
        A.remove(index);
      }
      public String printSongs(){
        String name="";
      for( int i = 0; i<A.size();i++){
        name = (A.get(i).toString());
        }
        return name;
      }
      public ArrayList<String> printLikedSongs(){
        for( int i = 0;i<A.size();i++){
          if(A.get(i).getLike()==true){
            B.add(A.get(i).toString());
          }
        }
        return B;
      }
     public void removeAllUnlikedSongs(){
     for( int i = A.size();i>=0;i--){
        if(A.get(i).getLike()!=true){
          A.remove(i);
     }
    
    }
  }
  public int getTotalDuration(){
    int totalduration=0;
    for( int i = 0;i<A.size();i++){
      totalduration = A.get(i).getTime();

    }
    return totalduration;
  }

     }