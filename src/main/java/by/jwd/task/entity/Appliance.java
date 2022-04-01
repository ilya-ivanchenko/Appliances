package by.jwd.task.entity;

import java.util.Objects;

public class Appliance {

  private int id;
  private double sellingPrice;
  private int quantity;

  protected Appliance() {
  }

  public Appliance(int id, double sellingPrice, int quantity) {
    this.id = id;
    this.sellingPrice = sellingPrice;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public double getSellingPrice() {
    return sellingPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appliance appliance = (Appliance) o;
    return id == appliance.id && Double.compare(appliance.sellingPrice, sellingPrice) == 0
        && quantity == appliance.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sellingPrice, quantity);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " : " +
        "id=" + id +
        ", sellingPrice=" + sellingPrice +
        ", quantity=" + quantity +
        '.';
  }

  public static Builder newBuilder() {
    return new Appliance().new Builder();
  }

  public class Builder {
    protected Builder() {
    }

    public Builder setID(int id) {
      Appliance.this.id = id;
      return this;
    }

    public Builder setSellingPrice(double sellingPrice) {
      Appliance.this.sellingPrice = sellingPrice;
      return this;
    }

    public Builder setQuantity(int quantity) {
      Appliance.this.quantity = quantity;
      return this;
    }

    public Appliance build() {
      return Appliance.this;
    }
  }
}

