package metodos;

import interfaces.ConjuntoTDA;
import interfaces.DiccionarioSimpleTDA;

public class metodoDiccionarios {
  public static void MostrarDiccionario(DiccionarioSimpleTDA diccionario) {
    ConjuntoTDA claves = diccionario.ObtenerClaves();
    while (!claves.EstaVacia()) {
      int clave = claves.Elegir();
      int valor = diccionario.Recuperar(clave);
      System.out.println("Clave: " + clave + " Valor: " + valor);

      claves.Sacar(clave);
    }
  }
}
