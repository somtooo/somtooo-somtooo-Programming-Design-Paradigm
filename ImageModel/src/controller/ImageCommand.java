package controller;

import imagemodel.ImageModelInterface;
import java.io.IOException;

/** Represents commands that can be carried out by the controller. */
public interface ImageCommand {
  /**
   * Starting point for the controller.
   *
   * @param model the model to use.
   * @throws IOException if files cant be found.
   * @throws IllegalStateException if images arent loaded before processing.
   * @throws IllegalArgumentException if model or image is null.
   */
  void run(ImageModelInterface model)
      throws IOException, IllegalStateException, IllegalArgumentException;
}
