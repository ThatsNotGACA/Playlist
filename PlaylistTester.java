import java.util.ArrayList;

/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        Playlist.addSong(new Song("All of the Lights", "Kanye West", 4, 59);
        Playlist.addSong(new Song("Money Trees", "Kendrick Lamar", 6, 27);
        Playlist.addSong(new Song("Highway to Hell", "AC/DC", 3, 38);
        Playlist.addSong(new Song("FE!N", "Travis Scott", 3, 12);
        Playlist.addSong(new Song("ClapYour Hands", "A Tribe Called Quest", 3, 16);


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        Playlist.printSongs();

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        Playlist.likeSong(1);
        Playlist.likeSong(3);
        Playlist.likeSong(4);

        System.out.println("Printing the songs...");
        Playlist.printSongs();

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        Playlist.removeSong(2);

        System.out.println("Printing the songs...\n");
        Playlist.printSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        ArrayList<song> likedSongs = new ArrayList<song>();
       
            if(Song.getLike()==true)
            
        

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        int totalDuration = Playlist.getTotalDuration();

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        Playlist.removeAllUnlikedSongs();


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        Playlist.printSongs();
    }
}
