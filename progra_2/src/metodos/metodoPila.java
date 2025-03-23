package metodos;

import implementaciones.PilaDinamica;
import interfaces.PilaTDA;

public class metodoPila {

  public static void mostrar(PilaTDA pila) {
    while (!pila.PilaVacia()) {
      System.out.println(pila.Tope());
      pila.Desapilar();
    }
  }

  public static void mover(PilaTDA ori, PilaTDA dest) {
    while (!ori.PilaVacia()) {
      dest.Apilar(ori.Tope());
      ori.Desapilar();
    }
  }

  public static void mostrarSinEliminar(PilaTDA pila) {
    PilaTDA aux = new PilaDinamica();
    aux.InicializarPila();

    while (!pila.PilaVacia()) {
      System.out.println(pila.Tope());
      aux.Apilar(pila.Tope());
      pila.Desapilar();
    }

    System.out.println("--");

    mover(aux, pila);
  }

  public static void copiar(PilaTDA ori, PilaTDA dest) {
    PilaTDA aux = new PilaDinamica();
    aux.InicializarPila();

    while (!ori.PilaVacia()) {
      aux.Apilar(ori.Tope());
      ori.Desapilar();
    }

    while (!aux.PilaVacia()) {
      dest.Apilar(aux.Tope());
      ori.Apilar(aux.Tope());
      aux.Desapilar();
    }
  }

  public static void invertir(PilaTDA pila) {
    PilaTDA aux = new PilaDinamica();
    aux.InicializarPila();

    while (!pila.PilaVacia()) {
      aux.Apilar(pila.Tope());
      pila.Desapilar();
    }

    mover(aux, pila);
  }

  public static int contarElementos(PilaTDA pila) {
    int contador = 0;

    while (!pila.PilaVacia()) {
      contador++;
      pila.Desapilar();
    }

    return contador;
  }

  public static int sumarElementos(PilaTDA pila) {
    int suma = 0;

    while (!pila.PilaVacia()) {
      suma += pila.Tope();
      pila.Desapilar();
    }

    return suma;
  }

  public static int promedioElementos(PilaTDA pila) {
    int suma = 0;
    int contador = 0;

    while (!pila.PilaVacia()) {
      suma += pila.Tope();
      contador++;
      pila.Desapilar();
    }

    return suma / contador;
  }

}
