package com.michaelmidura.kataday.day015;

public class Movie {

	public static int movie(int card, int ticket, double perc) {
		double count = 0, systemB = card;
		while (ticket * count <= Math.ceil(systemB)) systemB += ticket * Math.pow(perc, ++count);
		return (int) count;
	}
}