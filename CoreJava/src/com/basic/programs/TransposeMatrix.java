package com.basic.programs;

public class TransposeMatrix {

	public static void main(String args[]) {
		int Original[][]= {{1,2,3},{4,5,6},{7,8,9}};
			
		System.out.println("Printing Original Matrix:");

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print( Original[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println("Printing Transpose Matrix");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(Original[j][i]+ " ");
				}
	System.out.println();
			}
		
		}
	}