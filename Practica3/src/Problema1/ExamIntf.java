package Problema1;

public interface ExamIntf {
	
	/**
	 * Utiliza index como indice de un arreglo de doubles
	 * Retorna el elemento especificado por el indice
	 * 
	 * @param int index
	 * @return double
	 */
	public double get(int index);
	
	/**
	 * Coloca value en el arreglo
	 * La posicion es automatica, con cada llamada almacena en el siguiente
	 * En caso de estar lleno, retorna falso, sino true.
	 * Comienza por el elemento 0, y continua con el 1, asi hasta llenar el arreglo.
	 * 
	 * @param double value
	 * @return boolean
	 */
	public boolean put(double value);
	
	/*
	 * Ordena el array de dolubles de menor a mayor.
	 * Solo ordena las posiciones llenas (con un valor insertado). 
	 */
	public void sort();
	
	/*
	 * Calcula el promedio de los elementos del arreglo
	 * 
	 * @return double
	 */
	public double avg();

}
