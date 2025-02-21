package model;

public class Song {

	String name;
	String author;
	String genre;
	int year;
	
	
	public Song(String name, String author, String genre, int year ) {
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.year = year;
	}
	
	// Returns a string of all the Songs information
	public String getInfo() {
		String info = this.name + " by " + this.author + ". Genre: " + this.genre;
		return info;
	}
	
	
	// Basic Getters (No references, all primitive)
	public String getName() {
		return this.name;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getGenre() {
		return this.genre;
	}
	public int getYear() {
		return this.year;
	}
}
