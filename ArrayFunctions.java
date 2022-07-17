package com.advanced.array;

import java.util.Arrays;

public class ArrayFunctions {
	public static void main(String[] args) {
		int[] gamePoints=new int[12];
		System.out.println(Arrays.toString(gamePoints));
		
		System.out.println("players start with 200 points");
		Arrays.fill(gamePoints, 200);
		System.out.println(Arrays.toString(gamePoints));
		
		System.out.println("first 9 players lost 20 points");
		Arrays.fill(gamePoints, 0, 10, 180);
		System.out.println(Arrays.toString(gamePoints));
		
		
		System.out.println("10th player gained 50 points");
		gamePoints[9]+=50;
		System.out.println(Arrays.toString(gamePoints));
		
		System.out.println("gamerPoints in order");
		Arrays.sort(gamePoints);
		System.out.println(Arrays.toString(gamePoints));
		
		System.out.println("last 5 points");
		int[] lastFivePoints=Arrays.copyOf(gamePoints, 5);
		System.out.println(Arrays.toString(lastFivePoints));
		
		System.out.println("top 5 points");
		int[] topFivePoints=Arrays.copyOfRange(gamePoints, gamePoints.length-5,gamePoints.length);
		System.out.println(Arrays.toString(topFivePoints));
		
	    if(Arrays.equals(lastFivePoints, topFivePoints)) {
	    	System.out.println("top players same as last players");
	    }else {
	    	System.out.println("top players do not have same as last players");
	    	}
	    gamePoints[4]=300;
	    Arrays.sort(gamePoints);
	    if(Arrays.binarySearch(gamePoints,300 )>=0) {
	    	System.out.println("reached 300 points, game over");}
	    	else{
	    		System.out.println("nobody reached 300 points");
	    		
	    	}
	    	
	    }
		
		
		
	}


