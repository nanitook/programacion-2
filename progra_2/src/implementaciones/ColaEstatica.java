package implementaciones;

import interfaces.ColaTDA;

public class ColaEstatica implements ColaTDA {

  int[] cola;
  int i;

  @Override
  public void InicializarCola() {
    cola = new int[100];
    i = 0;
  }

  @Override
  public void Acolar(int x) {
    cola[i] = x;
    i++;
  }

  @Override
  public void Desacolar() {
    i--;
    for (int j = 0; j < i; j++) {
      cola[j] = cola[j + 1];
    }
  }

  @Override
  public boolean ColaVacia() {
    return (i == 0);
  }

  @Override
  public int Primero() {
    return cola[0];
  }

}
