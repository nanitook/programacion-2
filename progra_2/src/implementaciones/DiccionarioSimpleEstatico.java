package implementaciones;

import interfaces.ConjuntoTDA;
import interfaces.DiccionarioSimpleTDA;

public class DiccionarioSimpleEstatico implements DiccionarioSimpleTDA {

  class NodoDiccionario {
    int clave;
    int valor;
  }

  private NodoDiccionario[] valores;
  private int cantidad;

  @Override
  public void Inicializar() {
    valores = new NodoDiccionario[100];
    cantidad = 0;
  }

  @Override
  public void Agregar(int clave, int valor) {
    int pos = BuscarPosicion(clave);
    if (pos == -1) { // No existe
      NodoDiccionario aux = new NodoDiccionario();
      aux.clave = clave;
      aux.valor = valor;

      valores[cantidad] = aux;
      cantidad++;
    } else { // Existe
      valores[pos].valor = valor;
    }
  }

  @Override
  public void Eliminar(int clave) {
    int pos = BuscarPosicion(clave);
    if (pos != -1) {
      valores[pos] = valores[cantidad - 1];
      cantidad--;
    }
  }

  @Override
  public int Recuperar(int clave) {
    int pos = BuscarPosicion(clave);
    if (pos != -1) {
      return valores[pos].valor;
    }
    return 0;
  }

  @Override
  public ConjuntoTDA ObtenerClaves() {
    ConjuntoTDA resultado = new ConjuntoEstatico();
    resultado.Inicializar();

    for (int i = 0; i < cantidad; i++) {
      resultado.Agregar(valores[i].clave);
    }

    return resultado;
  }

  // Métodos de servicio - son aquellos métodos que usamos para resolver problemas
  // dentro de la implementación
  private int BuscarPosicion(int clave) {
    int pos = -1;
    boolean encontrado = false;

    for (int i = 0; i < cantidad && !encontrado; i++) {
      if (valores[i].clave == clave) {
        pos = i;
        // break; // Poner un break no está mal pero en esta materia es mejor no hacerlo
        encontrado = true;
      }
    }

    return pos;
  }

}
