package it.uniroma1.fabbricasemantica.data;

import java.io.IOException;

/* 
 * Represents the DataProvider object, that provides the needed data (examples) for the task pages.
*/
public interface DataProvider<T> {

  /**
   * Returns an object of type <T> for the input Task.
   * @param task [The task for which data is needed]
   * @throws IOException
   */
  T getData(Task task) throws IOException;

}
