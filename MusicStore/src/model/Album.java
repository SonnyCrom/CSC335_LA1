package model;

import java.util.ArrayList;

public class Album {

	private ArrayList<Song> songs;
	
	
	public Album() {
		this.songs = new ArrayList<Song>();
	}
	
	// Searches for a Song within album
	public String searchSong(String name) {
		for (int i = 0; i < songs.size(); i++) {
			if (songs.get(i).getName().equals(name)){
				return songs.get(i).getInfo();
			}
		}
		return "";
	}
}
