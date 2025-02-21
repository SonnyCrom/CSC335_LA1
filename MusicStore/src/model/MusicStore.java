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
		for (int i = 0; i < albumList.size(); i++) {
			String songInformation = albumList.get(i).searchSong(name);
			if (songInformation.length() != 0) {
				return songInformation;
			} 
		}
		return "Song not found!";
	}
}
