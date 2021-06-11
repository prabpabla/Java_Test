
public class Song_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song loseYourself = new Song ("Lose Yourself", "Eminem", 450);
		Song godzilla = new Song("Godzilla", "Eminem", 400);
		//Both of the loseYourself and godzilla are Song objects
		//However they both have different attributes (title, artist, length)
		//A static attribute will be same across all objects
		//The song attribute will share this static attribute (song count)
		
		System.out.println(loseYourself.getSongsCount());
		System.out.println(godzilla.getSongsCount());
		//Both print the same count, because the static attribute is being shared
		
		Song rememberTheName = new Song("Remember The Name", "Fort Minor", 500);
		//Notice, the song count is updated with creation of new song object
		
		System.out.println(loseYourself.getSongsCount());
		System.out.println(godzilla.getSongsCount());
		System.out.println(rememberTheName.getSongsCount());
		//Song count is the same, as it is shared 
	}

}
