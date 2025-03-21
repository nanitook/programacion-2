import implementaciones.ColaDinamica;
import implementaciones.ColaEstatica;
import interfaces.ColaTDA;

public class colas {
  public static void main(String[] args) {
    // ColaTDA cola = new ColaEstatica();
    ColaTDA cola = new ColaDinamica();
    cola.InicializarCola();

    cola.Acolar(1);
    cola.Acolar(2);
    cola.Acolar(3);

    System.out.println(cola.Primero());

    cola.Desacolar();

    System.out.println(cola.Primero());
  }
}
