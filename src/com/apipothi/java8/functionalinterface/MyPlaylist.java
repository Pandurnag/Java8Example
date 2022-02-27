package com.apipothi.java8.functionalinterface;


/*This is Functional Interface*/

@FunctionalInterface
public interface MyPlaylist {
	
	public void getMyplaylist();
	
	//public void getMynewplaylist();
	
	default void getMyJavaPlaylist() {
		
	}
	static void getMyJava9Playlist() {
		
	}

}
