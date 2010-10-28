package Problema5;

public class CheckBox extends Item {
	
	private boolean checked;

	public CheckBox() {
		super();
	}
	
	public CheckBox(String nombre) {
		super();
		super.setNombre(nombre);
		checked = false;
	}
	
	public CheckBox(String nombre, boolean isChecked) {
		super();
		super.setNombre(nombre);
		checked = isChecked;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	public void restore() {
		checked = false;
	}
	
	public String toString() {
		if(checked) {
			return "[X]" + this.getNombre();
		}else{
			return "[]" + this.getNombre();
		}
	}
}
