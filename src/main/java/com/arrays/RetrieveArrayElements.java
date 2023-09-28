package com.arrays;

public class RetrieveArrayElements {

	public static void main(String[] args) {
		String[][] S1;
		S1 = new String[2][6];
		S1[0][0] ="White";
		S1[0][1] ="Black";
		S1[0][2] ="Yellow";
		S1[0][3] ="Purple";
		S1[0][4] ="Blue";
		S1[0][5] ="Red";
		S1[1][0] ="Egg";
		S1[1][1] ="BlackBoard";
		S1[1][2] ="Yolk";
		S1[1][3] ="Baloon";
		S1[1][4] ="Sky";
		S1[1][5] ="Sun";
		
		
		
	  
		
		for (int a =0;    a <S1.length;      a ++) {   for (int b =0;    b <S1[0].length;      b ++) 
		{System.out.print(S1[a][b]+" "); } 
		System.out.println();}}}




