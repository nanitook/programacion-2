package interfaces;

public interface DiccionarioSimpleTDA {
  public void Inicializar();

  /**
   * Inicializada
   * 
   * @param clave
   * @param valor
   */
  public void Agregar(int clave, int valor);

  /**
   * Inicializada
   * 
   * @param clave
   */
  public void Eliminar(int clave);

  /**
   * No vacía y existe clave
   * 
   * @param clave
   * @return
   */
  public int Recuperar(int clave);

  /**
   * Inicializada
   * 
   * @return
   */
  public ConjuntoTDA ObtenerClaves();
}
