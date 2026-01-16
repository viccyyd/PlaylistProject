/**
 * File for a Song class to be used in the Playlist Project
 * @author Victoria and Kaitlyn
 * @version Jan 14, 2026
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    
    private String name;
    private String artist;
    private int seconds;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

    public Song()
    {
        this.name = name;
        this.artist = artist;
        this.seconds = seconds;
        this.liked = false;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

     public String getName()
     {
        return name;
     }

     public String getArtist()
     {
        return artist;
     }

     public int getSeconds()
     {
        return seconds;
     }

     public boolean isLiked() 
     {
        return liked;
     }

    public void setName(String name) 
     {
        this.name = name;
     }

    public void setArtist(String artist) 
     {
        this.artist = artist;
     }

    public void setSeconds(int seconds) 
     {
        this.seconds = seconds;
     }

    public void setLiked(boolean liked) 
     {
        this.liked = liked;
     }

    private String duration() {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        if (secs < 10) {
            return minutes + ":0" + secs;
        }
        return minutes + ":0" + secs;
    }
    
    public String toString() {
    String result = name + " by " + artist + " (" + duration() + ")";

    if (liked) {
        result += " -- liked";
    }

    return result;
}
}