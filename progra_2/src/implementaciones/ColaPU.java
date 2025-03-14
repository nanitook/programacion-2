package implementaciones;

import interfaces.ColaTDA;

public class ColaPU implements ColaTDA {

  int[] cola;
  int indice;

  public void InicializarCola() {
    cola = new int[100];
    indice = 0;
  }

  public void Acolar(int x) {
    cola[indice] = x;
    indice++;
  }

  public void Desacolar() {
    for (int i = 0; i < indice - 1; i++)
      cola[i] = cola[i + 1];
    indice--;
  }

  public int Primero() {
    return cola[0];
  }

  public boolean ColaVacia() {
    return (indice == 0);
  }

  public void ImprimirCola() {
    for (int i = 0; i < indice; i++) {
      System.out.print(cola[i] + " ");
    }
    System.out.println();
  }

}
