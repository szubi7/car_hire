package hu.elte.alkfejl.carhire.service;

import hu.elte.alkfejl.carhire.model.Car;
import hu.elte.alkfejl.carhire.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    /*
        Új autó hozzáadása a rendszerhez:
    */
    public void addCar(Car car) {
        carRepository.save(car);
    }

}