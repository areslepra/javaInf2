package Problema5;

public class RadioButton extends Item{

	private boolean checked;
	private Item parent;
	private Item child;
	private boolean isFirst;
	private boolean hasChild;

	public RadioButton() {
		super();
		checked = true;
		isFirst = true;
		hasChild = false;
	}
	
	public RadioButton(String nombre) {
		super();
		super.setNombre(nombre);
		checked = false;
		isFirst = true;
		hasChild = false;
	}
	
	public RadioButton(String nombre, boolean isChecked) {
		super();
		super.setNombre(nombre);
		this.setChecked(isChecked);
		isFirst = true;
		hasChild = false;
	}

	public RadioButton(String nombre, Item parent) {
		super();
		super.setNombre(nombre);
		this.parent = parent;
		isFirst = false;
		hasChild = false;
	}

	public RadioButton(String nombre, Item parent, boolean isChecked) {
		super();
		super.setNombre(nombre);
		this.parent = parent;
		this.setChecked(isChecked);
		isFirst = false;
		hasChild = false;
	}
	
	public RadioButton(String nombre, Item parent, Item child) {
		super();
		super.setNombre(nombre);
		this.parent = parent;
		this.checked = false;
		isFirst = false;
		this.child = child;
		hasChild = true;
	}

	public RadioButton(String nombre, Item parent, boolean isChecked, Item child) {
		super();
		super.setNombre(nombre);
		this.parent = parent;
		this.setChecked(isChecked);
		isFirst = false;
		this.child = child;
		hasChild = true;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.uncheckParent();
		this.uncheckChild();
		this.checked = checked;
	}
	
	public String toString() {
		if(checked) {
			return "(X)" + this.getNombre();
		}else{
			return "()" + this.getNombre();
		}
	}
	public void uncheckParent() {
		if(!isFirst) {
			((RadioButton) this.parent).uncheckParent();
		}
	}
	
	public void uncheckChild() {
		if(hasChild) {
			((RadioButton) this.child).uncheckChild();
		}
	}
	
	public void setParent(Item parent) {
		this.parent = parent;
		this.isFirst = true;
	}
	
	public void setChild(Item child) {
		this.child = child;
		this.hasChild = true;
	}
	
	public void restore() {
		checked = isFirst;
	}	
}
