package lab.week1.src;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import lab.week1.src.entities.Dancer;
import lab.week1.src.entities.Performer;
import lab.week1.src.entities.Vocalist;

public class Audition {
	public static void main(String[] args) {
		List<Performer> performers = new LinkedList<>(Arrays.asList(
				new Performer(),
				new Performer(),
				new Performer(),
				new Performer(),
				new Dancer("tap"),
				new Dancer("SomeSillyStyle"),
				new Vocalist('G')
		));
		
		// have all performers perform the standard performance
		for(Performer performer : performers) {
			System.out.println(performer.getPerformance());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// have vocalist sing at a certain volume
		System.out.println(((Vocalist) performers.get(6)).getPerformance(5));
	}
}
