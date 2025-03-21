package implementaciones;

import interfaces.ColaTDA;

public class ColaDinamica implements ColaTDA {

  Nodo primero;
  Nodo ultimo;

  @Override
  public void InicializarCola() {
    primero = null;
    ultimo = null;
  }

  @Override
  public void Acolar(int x) {
    Nodo aux = new Nodo();
    aux.v = x;
    aux.sig = null; // No hace falta

    if (this.ColaVacia()) {
      primero = aux;
    } else {
      ultimo.sig = aux;
    }

    ultimo = aux;
  }

  @Override
  public void Desacolar() {
    primero = primero.sig;
  }

  @Override
  public boolean ColaVacia() {
    return (primero == null);
  }

  @Override
  public int Primero() {
    return primero.v;
  }

}
