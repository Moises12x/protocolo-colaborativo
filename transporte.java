public class Main {
    abstract class Transporte  
    abstract void mover();
    // Clase derivada
    class Bicicleta extends Transporte {
        void mover() {
            System.out.println("Pedaleando la bicicleta...");
        }
    }
    // Clase derivada
    class Coche extends Transporte {
        @Override
        void mover() {
            System.out.println("Conduciendo el coche...");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Transporte bicicleta = new Bicicleta();
            Transporte coche = new Coche();
            moverTransporte(bicicleta);
            moverTransporte(coche);
        }
        static void moverTransporte(Transporte t) {
            t.mover();
        }
    }
}
