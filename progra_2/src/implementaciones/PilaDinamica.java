package implementaciones;

import interfaces.PilaTDA;

public class PilaDinamica implements PilaTDA {

  Nodo primero;

  public void InicializarPila() {
    primero = null;
  }

  public void Apilar(int x) {
    Nodo aux = new Nodo();
    aux.v = x;
    aux.sig = primero;
    primero = aux;
  }

  public void Desapilar() {
    primero = primero.sig;
  }

  public int Tope() {
    return primero.v;
  }

  public boolean PilaVacia() {
    return (primero == null);
  }

}
