/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author Kaitlyn and Victoria
 * @version January 15, 2026
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.addSong(new Song("Who Knows", "Daniel Caesar", 226));
        p.addSong(new Song("Baby Came Home 2 / Valentines", "The Neighbourhood", 391));
        p.addSong(new Song("HIGHJACK", "A$AP Rocky, Jessica Pratt", 190));
        p.addSong(new Song("Les", "Childish Gambino", 317));
        p.addSong(new Song("yes", "Ken Carson", 175));
        p.addSong(new Song("overseas", "Ken Carson", 141));
        p.addSong(new Song("Groupie Love", "Lana Del Rey, A$AP Rocky", 264));
        p.addSong(new Song("Fashion Killa", "A$AP Rocky", 236));
        p.addSong(new Song("Dreamin", "PARTYNEXTDOOR", 147));
        p.addSong(new Song("Summer Bummer", "Lana Del Rey, A$AP Rocky, Playboi Carti", 261));


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p.showAllSongs();

        System.out.println("\nLiking the songs in position 1, 6, 7, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.like("Baby Came Home 2 / Valentines");
        p.like("Groupie Love");
        p.like("Fashion Killa");

        System.out.println("Printing the songs...\n");
        p.showAllSongs();

        System.out.println("\nRemoving the song in position 0, 2, 8, etc...\n");
        p.removeSong("Who Knows");
        p.removeSong("HIGHJACK");
        p.removeSong("Dreamin");

        System.out.println("Printing the songs...\n");
        p.showAllSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p.showLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(p.getTotalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p.showAllSongs();
    }
}
