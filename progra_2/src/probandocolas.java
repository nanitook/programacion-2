import implementaciones.ColaPU;
import interfaces.ColaTDA;

public class probandocolas {
  public static void main(String[] args) {
    ColaTDA cola = new ColaPU();
    cola.InicializarCola();
    cola.Acolar(1);
    cola.Acolar(2);
    cola.Acolar(3);
    cola.Acolar(4);

    System.out.print("Cola original: ");
    cola.ImprimirCola();

    InvertirCola(cola);

    System.out.print("Cola invertida: ");
    cola.ImprimirCola();
  }

  public static void InvertirCola(ColaTDA cola) {
    if (cola.ColaVacia()) {
      return;
    }

    int elemento = cola.Primero();
    cola.Desacolar();

    // cola.ImprimirCola();

    InvertirCola(cola);

    cola.Acolar(elemento);
  }

}
