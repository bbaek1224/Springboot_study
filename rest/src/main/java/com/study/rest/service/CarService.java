package com.study.rest.service;

import com.study.rest.entity.Car;
import com.study.rest.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class CarService {

    @Autowired
    private CarRepository carRepository;

//  final -> 상수: 무조건 한번은 초기화를 해줘야 한다.
//  private final CarRepository carRepository;

    public Car getCar(String model) {
        return carRepository.findCarByModel(model);
    }

//    public CarService(CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }
}
