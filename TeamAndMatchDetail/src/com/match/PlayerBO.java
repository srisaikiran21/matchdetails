package com.match;

public class PlayerBO {

Player createPlayer (String data) 
{
	String a[]=data.split(",");
	
	Player player =new Player(a[0],a[1],a[2]);
	
	return player;
}

}
