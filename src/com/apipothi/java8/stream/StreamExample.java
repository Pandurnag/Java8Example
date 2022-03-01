package com.apipothi.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<String> listOfString = new ArrayList<String>();
		listOfString.add("String Level-0");
		listOfString.add("Array Level-0");
		listOfString.add("DS SLL");
		listOfString.add("JAVA5");
		listOfString.add("Design Patterns");
		listOfString.add("JAVA9");
		listOfString.add("JAVA8");
		listOfString.add("Array Level-1");
		listOfString.add("Microservice");
		listOfString.add("Apache Kafka");
		System.out.println("List of String - " + listOfString);
		
		List<Integer> listOfdob = new ArrayList<Integer>();
		listOfdob.add(1990);
		listOfdob.add(1790);
		listOfdob.add(1890);
		listOfdob.add(1950);
		listOfdob.add(2940);
		listOfdob.add(1910);
		System.out.println("List of DOB" + listOfdob);
		
		//
		
		System.out.println("START- Integer Stream");
		Stream<Integer> intstream=Stream.of(1,2,3,4,5,6,7,8,9);
		intstream.forEach(abcd -> System.out.println(abcd));	
		System.out.println("END- Integer Stream");
		
		
		System.out.println("START- STRING Stream");
		Stream<String> stringstream=Stream.of("A","B","C","D","E");
		stringstream.forEach(abcd -> System.out.println(abcd));	
		System.out.println("END- STRING Stream");
		
		System.out.println("START- Integer ARRAY Stream");
		
		Stream<Integer> instreamArray=Stream.of(new Integer[] {1,2,3,4,5,6,7,8,});
		instreamArray.forEach(a -> System.out.println(a));
		
		System.out.println("END- Integer ARRAY Stream");
		
		
		System.out.println("************FILTER-START*************");
		
		List<String>playlistwithfilter= listOfString
		                                .stream()
		                                .filter(l ->l.length()>2)
		                                .collect(Collectors.toList());
		System.out.println("List of Play list which size is more that two -"+"\n"+playlistwithfilter);
		
		
		//Find the list of EVEN DOB
		Set <Integer> evenDOB= listOfdob
		    .stream()
		    .filter(p -> p%2==0)
		    .collect(Collectors.toSet());
		
		System.out.println("evenDOB-" +"\n"+evenDOB);
		
		//Get me the Playlist name where video is more then 10
		Set<ApipothiPlaylist> playlistname=playlistInfo()
				                  .stream()
				                  .filter(p-> p.getPlaylistvideo() >10)
				                  .collect(Collectors.toSet());
		System.out.println(playlistname);
		
		
		System.out.println("************FILTER-END*************");
		
		System.out.println("************MAP-START*************");
		
		//i WANT ALL THE PLAY LIST ENDING WITH "TUTORIALS"
		List<String> playlistwithtutoriaLS= listOfString.stream()
				                                         .map(l -> l+" - TUTORIALS")
				                                         .collect(Collectors.toList());
		System.out.println("PLAY LIST NAME ENDING WITH TUTORIALS"+"\n"+playlistwithtutoriaLS);
		
		//I Want to increase the DOB with 1 Year
		Set<Integer> dobincrement = listOfdob.stream()
				                   .map(p -> p+1 )
				                   .collect(Collectors.toSet());
		System.out.println("increase the DOB with 1 Year"+"\n"+dobincrement);
		
		
		//Increment all the video count by one
		             List<Integer> incrementvideo=playlistInfo().stream()
		            		 .map(p -> p.getPlaylistvideo()+1)
		                     .collect(Collectors.toList());
		System.out.println("Video Increment by one - "+"\n"+incrementvideo);
		System.out.println("************MAP-END*************");
		
		System.out.println("************START-SORTED*************");
		
		Set<String> sortedlistOfString=listOfString.stream().sorted().collect(Collectors.toSet());
		System.out.println("Default Natural String Sorting"+"\n"+sortedlistOfString);
		
		List<Integer> sortedlistOfdob=listOfdob.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Natural Integer Sorting"+sortedlistOfdob);
		
	    Set<ApipothiPlaylist>	sortedplaylistinfo=playlistInfo().stream().sorted().collect(Collectors.toSet());
        System.out.println(sortedplaylistinfo);
		
        Set<String> customsortedlistOfString=listOfString.stream().sorted((l1,l2) -> l1.compareTo(l2)).collect(Collectors.toSet());
        System.out.println("CUSTOM SORTING STRING -"+"\n"+customsortedlistOfString);
        
        Set<Integer> customsortedlistOfdob=listOfdob.stream().sorted((l1,l2) -> l1.compareTo(l2)).collect(Collectors.toSet());
        System.out.println("CUSTOM SORTING INTEGER -"+"\n"+customsortedlistOfdob);
        
        List<ApipothiPlaylist> customplaylistnamesorting=playlistInfo().stream()
             .sorted((l1,l2) -> l1.getPlaylistname().compareTo(l2.getPlaylistname()))
             .collect(Collectors.toList());
        System.out.println("CUSTOM PLAY LIST SORTING"+"\n"+customplaylistnamesorting);
        
		System.out.println("************END-SORTED*************");
		
		
		
		System.out.println("************MIN-START*************");
		
		String minplaylist=listOfString.stream().min((l1,l2) -> l1.compareTo(l2)).get();
		System.out.println("MIN PLAYLIST "+"\n"+minplaylist);
		
		
		ApipothiPlaylist minplaylist1=playlistInfo().stream()
				                             .min((l1,l2) -> l1.getPlaylistname().compareToIgnoreCase(l2.getPlaylistname()))
				                             .get();
		System.out.println("MIN PLAYLIST NAME - "+" \n "+minplaylist1);
		System.out.println("************MIN-END*************");
		
		
