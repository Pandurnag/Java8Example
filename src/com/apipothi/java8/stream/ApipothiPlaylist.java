package com.apipothi.java8.stream;

public class ApipothiPlaylist implements Comparable<ApipothiPlaylist>{
	
	int playlistid;
	int playlistvideo;
	String playlistname;
	

	public ApipothiPlaylist(int playlistid, int playlistvideo, String playlistname) {
		super();
		this.playlistid = playlistid;
		this.playlistvideo = playlistvideo;
		this.playlistname = playlistname;
	}

	public int getPlaylistid() {
		return playlistid;
	}

	public void setPlaylistid(int playlistid) {
		this.playlistid = playlistid;
	}

	public int getPlaylistvideo() {
		return playlistvideo;
	}

	public void setPlaylistvideo(int playlistvideo) {
		this.playlistvideo = playlistvideo;
	}

	public String getPlaylistname() {
		return playlistname;
	}

	public void setPlaylistname(String playlistname) {
		this.playlistname = playlistname;
	}
	

	@Override
	public String toString() {
		return "ApipothiPlaylist [playlistid=" + playlistid + ", playlistvideo=" + playlistvideo + ", playlistname="
				+ playlistname + "]";
	}

	@Override
	public int compareTo(ApipothiPlaylist o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
