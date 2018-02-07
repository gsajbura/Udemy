public class TestPlaylist {
	
	private static Player player = new Player();
	public static void main(String[] args) {
		
		player.addAlbum("The Dark Side of The Moon");
		player.addAlbum("The Wall");
		player.addAlbum("Division Bell");
		player.addAlbum("Animals");
		
		player.addSong("The Dark Side of The Moon", "Time", 300);
		player.addSong("The Dark Side of The Moon", "Money", 350);
		player.addSong("The Dark Side of The Moon", "Eclipse", 200);

		player.addSong("The Wall", "Hey you", 450);
		player.addSong("The Wall", "Comfortably numb", 600);
		player.addSong("The Wall", "Run", 500);

		player.addSong("Division Bell", "Marooned", 300);
		player.addSong("Division Bell", "Lost for words", 400);
		player.addSong("Division Bell", "High Hopes", 500);
		
		player.addSong("Animals", "Dogs", 500);
		player.addSong("Animals", "Sheeps", 500);
		player.addSong("Animals", "Pigs", 500);
		
		addSongToPlaylist("Marooned");
		addSongToPlaylist("Sheeps");
		addSongToPlaylist("Time");
		addSongToPlaylist("Lost for words");
		addSongToPlaylist("Comfortably numb");
		addSongToPlaylist("Time");
		addSongToPlaylist("High Hopes");
		
		player.usePlayer();	
	}
	

	
//	private static void listAlbums() {
//		for(Album album : player.getAlbums()) {
//			System.out.println(album.getAlbumTitle());
//			for (Song song : album.getSongs()) {
//				System.out.println(song.getSongTitle() + " : " + song.getDuration());
//			}
//		}
//	}
	
	private static void addSongToPlaylist(String songTitle) {
		if(player.addSongToPlaylist(songTitle)) {
//			System.out.println("Song added to the playlist");
		} else {
			System.out.println("Song not in any album");
		}
	}
	
}
