package implementaciones;

import interfaces.ColaPrioridadTDA;

public class ColaPrioridadAO implements ColaPrioridadTDA {

  Elemento[] elementos;
  int cantidad;

  @Override
  public void InicializarCola() {
    elementos = new Elemento[111];
    cantidad = 0;
  }

  @Override
  public void AcolarPrioridad(int x, int prioridad) {
    int i = cantidad;
    while (i > 0 && elementos[i - 1].prioridad >= prioridad) {
      elementos[i] = elementos[i - 1];
      i--;
    }

    elementos[i] = new Elemento();
    elementos[i].valor = x;
    elementos[i].prioridad = prioridad;

    cantidad++;
  }

  @Override
  public void Desacolar() {
    cantidad--;
  }

  @Override
  public boolean ColaVacia() {
    return (cantidad == 0);
  }

  @Override
  public int Primero() {
    return elementos[cantidad - 1].valor;
  }

  @Override
  public int Proridad() {
    return elementos[cantidad - 1].prioridad;
  }

}
