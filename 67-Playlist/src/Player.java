import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Player {
	
	private static Scanner scanner = new Scanner(System.in);
	private ArrayList<Album> albums;
	private LinkedList<Song> playlist;
	private ListIterator<Song> i;
	
	public Player() {
		this.albums = new ArrayList<Album>();
		this.playlist =  new LinkedList<Song>();
	}

	public ArrayList<Album> getAlbums() {
		return albums;
	}
	
	public LinkedList<Song> getPlaylist() {
		return playlist;
	}

	public boolean addAlbum(String albumTitle) {
		if (findAlbum(albumTitle) == null) {
			albums.add(new Album(albumTitle));
			return true;
		}
		return false;
	}
	
	private Album findAlbum(String albumTitle) {
		for(Album x : albums) {
			if (x.getAlbumTitle().equals(albumTitle)){
				return x;
			}
		}
		return null;
	}
	
	public boolean addSong(String albumTitle, String songTitle, int duration) {
		Album existingAlbum = findAlbum(albumTitle);
		if (existingAlbum != null) {
			return existingAlbum.addSong(songTitle, duration);
		}
		return false;
	}
	
	public boolean addSongToPlaylist(String songTitle) {
		for (Album album : albums) {
			for (Song song : album.getSongs()) {
				if (songTitle.equals(song.getSongTitle())) {
					playlist.add(new Song(song.getSongTitle(), song.getDuration()));
					return true;
				}
			}
		}
		return false;
	}
	
	public void usePlayer() {
		i = playlist.listIterator();
		printOptions();
		boolean goingForward = true;
		boolean quit = false;
		while(!quit) {
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printOptions();
				break;
			case 1:
				if (!goingForward) {
					i.next();
					goingForward = true;
				}
				String nextSong = skipForward(i);
				if (nextSong != null) {
					System.out.println("Now playing: " + nextSong);
					goingForward = true;
				} else {
					System.out.println("No more songs");
				}
				break;
			case 2:
				String previousSong = skipBackward(i);
				if (previousSong != null){
						System.out.println("Now playing: " + previousSong);
						goingForward = false;
				} else {
					System.out.println("Now playing: " + skipForward(i));
					goingForward = true;
				}
				break;
			case 3:
				i.remove();
				System.out.println("Song removed");
				break;
			case 4:
				listSongs();
				break;
			case 5:
				System.out.println("Shutting down...");
				quit = true;
				break;
			default:
				System.out.println("Wrong option number");
				break;
			}

		}
		
	}
	
	private void listSongs() {
		ListIterator<Song> i = playlist.listIterator();
		while(i.hasNext()) {
			System.out.print(i.nextIndex() + 1 + ". ");
			System.out.print(i.next().getSongTitle() + " : ");
			i.previous();
			System.out.println(i.next().getDuration());
		}
	}
	
	private String skipForward(ListIterator<Song> i) {
		if(i.hasNext()) {
			return i.next().getSongTitle();
		}
		return null;
	}
	
	private String skipBackward(ListIterator<Song> i) {
		if(i.hasPrevious()) {
			return i.previous().getSongTitle();
		}
		return null;
	}
	
//	private void removeSong(ListIterator<Song> i) {
//		i.remove();
//	}
	
	private static void printOptions() {
		System.out.println("Press: \n" + 
				"0 - to print options\n" + 
				"1 - to skip forward \n" +
				"2 - to replay current song (press twice to skip backward)\n" + 
				"3 - to remove current song\n" + 
				"4 - to list all songs\n" + 
				"5 - to quit app\n");
	}
	
}
