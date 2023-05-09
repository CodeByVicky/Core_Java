package com.Collection_WrittenTest;

import java.util.*;
//Consider List of T20 Players.
//Player (playerid,Name,Country,team)
//e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
//Then find out which team has  Australian players.

public class T20_Plyers {

	int id;
	String name;
	String country;
	String team;

	public T20_Plyers(int id, String name, String country, String team) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.team = team;
	}

	@Override
	public String toString() {
		return "T20_Plyers [id=" + id + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}

	public static void main(String[] args) {

		ArrayList<T20_Plyers>list=new ArrayList<>();
		
		list.add(new T20_Plyers(101,"maxwell","Australia","rcb"));
		list.add(new T20_Plyers(501,"virat","india","rcb"));
		list.add(new T20_Plyers(871,"josh batller","england","rr"));
		list.add(new T20_Plyers(198,"warner","Australia","dc"));
		
		for(T20_Plyers t:list) {
			if(t.country=="Australia") {
				System.out.println(t);
			}
		}
		
	}

}
