package Problema5;

public class Box extends Item{
	
	private Item[] items;
	
	public Box() {
		super();
	}
	
	public Box(String nombre) {
		super();
		super.setNombre(nombre);
	}
	
	public Box(Item[] i) {
		this.items = new Item[i.length];
		for (int j = 0; j < this.items.length; j++) {
			items[j] = i[j];
		}
	}
	
	public void setItem(Item b) {
		this.items = new Item[1];
		this.items[0] = b;
	}
	
	public Item[] getItem() {
		return this.items;
	}
	
	public void addItem(Item b) {
		Item[] a = new Item[this.items.length+1];
		for (int j = 0; j < this.items.length; j++) {
			a[j] = items[j];
		}
		a[this.items.length] = b;
		this.items = a;
	}
	
	public void addRadioButton(Item b) {
		((RadioButton)this.items[this.items.length-1]).setChild(b);
		((RadioButton)b).setParent(this.items[this.items.length-1]);
		Item[] a = new Item[this.items.length+1];
		for (int j = 0; j < this.items.length; j++) {
			a[j] = items[j];
		}
		a[this.items.length] = b;
		this.items = a;
	}
	
	public Item getLastItem() {
		return this.items[this.items.length-1];
	}
	
	public String toString() {
		String rst = "";
		for (int i = 0; i < this.items.length; i++) {
			rst += this.items[i].toString();
		}
		return rst;
	}
}
