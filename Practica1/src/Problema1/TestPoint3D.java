package Problema1;

public class TestPoint3D {

	public static void main(String[] args) {
		Point3D pt1, pt2, pt3, pt4;
		
		pt1 = new Point3D();
		pt2 = new Point3D(10, -5, 4);
		pt3 = new Point3D(5, 15);
		
		System.out.println("PT1:" + pt1.toString() + "PT2:" + pt2.toString() + "PT3:" + pt3.toString());
		
		pt2.setX(9);
		pt2.setY(8);
		pt2.setZ(-6);
		System.out.println(pt2);
		
		pt1.shiftX(3);
		pt1.shiftY(-3);
		pt1.shiftZ(7);
		System.out.println(pt1);
		
		System.out.println(pt1.equals(pt2));
		
		pt4 = pt1.translate(6,11,-13);
		System.out.println(pt4);
		
		System.out.println(pt2.equals(pt4.getX(),pt4.getY(),pt4.getZ()));
		
		System.out.println(pt3.distanceOrigin());
		
		System.out.println(pt1.distanceToPoint(pt3));
		
		System.out.println(pt1.scalarProduct(pt2));
		
		System.out.println(pt1.whichSpacce());
		System.out.println(pt2.whichSpacce());
		System.out.println(pt3.whichSpacce());
		
		System.out.println(pt2.inBox(-12, 20, 8, 24, 40, 35));
		System.out.println(pt1.inSphere(new Point3D(1,2,5), 50));
		
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3);
	}

}
