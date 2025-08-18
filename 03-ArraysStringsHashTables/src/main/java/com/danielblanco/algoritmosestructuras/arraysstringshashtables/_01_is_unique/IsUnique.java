package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 *
 * Mi implementacion no es mala. Tiene una complejidad aparente de O(n)....
 * O bueno, eso es lo que pensaba. Yo creia que estaba evitando ese n^2
 * al usar mi 'ArrayList'.
 *
 * Pero un ArrayList a la hora de agregar un nuevo registro, como no apunta a direcciones de memoria y tiene un indice
 * fijo, se vuelve pesado. Ademas la consulta pasa un poco mas de lo mismo. ese contains empieza a buscar dentro de y
 * eso vuelve mi codigo a que no sea tan perro.
 *
 * En cambio si creo un HashList. Este codigo seria mejor. Porque para buscar, hasheo el index y ya tengo la posicion a
 * donde ir a buscar. Y el agregar, simplemente adentro tiene una lista enlazada
 *
 *
 * Eso como primera optimizacion. Lo bajo a O(n)...
 *
 * Sin embargo, esto se puede reducir aun mas.
 * Un alfabeto de caracteres ascii contiene 128 chars. por tanto
 * si contiene mas mi string es obvio que se duplican chars. por tanto el codigo quedaria asi
 */
public class IsUnique {

  private static final int NUMBER_CHARS = 128;
  public boolean isUnique(String s) {
    if( s.length() > NUMBER_CHARS ) return false;

    Set<Character> characters = new HashSet<>();
    for(Character c : s.toCharArray()) {
      if (characters.contains(c)) return false;
      characters.add(c);
    }
    return true;
  }
}
