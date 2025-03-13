import implementaciones.PilaEstatica;
import interfaces.PilaTDA;

public class ejercicio1 {
  public static void main(String[] args) {
    System.out.println("hola sofuch");

    PilaTDA p1 = new PilaEstatica();

    p1.InicializarPila();
    p1.Apilar(1);
    p1.Apilar(2);
    p1.Apilar(3);
    System.out.println(p1.PilaVacia());
    System.out.println(p1.Tope());
    System.out.println(p1.Tope());
  }
}
