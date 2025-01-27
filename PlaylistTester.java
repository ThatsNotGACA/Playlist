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
    public void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist A = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        A.addSong(new Song("All of the Lights", "Kanye West", 4, 59));
        A.addSong(new Song("Money Trees", "Kendrick Lamar", 6, 27));
        A.addSong(new Song("Highway to Hell", "AC/DC", 3, 38));
        A.addSong(new Song("FE!N", "Travis Scott", 3, 12));
        A.addSong(new Song("ClapYour Hands", "A Tribe Called Quest", 3, 16));


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        for(int i = 0; i<A.size(); i++){
            System.out.println(A.get(i).toString());
        }

        System.out.println("\nLiking the songs in position 1, 3, 4\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        A.likeSong(1);
        A.likeSong(3);
        A.likeSong(4);

        System.out.println("Printing the songs...");
        Playlist.printSongs();

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        A.removeSong(2);

        System.out.println("Printing the songs...\n");
        for(int j = 0; i<A.size(); j++){
            System.out.println(A.get(j).toString());
        }

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        ArrayList<song> likedSongs = new ArrayList<song>();
       
            if(Song.getLike()==true)
            
        

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        //total duration should be in seconds
        int totalDuration = A.getTotalDuration();
        int totalsec = totalDuration % 60;
        int totalmin = totalDuration / 60;
        System.out.println("Total Duration of all songs in the playlist: "+ totalmin +"min "+totalsec+"sec")
        

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        A.removeAllUnlikedSongs();


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        for(int k = 0; i<A.size(); k++){
            System.out.println(A.get(k).toString());
        }
    }
}
}