package com.danielblanco.algoritmosestructuras.arraysstringshashtables._03_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Un anagrama es una palabra creada a partir de la reordenación de las letras de otra palabra. Ej: saco - caso
 * Dado un array de strings, devuelve los anagramas agrupados. Cualquier orden es válido.
 *
 * Ejemplo:
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"].
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */
public class GroupAnagrams {

  public static List<List<String>> groupAnagrams(String[] words) {
    /**
     * Mi solucion esta en mi cabeza pero a la vez no!!!
     *
     * La primera evidentemente es si contiene las mismas letras.
     * Caracteres.
     *
     * - Recorrer la primera del arreglo.
     * - Obtener la segunda del arreglo
     * - validar si s esta en la segunda palabra, si a esta en la segunda palabra, C...
     * -> Muy complejo O(n^3)
     * ----
     *
     * -> Verificar la longitud de la palabra.
     * -> Si existe una con la misma longitud
     *
     *
     * Verga a ver se me ocurre esa del hash, el pedo es que adentro tiene que ir una lista xd, entonces la complejidad
     * sigue elevando, y sumanod que lo quiero ordenar antes de meter
     * Primero se me ocurre en un hash agregar la longitud y luego la palabra
     */


    /**
     * Espera mi cerebro acaba de dar la solucion
     *
     * Llega y la ordeno y la guardo
     * Llave (palabra ordenada), key: palabra normal
     *
     * if contains (palabra ordenada)
     * results push(new String{hash.get(palabraOrdenada), palabra})
     */

    if (words.length == 0) {
      return Arrays.asList(Arrays.asList());
    }

    HashMap<String, List<String>> sortedStrings = new HashMap<>();
    List<List<String>> results = new ArrayList<>();

    for(int i = 0; i < words.length; i++) {
      String word = words[i];
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String sortedWord = new String(chars);

      if (!sortedStrings.containsKey(sortedWord)) {
        sortedStrings.put(sortedWord, new ArrayList<>());
      }

      sortedStrings.get(sortedWord).add(word);
    }

    for (String key: sortedStrings.keySet()) {
      results.add(sortedStrings.get(key));
    }

    System.out.println(sortedStrings.values().toString());
    return new ArrayList<>(sortedStrings.values());
  }

  public static void main(String[] args) {
    groupAnagrams(new String[] {"saco", "arresto", "programa", "rastreo", "caso"});
  }
}