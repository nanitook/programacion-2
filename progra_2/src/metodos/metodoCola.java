package metodos;

import implementaciones.ColaDinamica;
import implementaciones.ColaEstatica;
import implementaciones.PilaDinamica;
import interfaces.ColaTDA;
import interfaces.PilaTDA;

public class metodoCola {

  public static void imprimirCola(ColaTDA cola) {
    ColaTDA aux = new ColaDinamica();
    aux.InicializarCola();

    while (!cola.ColaVacia()) {
      int elemento = cola.Primero();
      System.out.print(elemento + " ");
      aux.Acolar(elemento);
      cola.Desacolar();
    }
    System.out.println("");
    mover(aux, cola);
  }

  public static void mover(ColaTDA ori, ColaTDA dest) {
    while (!ori.ColaVacia()) {
      dest.Acolar(ori.Primero());
      ori.Desacolar();
    }
  }

  public static void copiar(ColaTDA ori, ColaTDA dest) {
    ColaTDA aux = new ColaDinamica();
    aux.InicializarCola();

    while (!ori.ColaVacia()) {
      aux.Acolar(ori.Primero());
      ori.Desacolar();
    }
    while (!aux.ColaVacia()) {
      int elemento = aux.Primero();
      dest.Acolar(elemento);
      ori.Acolar(elemento);
      aux.Desacolar();
    }
  }

  public static int extraerUltimo(ColaTDA cola) {
    ColaTDA aux = new ColaEstatica();
    aux.InicializarCola();

    int ultimo = 0;

    while (!cola.ColaVacia()) {
      ultimo = cola.Primero();
      cola.Desacolar();
      if (!cola.ColaVacia()) {
        aux.Acolar(ultimo);
      }
    }

    mover(aux, cola);

    return ultimo;
  }

  public static void invertirConPila(ColaTDA cola) {
    PilaTDA aux = new PilaDinamica();
    aux.InicializarPila();

    while (!cola.ColaVacia()) {
      aux.Apilar(cola.Primero());
      cola.Desacolar();
    }
    while (!aux.PilaVacia()) {
      cola.Acolar(aux.Tope());
      aux.Desapilar();
    }
  }

  public static ColaTDA invertirSinPilas(ColaTDA cola) {
    ColaTDA invertida = new ColaDinamica();
    invertida.InicializarCola();

    while (!cola.ColaVacia()) {
      int ultimo = extraerUltimo(cola);
      invertida.Acolar(ultimo);
    }

    imprimirCola(invertida);
    return invertida;
  }

  public static boolean finalesCoinciden(ColaTDA c1, ColaTDA c2) {
    invertirConPila(c1);
    invertirConPila(c2);

    return (c1.Primero() == c2.Primero());
  }

  public static boolean esCapicua(ColaTDA cola) {
    PilaTDA pilaAux = new PilaDinamica();
    pilaAux.InicializarPila();
    ColaTDA colaAux = new ColaDinamica();
    colaAux.InicializarCola();

    while (!cola.ColaVacia()) {
      int elemento = cola.Primero();
      pilaAux.Apilar(elemento);
      colaAux.Acolar(elemento);
      cola.Desacolar();
    }

    while (!colaAux.ColaVacia()) {
      int original = colaAux.Primero();
      int invertido = pilaAux.Tope();
      if (original != invertido) {
        return false;
      }
      colaAux.Desacolar();
      pilaAux.Desapilar();
    }

    return true;
  }

  public static boolean chequearInversa(ColaTDA c1, ColaTDA c2) {
    invertirConPila(c1);

    while (!c1.ColaVacia() && !c2.ColaVacia()) {
      if (c1.Primero() != c2.Primero()) {
        return false;
      }
      c1.Desacolar();
      c2.Desacolar();
    }

    // si no tienen la misma cantidad de elementos no pueden ser inversas
    return c1.ColaVacia() && c2.ColaVacia();
  }

}
