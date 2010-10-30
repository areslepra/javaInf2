package Problema4;

abstract class Figura {
	abstract double area();

	int esMenorQue(Figura obj) {
		if (this.area() > obj.area()) {
			return -1;
		} else {
			if (this.area() < obj.area()) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}