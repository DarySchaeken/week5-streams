package be.pxl.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class Challenge2 {
	public static void main(String[] args) {
		// maak een stream met 10 random gehele getallen tussen 0 en 30
		// bekijk hiervoor de methode ints(...) in de klasse Random
		// filter de getallen die deelbaar zijn door 3
		// en geef het maximum 
		// gebruik eventueel peek() om een tussenresultaat van de stream te tonen
		Random random = new Random();
		IntStream stream = random.ints(10, 0, 31);
		IntStream filteredStream = stream.peek(i -> System.out.println("Peeked at " + i)).filter(i -> {return i%3==0;});
		System.out.println(filteredStream.max().getAsInt());
		
	}
}
