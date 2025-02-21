// Class - CSC 335 - LA1


package model;
import java.util.ArrayList;

//import model.Song;


public class MusicStore {
	
	private ArrayList<Album> albumList;
	
	
	public MusicStore() {
		this.albumList = new ArrayList<Album>();
	}
	
	public String songInfo(String name) {
		ArrayList<String> foundSongs = new ArrayList<String>();
		for (int i = 0; i < albumList.size(); i++) {
			ArrayList<String> temp = albumList.get(i).searchSong(name);
			for (int j = 0; j < temp.size(); j++) {
				foundSongs.add(temp.get(j));
			}
		}
		// Not sure if we should return a string or print later
		// need to work on Visual
		if (foundSongs.size() > 0) {
			String list = "";
			for (String info : foundSongs) {
				list += info + '\n';
			}
			return list;
		} else {
			return "Song not found!";
		}
	}
	
	// Return Album Information
	public String albumInfo(String name) {
		for (int i = 0; i < albumList.size(); i++) {
			if (albumList.get(i).getName().equals(name)){
				return albumList.get(i).getInfo();
			}
		}
		return "Album not found!";
	}
}
