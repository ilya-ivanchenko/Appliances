package by.jwd.task.construction;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import by.jwd.task.entity.*;
import by.jwd.task.entity.criteria.Criteria;
import by.jwd.task.entity.criteria.SearchCriteria;
import java.util.Map;

public final class ConstructorAppImpl implements ConstructorApp {

  private ConstructorAppImpl() {
  }

  private static Appliance appliance;
  private static final ConstructorAppImpl instance = new ConstructorAppImpl();

  public static ConstructorAppImpl getInstance() {
    return instance;
  }

  @Override
  public Appliance constructOven(Map<String, Object> map, Criteria criteria) {
    if (Oven.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = Oven.newBuilder()
          .setID(parseInt((String) map.get(SearchCriteria.Oven.ID.toString())))
          .setSellingPrice(parseDouble((String) map.get(SearchCriteria.Oven.SELLING_PRICE.toString())))
          .setQuantity(parseInt((String) map.get(SearchCriteria.Oven.QUANTITY.toString())))
          .setPowerConsumption(
              parseInt((String) map.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())))
          .setWeight(parseInt((String) map.get(SearchCriteria.Oven.WEIGHT.toString())))
          .setCapacity(parseInt((String) map.get(SearchCriteria.Oven.CAPACITY.toString())))
          .setDepth(parseInt((String) map.get(SearchCriteria.Oven.DEPTH.toString())))
          .setHeight(parseInt((String) map.get(SearchCriteria.Oven.HEIGHT.toString())))
          .setWidth(parseInt((String) map.get(SearchCriteria.Oven.WIDTH.toString())))
          .build();
    }
    return appliance;
  }

  @Override
  public Appliance constructTabletPC(Map<String, Object> map, Criteria criteria) {
    if (TabletPC.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = TabletPC.newBuilder()
          .setID(parseInt((String) map.get(SearchCriteria.TabletPC.ID.toString())))
          .setSellingPrice(parseDouble((String) map.get(SearchCriteria.TabletPC.SELLING_PRICE.toString())))
          .setQuantity(parseInt((String) map.get(SearchCriteria.TabletPC.QUANTITY.toString())))
          .setBatteryCapacity(
              parseInt((String) map.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())))
          .setDisplayInches(
              parseInt((String) map.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())))
          .setMemoryRom(parseInt((String) map.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())))
          .setFlashMemoryCapacity(
              parseInt((String) map.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())))
          .setColor((String) map.get(SearchCriteria.TabletPC.COLOR.toString()))
          .build();
    }
    return appliance;
  }

  @Override
  public Appliance constructLaptop(Map<String, Object> map, Criteria criteria) {
    if (Laptop.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = Laptop.newBuilder()
          .setID(parseInt((String) map.get(SearchCriteria.Laptop.ID.toString())))
          .setSellingPrice(parseDouble((String) map.get(SearchCriteria.Laptop.SELLING_PRICE.toString())))
          .setQuantity(parseInt((String) map.get(SearchCriteria.Laptop.QUANTITY.toString())))
          .setBatteryCapacity(
              parseDouble((String) map.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())))
          .setOS((String) map.get(SearchCriteria.Laptop.OS.toString()))
          .setMemoryRom(parseInt((String) map.get(SearchCriteria.Laptop.MEMORY_ROM.toString())))
          .setSystemMemory(
              parseInt((String) map.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())))
          .setCPU(parseDouble((String) map.get(SearchCriteria.Laptop.CPU.toString())))
          .setDisplayInches(
              parseInt((String) map.get(SearchCriteria.Laptop.DISPLAY_INCHES.toString())))
          .build();
    }
    return appliance;
  }

  @Override
  public Appliance constructRefrigerator(Map<String, Object> map, Criteria criteria) {
    if (Refrigerator.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = Refrigerator.newBuilder()
              .setID(parseInt((String) map.get(SearchCriteria.Refrigerator.ID.toString())))
              .setSellingPrice(parseDouble((String) map.get(SearchCriteria.Refrigerator.SELLING_PRICE.toString())))
              .setQuantity(parseInt((String) map.get(SearchCriteria.Refrigerator.QUANTITY.toString())))
              .setPowerConsumption(
               parseInt((String) map.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())))
              .setWeight(parseInt((String) map.get(SearchCriteria.Refrigerator.WEIGHT.toString())))
              .setFreezerCapacity(parseInt((String) map.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())))
              .setOverallCapacity(parseInt((String) map.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())))
              .setHeight(parseInt((String) map.get(SearchCriteria.Refrigerator.HEIGHT.toString())))
              .setWidth(parseInt((String) map.get(SearchCriteria.Refrigerator.WIDTH.toString())))
              .build();
    }
    return appliance;
  }

  @Override
  public Appliance constructSpeakers(Map<String, Object> map, Criteria criteria) {
    if (Speakers.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = Speakers.newBuilder()
              .setID(parseInt((String) map.get(SearchCriteria.Speakers.ID.toString())))
              .setSellingPrice(parseDouble((String) map.get(SearchCriteria.Speakers.SELLING_PRICE.toString())))
              .setQuantity(parseInt((String) map.get(SearchCriteria.Speakers.QUANTITY.toString())))
              .setPowerConsumption(
                      parseInt((String) map.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())))
              .setCordLength(parseInt((String) map.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())))
              .setFrequencyRange((String) map.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()))
              .build();
    }
    return appliance;
  }

  @Override
  public Appliance constructVacuumCleaner(Map<String, Object> map, Criteria criteria) {
    if (VacuumCleaner.class.getSimpleName().equals(criteria.getGroupSearchName())) {
      appliance = VacuumCleaner.newBuilder()
              .setID(parseInt((String) map.get(SearchCriteria.VacuumCleaner.ID.toString())))
              .setSellingPrice(parseDouble((String) map.get(SearchCriteria.VacuumCleaner.SELLING_PRICE.toString())))
              .setQuantity(parseInt((String) map.get(SearchCriteria.VacuumCleaner.QUANTITY.toString())))
              .setPowerConsumption(
                      parseInt((String) map.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())))
              .setFilterType((String) map.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()))
              .setBagType((String) map.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()))
              .setWandType((String) map.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()))
              .setMotorSpeedRegulation(parseInt((String) map.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())))
              .setCleaningWidth(parseInt((String) map.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())))
              .build();
    }
    return appliance;
  }
}


