package com.apipothi.java8.defaultmethod;

public class DefaultMethodExample implements MyPlaylist, Playlist {
	
	public static void main (String[] args) {
		DefaultMethodExample  defaultMethodExample=new DefaultMethodExample();
		defaultMethodExample.getPlaylistInfo();
		defaultMethodExample.getPlaylistName();
		
		defaultMethodExample.getNewPlaylistName();
		
		MyPlaylist.getNewPlaylistId();
		Playlist.getNewPlaylistId(); 
	}
	 /*
      *  public void getNewPlaylistName() {
	  *	
	  *	System.out.println("My New  custom Implementation");}
	  */
	

	@Override
	public void getPlaylistInfo() {
		System.out.println("**getPlaylistInfo{}**");
		
	}

	@Override
	public void getPlaylistName() {
		System.out.println("**getPlaylistName{}**");
	}


	@Override
	public void getNewPlaylistName() {
	
		MyPlaylist.super.getNewPlaylistName();
		Playlist.super.getNewPlaylistName();
	}

}
