package animals;

import java.time.temporal.ValueRange;

/**
 * Creates an object that tracks the temperature, preferred natural feature and size of the animal.
 */
public class PhysicalCharacteristics {
  private final ValueRange temperature;
  private final String naturalFeature;
  private final SizeofSpecies size;

  /**
   * Constructs a physical characteristics object with the specified parameters.
   *
   * @param size in medium, small or large
   * @param temperature in celsius
   * @param naturalFeature preferred natural features
   */
  public PhysicalCharacteristics(
      SizeofSpecies size, ValueRange temperature, String naturalFeature) throws IllegalArgumentException {
    if (naturalFeature.trim().isEmpty()) throw new IllegalArgumentException("Natural Feature can't be empty");
    this.temperature = temperature;
    this.naturalFeature = naturalFeature;
    this.size = size;
  }

  /**
   * Get the temperature range for the animal.
   *
   * @return ValueRange
   */
  public ValueRange getTemperature() {
    return temperature;
  }

  /**
   * Gets the natural feature preference for the animal.
   *
   * @return String
   */
  public String getNaturalFeature() {
    return naturalFeature;
  }

  /**
   * Gets the current size of the species.
   *
   * @return SizeofSpecies object.
   */
  public SizeofSpecies getSize() {
    return size;
  }



  /**
   * Gets important details needed to describe the class.
   * @return String
   */
  @Override
  public String toString() {
    return String.format("Temperature Range: %s, Preferred Natural Feature: %s, Size: %s", getTemperature(), getNaturalFeature(), getSize());
  }
}
