import implementaciones.ColaDinamica;
import implementaciones.ColaEstatica;
import interfaces.ColaTDA;
import metodos.metodoCola;

public class colas {
  public static void main(String[] args) {
    // ColaTDA cola = new ColaEstatica();
    ColaTDA cola = new ColaDinamica();
    cola.InicializarCola();

    ColaTDA cola2 = new ColaDinamica();
    cola2.InicializarCola();

    cola.Acolar(1);
    cola.Acolar(2);
    cola.Acolar(3);

    metodoCola.imprimirCola(cola);

    metodoCola.invertirSinPilas(cola);
  }
}
