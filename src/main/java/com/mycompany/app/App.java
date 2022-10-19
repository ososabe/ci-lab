package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
  public static String triangulo(int a, int b, int c) {

    if (!(a + b > c && a + c > b && b + c > a)) {
      return "error no es un triangulo";
    }
    if (a == b && a == c && b == c) {
      return "es un triangulo equilatero";
    }
    if (a == b || a == c || b == c) {
      return "es un triangulo isoceles";
    }
    
    if (a != b && a != c && b != c) {
      return "es un triangolo escaleno";
    }
    
     if(esTrianguloPitagorico( a, b,  c)){
      return "es un triangolo pitagorico";
    }
      return "error no es un triangulo";
  }
  
  private static boolean esTrianguloPitagorico(int a,int b, int c){
   //a2 + b2 = c2
    if (a > b && a > c) {
      if ((Math.pow(a,2)) == (Math.pow(b,2)) + (Math.pow(c,2))) {
        return true;
      } 
    } else if (b > a  &&  b > c) {
      if ((Math.pow(b,2)) == (Math.pow(a,2)) + (Math.pow(c,2))) {
        return  true;
      } 
    } else if (c > a  &&  c > b) {
      if ((Math.pow(c,2)) == (Math.pow(a,2)) + (Math.pow(b,2))) {
        return  true;
      } 
	 } 
    
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
