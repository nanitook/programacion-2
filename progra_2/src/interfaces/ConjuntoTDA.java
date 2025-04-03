package interfaces;

public interface ConjuntoTDA {
  public void Inicializar();

  /**
   * Inicializada
   */
  public void Agregar(int valor);

  /**
   * Inicializada
   */
  public boolean Pertenece(int valor);

  /**
   * Inicializada
   */
  public void Sacar(int valor);

  /**
   * No vacía
   */
  public int Elegir();

  /**
   * Inicializada
   */
  public boolean EstaVacia();
}
