package com.apipothi.java8.defaultmethod;

public interface Playlist {
	
default void getNewPlaylistName() {
		
		System.out.println("Playlist-My New Implementation");
	}
	
	static void getNewPlaylistId() {
		
		System.out.println("Playlist-getNewPlaylistId");
		

}
}
