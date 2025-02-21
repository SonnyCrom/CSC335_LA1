package model;

import java.util.ArrayList;
import model.Song;

public class LibraryModel {
	private ArrayList<Song> songList; 
	private ArrayList<ArrayList<Song>> playList;
	
	public LibraryModel() {
		this.songList = new ArrayList<Song>();
		this.playList = new ArrayList<ArrayList<Song>>();
		playList.add(songList);
	}
	
	public String songInfo(String name) {
		return "";
	}
	
}
