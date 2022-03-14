package com.MockTest;

import java.util.Scanner;

package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
	
	String name;
	int score;
	Player (String name, int score){
		this.name=name;
		this.score=score;
	}	
}

class Checker implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		if (p1.score==p2.score) {
			return p1.name.compareTo(p2.name);
		}
		return -Integer.compare(p1.score,p2.score);
	}
}

public class SortingPlayers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of players");
		int n=sc.nextInt();
		
		Player[] player=new Player[n];
		Checker checker=new Checker();
		
		for (int i=0;i<n;i++) 
		{
			player[i]=new Player(sc.next(),sc.nextInt());
		}
		
		Arrays.sort(player,checker);
		for (int i=0;i<n;i++) 
		{
			System.out.printf("%s %s \n",player[i].name,player[i].score);
		}
		
	}