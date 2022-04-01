package by.jwd.task.entity;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {

  private int powerConsumption;
  private int weight;
  private int freezerCapacity;
  private double overallCapacity;
  private int height;
  private int width;

  public Refrigerator() {
  }

  public Refrigerator(int id, double sellingPrice, int quantity, int powerConsumption, int weight, int freezerCapacity, double overallCapacity,
      int height, int width) {
    super(id, sellingPrice, quantity);
    this.powerConsumption = powerConsumption;
    this.weight = weight;
    this.freezerCapacity = freezerCapacity;
    this.overallCapacity = overallCapacity;
    this.height = height;
    this.width = width;
  }

  public int getPowerConsumption() {
    return powerConsumption;
  }

  public int getWeight() {
    return weight;
  }

  public int getFreezerCapacity() {
    return freezerCapacity;
  }

  public double getOverallCapacity() {
    return overallCapacity;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Refrigerator that = (Refrigerator) o;
    return powerConsumption == that.powerConsumption && weight == that.weight
        && freezerCapacity == that.freezerCapacity
        && Double.compare(that.overallCapacity, overallCapacity) == 0
        && height == that.height && width == that.width;
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "id=" + super.getId() +
        ", powerConsumption=" + powerConsumption +
        ", weight=" + weight +
        ", freezerCapacity=" + freezerCapacity +
        ", overallCapacity=" + overallCapacity +
        ", height=" + height +
        ", width=" + width +
        ", quantity=" + super.getQuantity() +
        ", sellingPrice=" + super.getSellingPrice() +
        '.';
  }

  public static Builder newBuilder() {
    return new Refrigerator().new Builder();
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
      Refrigerator.this.powerConsumption = powerConsumption;
      return this;
    }

    public Builder setWeight(int weight) {
      Refrigerator.this.weight = weight;
      return this;
    }

    public Builder setFreezerCapacity(int freezerCapacity) {
      Refrigerator.this.freezerCapacity = freezerCapacity;
      return this;
    }

    public Builder setOverallCapacity(double overallCapacity) {
      Refrigerator.this.overallCapacity = overallCapacity;
      return this;
    }

    public Builder setHeight(int height) {
      Refrigerator.this.height = height;
      return this;
    }

    public Builder setWidth(int width) {
      Refrigerator.this.width = width;
      return this;
    }

    public Refrigerator build() {
      return Refrigerator.this;
    }
  }
}
