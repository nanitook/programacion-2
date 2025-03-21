import implementaciones.PilaDinamica;
import interfaces.PilaTDA;
import metodos.metodoPila;

public class ejercicio1 {
  public static void main(String[] args) {
    PilaTDA p1 = new PilaDinamica();

    p1.InicializarPila();
    p1.Apilar(1);
    p1.Apilar(2);
    p1.Apilar(3);

    metodoPila.mostrarSinEliminar(p1);
  }
}
