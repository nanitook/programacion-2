package implementaciones;

import interfaces.ColaPrioridadTDA;

public class ColaPrioridadLD implements ColaPrioridadTDA {

  NodoPrioridad origen;

  @Override
  public void InicializarCola() {
    origen = null;
  }

  @Override
  public void AcolarPrioridad(int x, int prioridad) {
    NodoPrioridad nuevo = new NodoPrioridad();
    nuevo.valor = x;
    nuevo.prioridad = prioridad;

    if (origen == null) {
      origen = nuevo;
      origen.siguiente = null;
    } else if (origen.prioridad < prioridad) {
      nuevo.siguiente = origen;
      origen = nuevo;
    } else {
      NodoPrioridad turista = origen;
      while (turista.siguiente != null && turista.siguiente.prioridad <= prioridad) {
        turista = turista.siguiente;
      }
      nuevo.siguiente = turista.siguiente;
      turista.siguiente = nuevo;
    }
  }

  @Override
  public void Desacolar() {
    origen = origen.siguiente;
  }

  @Override
  public boolean ColaVacia() {
    return (origen == null);
  }

  @Override
  public int Primero() {
    return origen.valor;
  }

  @Override
  public int Proridad() {
    return origen.prioridad;
  }

}
