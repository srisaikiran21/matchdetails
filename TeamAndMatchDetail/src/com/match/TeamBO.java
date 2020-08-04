package com.match;


public class TeamBO {
 
public Team createTeam(String data, Player[] PlayerList) 

{
	PlayerBO pbo =new PlayerBO();
	String  ar[] = data.split(",");
	
	Player player=null;
	for(Player p : PlayerList) 
	
	{
	  if(p.getName().equals(ar[1]))	{
		  
		  player = p;
	  }
	}
	
	return new Team(ar[0], player);
	}
}
