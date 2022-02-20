package com.apipothi.java8.defaultmethod;

public interface MyPlaylist {
	
	public void getPlaylistInfo(); 
	public void getPlaylistName();

	
	default void getNewPlaylistName() {
		
		System.out.println("MyPlaylist-My New Implementation");
	}
	
	static void getNewPlaylistId() {
		
		System.out.println("MyPlaylist-getNewPlaylistId");
		
	}
}
