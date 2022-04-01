package by.jwd.task.entity;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {
  private int powerConsumption;
  private int numberOfSpeakers;
  private String frequencyRange;
  private int cordLength;

  private Speakers() {}

  public Speakers(int id, double sellingPrice, int quantity, int powerConsumption, int numberOfSpeakers, String frequencyRange,
      int cordLength) {
    super(id, sellingPrice, quantity);
    this.powerConsumption = powerConsumption;
    this.numberOfSpeakers = numberOfSpeakers;
    this.frequencyRange = frequencyRange;
    this.cordLength = cordLength;
  }

  public int getPowerConsumption() {
    return powerConsumption;
  }

  public int getNumberOfSpeakers() {
    return numberOfSpeakers;
  }

  public String getFrequencyRange() {
    return frequencyRange;
  }

  public int getCordLength() {
    return cordLength;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Speakers speakers = (Speakers) o;
    return powerConsumption == speakers.powerConsumption
        && numberOfSpeakers == speakers.numberOfSpeakers && cordLength == speakers.cordLength
        && Objects.equals(frequencyRange, speakers.frequencyRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "id=" + super.getId() +
        ", powerConsumption=" + powerConsumption +
        ", numberOfSpeakers=" + numberOfSpeakers +
        ", frequencyRange='" + frequencyRange + '\'' +
        ", cordLength=" + cordLength +
        ", quantity=" + super.getQuantity() +
        ", sellingPrice=" + super.getSellingPrice() +
        '.';
  }

  public static Builder newBuilder() {
    return new Speakers().new Builder();
  }

  public class Builder extends Appliance.Builder{

    private Builder() {
    }

    public Builder setID(int id) {
      super.setID(id);
      return this;
    }

    public Builder setSellingPrice(double sellingPrice) {
      super.setSellingPrice(sellingPrice);
      return this;
    }

    public Builder setQuantity(int quantity) {
      super.setQuantity(quantity);
      return this;
    }

    public Builder setPowerConsumption(int powerConsumption) {
      Speakers.this.powerConsumption = powerConsumption;
      return this;
    }

    public Builder setNumberOfSpeakers(int numberOfSpeakers) {
      Speakers.this.numberOfSpeakers = numberOfSpeakers;
      return this;
    }

    public Builder setFrequencyRange(String frequencyRange) {
      Speakers.this.frequencyRange = frequencyRange;
      return this;
    }

    public Builder setCordLength(int cordLength) {
      Speakers.this.cordLength = cordLength;
      return this;
    }

    public Speakers build() {
      return Speakers.this;
    }
  }
}
