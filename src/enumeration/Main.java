package enumeration;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(Genre.Male.name());
		System.out.println(Genre.Female);
		System.out.println(Genre.Female.getClass().getName());
		Genre v1 = Genre.Male;
		Genre v2 = Genre.Male;
		System.out.println(v1.equals(v2));
		System.out.println(v1 == v2);
		Genre v3 = Genre.valueOf("Male");
		System.out.println(v3);
		System.out.println(v1 == v3);
		switch(v3) {
		case Male:
			System.out.println("It's a male");
			break;
		}
		
		Planets p1 = Planets.Earth;
		Planets p2 = Planets.Mercur;
		p1.rotate();
		p2.rotate();
		Planets[] planets = Planets.values();
		System.out.println(Arrays.toString(planets));
	}

}
