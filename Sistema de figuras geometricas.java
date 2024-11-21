public abstract class Figura {
    public abstract double calcularArea();
}
// Clase derivada
class Circulo extends Figura {
    - double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
// Clase derivada
class Rectangulo extends Figura {
    - double ancho;
    - double alto;
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double calcularArea() {
        return ancho * alto;
    }
} Main {
    
}
