package com.Collection_WrittenTest;
import java.util.*;
////12.	Consider an ArrayList of Movie 
//Movie has (int movieid, String moviename, List<String> actor)
//Find “Amitabh bachchan has acted in how many movies.

class Movie{
	int id;
	String name;
	List<String>actor;
	public Movie(int id, String name, List<String> actor) {
		super();
		this.id = id;
		this.name = name;
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actor=" + actor + "]";
	}
	
}

public class FindActor {

	public static void main(String[] args) {
		ArrayList<Movie>list=new ArrayList<>();
		
		list.add(new Movie(101,"bhuthnaath",Arrays.asList("Amitabh Bachchan", "Jaya Bhaduri", "Pran")));
		list.add(new Movie (102,"iron man",Arrays.asList("rdj")));
		list.add(new Movie(105,"suryvanshi",Arrays.asList("Amitabh Bachchan")));
		
		
		String hero="Amitabh Bachchan";
		
		
		int count=0;
		for(Movie m:list) {
			if(m.actor.contains(hero))
				count++;
			System.out.println(m);
		}
		System.out.println(hero+ "---->"+count);
	}

}
