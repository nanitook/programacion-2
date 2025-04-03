package implementaciones;

import java.util.Random;

import interfaces.ConjuntoTDA;

public class ConjuntoEstatico implements ConjuntoTDA {

  private int[] valores;
  private int cantidad;
  private Random r;

  @Override
  public void Inicializar() {
    valores = new int[100];
    cantidad = 0;
  }

  @Override
  public void Agregar(int valor) {
    if (!Pertenece(valor)) {
      valores[cantidad] = valor;
      cantidad++;
    }
  }

  @Override
  public boolean Pertenece(int valor) {
    boolean encontrado = false;
    for (int i = 0; i < cantidad && !encontrado; i++) {
      if (valor == valores[i]) {
        encontrado = true;
      }
    }

    return encontrado;
  }

  @Override
  public void Sacar(int valor) {
    boolean encontrado = false;
    for (int i = 0; i < cantidad && !encontrado; i++) {
      if (valor == valores[i]) {
        valores[i] = valores[cantidad - 1];
        cantidad--;
        encontrado = true;
      }
    }
  }

  @Override
  public int Elegir() {
    r = new Random();
    int pos = r.nextInt(cantidad);
    return valores[pos];
  }

  @Override
  public boolean EstaVacia() {
    return (cantidad == 0);
  }

}
