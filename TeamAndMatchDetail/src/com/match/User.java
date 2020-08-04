package com.match;

import java.util.Scanner;



public class User {
public static void main(String[] args) {
	PlayerBO pbo= new PlayerBO();
	TeamBO tbo= new TeamBO();
	MatchBO mbo= new MatchBO();
	
	Scanner scanner =new Scanner(System.in);
	
	System.out.println("Enter player count :"); 
	
	int np = scanner.nextInt();
	
	scanner.nextLine();
	Player[] pList= new Player[np];
	
	for(int i=0; i<np; i++) 
	{
		System.out.println("Enter player "+(i+1)+" details");
		pList[i]=pbo.createPlayer(scanner.nextLine());
	}
	
	System.out.println("Enter team count :");
	
	int nt = scanner.nextInt();
	scanner.nextLine();
	
	Team[] tList= new Team[nt];
	
	for(int i=0; i<nt; i++) 
	{
		System.out.println("Enter team "+(i+1)+" details");
		tList[i] = tbo.createTeam(scanner.nextLine(), pList);
	}
	
	System.out.println("Enter Match count: "); 
	
	int nm=scanner.nextInt();
	
	scanner.nextLine();
	Match[] mList= new Match[nm];
	

	for(int i=0; i<nm; i++) 
	{
		System.out.println("Enter match "+(i+1)+" details");
		
		mList[i]=mbo.createMatch(scanner.nextLine(), tList);
	}
	System.out.println("Menu");
	
	System.out.println("1) Find Team");
	System.out.println("2) Find All Matches In A Specific Venue ");
	System.out.println("Type 1 or 2 ");
	
	switch(scanner.nextInt()) {
	case 1:
		System.out.println("Enter match date");
		
		mbo.findTeam(scanner.next(), mList);
		
		break;
		
	case 2:
		
		System.out.println("Enter Team Name");
		mbo.findAllMatchesOfTeam(scanner.next(), mList);
		
		break;
		
	default:
		System.out.println("Do you want to continue? Type Yes or No");
		
	}
		
	}
	
}
