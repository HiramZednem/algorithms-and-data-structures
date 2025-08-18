package com.danielblanco.algoritmosestructuras.arraysstringshashtables._02_two_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Dado un array de números enteros y un target, retorna los índices de dos
 * números para los que la suma de ambos sea igual al target.
 *
 * Puedes asumir que hay solamente una solución.
 *
 * Ejemplo 1:
 *  Input: nums = [9,2,5,6], target = 7
 *  Output: [1,2]
 *  Explicación: nums[1] + nums[2] == 7, devolvemos [1, 2].
 *
 * Ejemplo 2:
 *  Input: nums = [9,2,5,6], target = 100
 *  Output: null
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    /**
     * La primera vez que resolvi este ejercicio, lo hice con dos ciclos for, aun me acuerdo xd
     * pero ahora soy alguien diferente...
     *
     * A ver tengo una solucion bien peraa, pensaba implementar otra vez mi arraylist de mrd, pero
     * para busqueda esta del culo...
     *
     * Por lo que lo que voy a hacer es crear un hashlist para insertar todos los valores.
     *
     * Y despues voy a recorrer el hash list uno por uno y voy a buscar el faltante en el hash
     */

    // Me rendi pq no pude sacar el indice de un hash, pero salaverga esta solucion...
//    List<Integer> numbers = new ArrayList<>();
//
//    for (int n : nums ) {
//      numbers.add(n);
//    }
//
//    for (int n: numbers) {
//      if(numbers.contains( target - n )) {
//        return new int[]{numbers.indexOf(n), numbers.indexOf(target-n)};
//      }
//    }

//    return null;


    Map<Integer, Integer> compMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      if( compMap.containsKey( nums[i] ) ) return new int[]{ compMap.get(nums[i]) , i};
      compMap.put(target-nums[i], i);
    }
    return null;
  }
}
