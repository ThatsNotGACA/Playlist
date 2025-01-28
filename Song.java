package Playlist;

import java.util.Scanner;

/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?

    private String name;
    private String artist;
    private int min;
    private int sec;
    private boolean liked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */



     public  Song(String myname, String myartist, int mymin, int mysec){

        name=myname;
        artist=myartist;
       min= mymin;
       sec= mysec;
        liked= false;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

public String getName(){
    return name;
}
public String getArtist(){
    return artist;
}
public int getTime(){
    int seclength=(min*60+sec);
    return seclength;
}
public boolean getLike(){
    return liked;
}
public void setLike(){
    liked=true;
}
public String toString(){
    return "\"" + name + "\"" + " by " + artist + "("+ min+":"+sec+")";
}
}

