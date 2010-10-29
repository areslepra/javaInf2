package problema1;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		if(args == null) {
			System.out.println("Parametros incorrectos");
			return;
		}
		if(args.length != 1) {
			System.out.println("Parametros incorrectos");
			return;
		}
		try {
			Integer n = new Integer(args[0]);
			Scanner s = new Scanner(System.in);
			String t[] = new String[n];
			for (int i = 0; i < n; i++) {
				t[i] = s.nextLine();
			}
			for (int i = 0; i < n; i++) {
				System.out.println(t[i]);
			}
		}catch (Exception e) {
			System.out.println("Argumentos invalidos");
		}
	}

}
