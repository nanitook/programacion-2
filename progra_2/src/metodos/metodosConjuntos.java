package metodos;

import implementaciones.ColaDinamica;
import implementaciones.ColaEstatica;
import implementaciones.ConjuntoEstatico;
import interfaces.ColaTDA;
import interfaces.ConjuntoTDA;

public class metodosConjuntos {

  public static void Imprimir(ConjuntoTDA conjunto) {
    ConjuntoTDA copia = CopiarConjunto(conjunto);
    while (!copia.EstaVacia()) {
      int valor = copia.Elegir();
      System.out.println(valor);
      copia.Sacar(valor);
    }
  }

  public static ConjuntoTDA Union(ConjuntoTDA c1, ConjuntoTDA c2) {
    ConjuntoTDA resultado = new ConjuntoEstatico();
    resultado.Inicializar();

    ConjuntoTDA aux = new ConjuntoEstatico();
    aux.Inicializar();

    while (!c1.EstaVacia()) {
      int valor = c1.Elegir();
      resultado.Agregar(valor);
      aux.Agregar(valor);
      c1.Sacar(valor);
    }
    while (!aux.EstaVacia()) {
      int valor = aux.Elegir();
      c1.Agregar(valor);
      aux.Sacar(valor);
    }

    while (!c2.EstaVacia()) {
      int valor = c2.Elegir();
      resultado.Agregar(valor);
      aux.Agregar(valor);
      c2.Sacar(valor);
    }
    while (!aux.EstaVacia()) {
      int valor = aux.Elegir();
      c2.Agregar(valor);
      aux.Sacar(valor);
    }

    return resultado;
  }

  public static ConjuntoTDA Union_v2(ConjuntoTDA c1, ConjuntoTDA c2) {
    ConjuntoTDA resultado = new ConjuntoEstatico();
    resultado.Inicializar();

    ConjuntoTDA copia = CopiarConjunto(c1);
    while (!copia.EstaVacia()) {
      int valor = copia.Elegir();
      resultado.Agregar(valor);
      copia.Sacar(valor);
    }

    copia = CopiarConjunto(c2);
    while (!copia.EstaVacia()) {
      int valor = copia.Elegir();
      resultado.Agregar(valor);
      copia.Sacar(valor);
    }

    return resultado;
  }

  public static ConjuntoTDA CopiarConjunto(ConjuntoTDA ori) {
    ConjuntoTDA resultado = new ConjuntoEstatico();
    resultado.Inicializar();

    ConjuntoTDA aux = new ConjuntoEstatico();
    aux.Inicializar();

    while (!ori.EstaVacia()) {
      int valor = ori.Elegir();
      System.out.println("En copia" + valor);
      aux.Agregar(valor);
      resultado.Agregar(valor);
      ori.Sacar(valor);
    }

    while (!aux.EstaVacia()) {
      int valor = aux.Elegir();
      ori.Agregar(valor);
      aux.Sacar(valor);
    }

    return resultado;
  }

  public static ConjuntoTDA Interseccion(ConjuntoTDA c1, ConjuntoTDA c2) {
    ConjuntoTDA resultado = new ConjuntoEstatico();
    resultado.Inicializar();

    ConjuntoTDA copia = CopiarConjunto(c1);
    while (!copia.EstaVacia()) {
      int valor = copia.Elegir();
      if (c2.Pertenece(valor)) {
        resultado.Agregar(valor);
      }
      copia.Sacar(valor);
    }

    return resultado;
  }

  public static ConjuntoTDA Diferencia(ConjuntoTDA a, ConjuntoTDA b) {
    ConjuntoTDA resultado = new ConjuntoEstatico();
    resultado.Inicializar();

    ConjuntoTDA copia = CopiarConjunto(a);
    ConjuntoTDA interseccion = Interseccion(a, b);

    while (!copia.EstaVacia()) {
      int valor = copia.Elegir();
      if (!interseccion.Pertenece(valor)) {
        resultado.Agregar(valor);
      }
      copia.Sacar(valor);
    }

    return resultado;
  }

  public static boolean SonIdenticos(ConjuntoTDA a, ConjuntoTDA b) {
    ConjuntoTDA copiaA = CopiarConjunto(a);
    ConjuntoTDA copiaB = CopiarConjunto(b);

    boolean sonIdenticos = true;

    while (!copiaA.EstaVacia()) {
      int valor = copiaA.Elegir();
      if (copiaB.Pertenece(valor)) {
        copiaB.Sacar(valor);
      }
      copiaA.Sacar(valor);
    }

    if (!copiaB.EstaVacia())
      sonIdenticos = false;

    return sonIdenticos;
  }

  public static ColaTDA CalcularCola(ConjuntoTDA c) {
    ColaTDA resultado = new ColaDinamica();
    resultado.InicializarCola();

    ConjuntoTDA copia = CopiarConjunto(c);
    // for (int i = 0; i < 6; i++) {
    while (!copia.EstaVacia()) {
      int valor = c.Elegir();
      int calculo = valor;
      int ultimo = valor;
      int valor2 = c.Elegir();

      while (valor2 > ultimo) {
        calculo += valor2;
        ultimo = valor2;
        valor2 = c.Elegir();
      }

      resultado.Acolar(calculo);
      int aux = copia.Elegir();
      copia.Sacar(aux);
    }

    return resultado;
  }
}
