
public class Song {
     
	private String title;
	private String artist;
	private int length;
    private static int songCount = 0;

    public Song(String title, String artist, int length) {
    	this.title = title;
        this.artist = artist;
        this.length = length;
        songCount++;
        System.out.println("Song Count: " + songCount);
    }
    
    public int getSongsCount() {
    	return songCount;
    }
    
    //Set and Get Title
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
    //Set and Get Artist
    public void setArtist(String artist) {
    	this.artist = artist;
    }
    
    public String getArtist() {
    	return this.artist;
    }
    
    //Set and Get Length
    public void setLength(int length) {
    	this.length = length;
    }
    
    public int getLength() {
    	return this.length;
    }
    
}


