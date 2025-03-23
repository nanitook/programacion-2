import implementaciones.ColaDinamica;
import interfaces.ColaTDA;
import metodos.metodoCola;

public class tp1_cola {
  public static void main(String[] args) {
    ColaTDA cola1 = new ColaDinamica();
    cola1.InicializarCola();

    ColaTDA cola2 = new ColaDinamica();
    cola2.InicializarCola();

    cola1.Acolar(1);
    cola1.Acolar(2);
    cola1.Acolar(3);
    cola1.Acolar(4);

    // cola2.Acolar(1);
    // cola2.Acolar(6);
    // cola2.Acolar(5);
    // cola2.Acolar(6);
    // cola2.Acolar(1);

    cola2.Acolar(4);
    cola2.Acolar(3);
    cola2.Acolar(2);
    cola2.Acolar(1);

    // boolean finalesCoinciden = metodoCola.finalesCoinciden(cola1, cola2);
    // System.out.println("Los finales de las colas coinciden: " +
    // finalesCoinciden);

    // boolean esCapicua = metodoCola.esCapicua(cola1);
    // System.out.println("La cola es capicúa: " + esCapicua);

    boolean sonInversas = metodoCola.chequearInversa(cola1, cola2);
    System.out.println("Las colas son inversas: " + sonInversas);
  }
}
