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
    private String length;
    private boolean liked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */



     public  Song(String myname, String myartist, int mymin, int mysec){

        name=myname;
        artist=myartist;
        length = mymin + ":" + mysec;
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
public String getTime(){
    return length;
}
public boolean getLike(){
    return liked;
}
public void setLike(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you want to like this song? y/n");
    String y = scanner.nextLine();
    if(y.equals("y")){
        liked = true;
    }else{
        liked=false;
    }
}
public String toString(){
    return "\"" + name + "\"" + " by " + artist + "("+ length+")";
}
}

