package Problema4;

public class Test {
	public static void main(String args[]) {
		Athlete a1 = new Athlete("A1",1,"AR",3.8);
		Athlete a2 = new Athlete("A2",1,"ES",4.8);
		
		Race ra = new Race(100);
		ra.addCompetitor(a1);
		ra.addCompetitor(a2);
		
		ra.buscarGanador();
		
		System.out.println(ra.getGanador().getNombre());
		
		/*
		if(a1.getTiempo() > a2.getTiempo()) {
			System.out.println(a2.getNombre());
		}else{
			System.out.println(a1.getNombre());
		}
		*/
	}
}
