package com.yhndc.seogu;

public class _14_multi_Array2 {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];

		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]=" + mathScores[i][j]);
			}
		}

		int[][] engScores = { { 95, 100 }, { 50, 90, 54 }, { 80, 90, 87, 65 } };

		for (int i = 0; i < engScores.length; i++) {
			for (int j = 0; j < engScores[i].length; j++) {
				System.out.println("영어 점수[" + i + "][" + j + "]=" + engScores[i][j]);
			}
		}

		int[][] korScores = new int[2][];
		korScores[0] = new int[2];
		korScores[1] = new int[3];
		for (int i = 0; i < korScores.length; i++) {
			for (int j = 0; j < korScores[i].length; j++) {
				System.out.println("korScores[" + i + "][" + j + "]=" + korScores[i][j]);
			}
		}

	}

}
