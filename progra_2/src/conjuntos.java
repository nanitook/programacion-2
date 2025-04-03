import implementaciones.ConjuntoEstatico;
import interfaces.ConjuntoTDA;
import metodos.metodosConjuntos;

public class conjuntos {
  public static void main(String[] args) {
    ConjuntoTDA c1 = new ConjuntoEstatico();
    c1.Inicializar();

    ConjuntoTDA c2 = new ConjuntoEstatico();
    c2.Inicializar();

    c1.Agregar(0);
    c1.Agregar(1);
    c1.Agregar(2);
    c1.Agregar(3);
    c1.Agregar(4);
    c1.Agregar(5);

    c2.Agregar(0);
    c2.Agregar(6);
    c2.Agregar(4);
    c2.Agregar(3);
    c2.Agregar(8);
    c2.Agregar(9);

    ConjuntoTDA interseccion = metodosConjuntos.Interseccion(c1, c2);
    metodosConjuntos.Imprimir(interseccion);
    
    System.out.println();

    ConjuntoTDA diferencia = metodosConjuntos.Diferencia(c1, c2);
    metodosConjuntos.Imprimir(diferencia);
  }
}
