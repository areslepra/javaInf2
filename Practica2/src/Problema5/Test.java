package Problema5;

public class Test {
	
	public static void main(String args[]) {
		Box a = new Box("Archivos:");
		
		a.setItem(new CheckBox(".jpeg",false));
		a.addItem(new CheckBox(".gif",true));
		a.addItem(new CheckBox(".png",true));
		
		Box b = new Box("Tamano:");
		RadioButton rb = new RadioButton("4 Gb");
		b.setItem(rb);
		rb = new RadioButton("8Gb");
		//((RadioButton) b.getLastItem()).setChild(rb);
		b.addRadioButton(rb);
		rb = new RadioButton("16Gb");
		//((RadioButton) b.getLastItem()).setChild(rb);
		b.addRadioButton(rb);
		
		Item[] it = b.getItem();
		((RadioButton) it[1]).setChecked(true);
		
		((RadioButton) b.getLastItem()).setChecked(true);
		
		System.out.println(a);
		
		System.out.println(b);
	}

}
