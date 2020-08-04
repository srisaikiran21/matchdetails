package com.match;



public class MatchBO {

	public Match createMatch(String data, Team[] teamList)
	{
		String a[]=data.split(",");
		Team team1 =null;
		Team team2=null;
		
		for(Team team : teamList)
		{
			if(team.getName().equals(a[0]))
			team1 =team;
			if(team.getName().equals(a[1]))
				team2 =team;
			
		}
		Match m =new Match(a[0], team1, team2 ,a[3]);
		
		return m;
	}
	public void findTeam(String matchDate, Match[] matchList) {
		for(Match m : matchList) {
			if(m.getDate().equals(matchDate))
			{
				System.out.println(m.getTeamone().getName());
				System.out.println(m.getTeamtwo().getName());
			}
		}	
		}
		
		public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
			for(Match m : matchList) {
				if((m.getTeamone().getName().equals(teamName)) || (m.getTeamtwo().getName().equals(teamName)))
				{
					System.out.println(m.getDate()+" "+m.getTeamone().getName()+" "+m.getTeamtwo().getName()+" "+m.getVenue());
				}
			}
		}
		
		
	}

