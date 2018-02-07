import java.util.ArrayList;

public class Album {

	private String albumTitle;

	private ArrayList<Song> songs;
	
	public Album(String albumTitle) {
		this.albumTitle = albumTitle;
		this.songs =  new ArrayList<Song>();
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}
	
	public boolean addSong(String songTitle, int duration) {
		if (findSong(songTitle) == null) {
			songs.add(new Song(songTitle, duration));
			return true;
		}
		return false;
	}
	
	private Song findSong(String songTitle) {
		for(Song x : songs) {
			if (x.getSongTitle().equals(songTitle)){
				return x;
			}
		}
		return null;
	}
}
