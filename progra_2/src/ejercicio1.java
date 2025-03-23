import implementaciones.PilaDinamica;
import interfaces.PilaTDA;
import metodos.metodoPila;

public class ejercicio1 {
  public static void main(String[] args) {
    PilaTDA p1 = new PilaDinamica();
    p1.InicializarPila();

    PilaTDA p2 = new PilaDinamica();
    p2.InicializarPila();

    PilaTDA p3 = new PilaDinamica();
    p3.InicializarPila();

    p1.Apilar(1);
    p1.Apilar(2);
    p1.Apilar(3);

    metodoPila.mostrarSinEliminar(p1);
    metodoPila.mostrarSinEliminar(p2);

    metodoPila.mover(p1, p2);
    metodoPila.mostrarSinEliminar(p1);
    metodoPila.mostrarSinEliminar(p2);

    metodoPila.copiar(p2, p1);
    metodoPila.mostrarSinEliminar(p1);
    metodoPila.mostrarSinEliminar(p2);

    metodoPila.invertir(p1);
    metodoPila.mostrarSinEliminar(p1);

    metodoPila.copiar(p2, p3);

    int cantElementosP2 = metodoPila.contarElementos(p2);
    System.out.println("Cantidad de elementos en P2: " + cantElementosP2);

    int sumaElementosP1 = metodoPila.sumarElementos(p1);
    System.out.println("Suma de elementos en P1: " + sumaElementosP1);

    int promedioElementosP3 = metodoPila.promedioElementos(p3);
    System.out.println("Promedio de elementos en P1: " + promedioElementosP3);
  }
}
