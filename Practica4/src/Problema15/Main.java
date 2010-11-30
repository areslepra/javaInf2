package Problema15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static double[][] points = null;
	
	public static void main(String[] args) throws IOException {
		double x,y;
		DataInputStream miarchivo = new DataInputStream(new FileInputStream(
		"datos.txt"));
		Scanner s = new Scanner(new FileInputStream("datos.txt"));
		s.useDelimiter(" ; ");
		while(true) {
			System.out.println(s.nextDouble());
			s.useDelimiter("\n");
			System.out.println(s.nextDouble());
			try{
				x = s.nextDouble();
				y = s.nextDouble();
				System.out.println(x + ";" + y);
				//x = miarchivo.readDouble();
				//miarchivo.readUTF();
				//y = miarchivo.readDouble();
				//miarchivo.readUTF();
				if(points == null) {
					points = new double[1][2];
					points[0][0] = x;
					points[0][1] = y;
				}else{
					double [][]pp = new double[points.length+1][2];
					for (int i = 0; i < points.length; i++) {
						pp[i][0] = points[i][0];
						pp[i][1] = points[i][1];
					}
					pp[points.length][0] = x;
					pp[points.length][1] = y;
					points = pp;
				}
			}catch(Exception e) {
				break;
			}
		}
		miarchivo.close();	
	}
}
