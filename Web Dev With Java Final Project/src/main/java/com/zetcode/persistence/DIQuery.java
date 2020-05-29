package com.zetcode.persistence;

import com.zetcode.bean.Car;
import java.util.List;

public interface DIQuery {

  public void saveCar(Car car);
  public Car findCar(Long id);
  public List<Car> findAll();
}