package Problema1;

public class RecordExamen {

	public RecordExamen() {
		ExamArray e = new ExamArray();
		e.put(12.4);
		e.put(34.2);
		e.put(98.4);
		e.put(87.5);
		e.put(99.34);
		e.put(100.0);
		e.put(75.3);
		e.put(89.6);
		
		e.sort();
		
		System.out.println("Notas");
		for (int i = 0; i < 7; i++) {
			System.out.println(e.get(i));
		}
		System.out.println("Promedio:" + e.avg());

	}
}
