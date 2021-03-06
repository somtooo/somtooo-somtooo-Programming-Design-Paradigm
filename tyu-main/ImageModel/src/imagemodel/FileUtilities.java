package imagemodel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** File utility class that has methods to read a file and write to a file. */
public class FileUtilities {

  /**
   * Reads content from a csv file and returns as a 2d array.
   *
   * @param path the path to the csv file.
   * @return a 2d array that has the contents of the file.
   */
  public static String[][] loadCsvFile(String path) throws IOException {
    String line;
    List<String[]> values = new ArrayList<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader(path));
      while ((line = br.readLine()) != null) {
        values.add(line.split(","));
      }
    } catch (IOException error) {
      error.printStackTrace();
    }

    values = values.subList(1, values.size());
    String[][] array = new String[values.size()][0];

    values.toArray(array);
    return array;
  }


}
