/**

 * TODO complete java docs
 */
package edu.cnm.deepdive.generics;

/**
 * @author Yolanda Philgreen
 *
 */
public interface ShufflerSorter<T extends Comparable<T>>extends Iterable<T>  {
/**
 * 
 */
    void shuffle();
  /**
   *   
   */
    void sort();
    
}
