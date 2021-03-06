package controller.commands;

import controller.ImageCommand;
import imagemodel.ImageModelInterface;
import java.io.IOException;

/** This command runs save files operation. */
public class Save implements ImageCommand {
  private final String filename;
  /**
   * Default constructor.
   *
   * @param filename the name of the file.
   */

  public Save(String filename) {
    if (filename == null) {
      throw new IllegalArgumentException("null not allowed");
    }
    this.filename = filename;
  }

  @Override
  public void run(ImageModelInterface model)
      throws IllegalStateException, IOException, IllegalArgumentException {
    if (model == null) {
      throw new IllegalArgumentException("Null arguments not allowed");
    }
    String[] arrOfStr = filename.split("\\.", 2);
    if (arrOfStr[1].equals("txt")) {
      model.savePattern(filename);
    } else {
      model.saveImage(filename);
    }
  }
}