System.out.println("************MAX-START*************");
		
		String maxplaylist=listOfString.stream().max((l1,l2) -> l1.compareTo(l2)).get();
		System.out.println("MAX PLAYLIST "+"\n"+maxplaylist);
		
		
		ApipothiPlaylist maxplaylist1=playlistInfo().stream()
				                             .max((l1,l2) -> l1.getPlaylistname().compareToIgnoreCase(l2.getPlaylistname()))
				                             .get();
		System.out.println("MAX PLAYLIST NAME - "+" \n "+maxplaylist1);
		System.out.println("************MAX-END*************");
		
		System.out.println("************START-FOREACH*************");
		
		listOfString.stream().forEach(s-> System.out.println(s));
		
		playlistInfo().stream().forEach(s-> System.out.println(s));

		
        listOfString.stream().forEach( System.out ::println);
		
		playlistInfo().stream().forEach( System.out::println);
		
	    System.out.println("************END-FOREACH*************");
	    
	    System.out.println("************END-FOREACH*************");
	    
	    System.out.println("ToARRAY-START*************");
	    
	    Object[] arrayString=listOfString.stream().toArray();
	    System.out.println(Arrays.toString(arrayString));   
	    String[] stringarrayString=listOfString.stream().toArray(String[] :: new);
	    System.out.println(Arrays.toString(stringarrayString));
	    
	    System.out.println("ToARRAY-END*************");
	    
	    System.out.println("***********COUNT -START*************");
	    System.out.println("COUNT OF PLAYLIST"+listOfString.stream().count());
	    System.out.println("COUNT OF DOB"+listOfdob.stream().count());
	    System.out.println("COUNT OF PLAYLIST DATA"+playlistInfo().stream().count());
	    
	    //FILTER WITH COUNT of DOB which is grater then 1950
	    long dobcount=listOfdob.stream().filter(l -> l>1950).count();
	    System.out.println("DOB > 1950 -"+dobcount);
	    
	    System.out.println("***********COUNT -END*************");
	    
	    //HASH CODE
	    
	   int rawhashcode=listOfdob.hashCode();
	   System.out.println("RAW DATA HASH CODE - "+rawhashcode); 
	   
	   int streamhashcode=listOfdob.stream().hashCode();
	   System.out.println("STREAM HASH CODE DATA-"+streamhashcode);
	    
	}
        
	public static List<ApipothiPlaylist> playlistInfo(){
		
		List<ApipothiPlaylist> playlist = new ArrayList<ApipothiPlaylist>();
		
		ApipothiPlaylist c = new ApipothiPlaylist(1, 17, "String Level-0");
		ApipothiPlaylist arrayLevel0 = new ApipothiPlaylist(2, 25, "Array Level-0");
		ApipothiPlaylist java5 = new ApipothiPlaylist(4, 6, "java5");
		ApipothiPlaylist dp = new ApipothiPlaylist(5, 6, "Design Pattern");
		ApipothiPlaylist java9 = new ApipothiPlaylist(6, 6, "java9");
		ApipothiPlaylist java8 = new ApipothiPlaylist(7, 5, "java8");
		ApipothiPlaylist arrayLevel = new ApipothiPlaylist(8, 11, "arrayLevel-1");
		ApipothiPlaylist microservice = new ApipothiPlaylist(9, 15, "Microservice");
		ApipothiPlaylist kafka = new ApipothiPlaylist(9, 15, "Apache Kafka");
		
		playlist.add(c);
		playlist.add(arrayLevel0);
		playlist.add(java5);
		playlist.add(dp);
		playlist.add(java9);
		playlist.add(java8);
		playlist.add(arrayLevel);
		playlist.add(microservice);
		playlist.add(kafka);
	
		return playlist;
		
	}
}
