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

    mover(aux, pila);
  }

}
