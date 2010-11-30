package Problema12;

public class test {

	public static void main(String[] args) {
		ListaLibros ll = new ListaLibros();
		
		ll.addLibro(new Libro("Lord of the Rings","Tolkien, J R R"));
		ll.addLibro(new Libro("Java in a Nutshell","Flanagan, David"));
		ll.guardarA("test.txt");
		ll = new ListaLibros();
		
		ll.cargarDe("test.txt");
		System.out.println(ll);
	}
}
