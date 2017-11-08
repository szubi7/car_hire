package hu.elte.alkfejl.carhire.repository;

import hu.elte.alkfejl.carhire.model.Hire;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HireRepository extends CrudRepository<Hire, Long> {
    //Kölcsönzés keresése a kölcsönző személy azonosítója alapján:
    Optional<Hire> findByCustomerID(long customerID);

    //Kölcsönzés keresése az autó azonosítója alapján:
    Optional<Hire> findByCarID(long carID);
    
    //Kölcsönzés keresése az üzlet azonosítója alapján:
    Iterable<Hire> findByStoreID(long storeID);
    
    //Kölcsönzés keresése a kölcsönzést rendező alkalmazott azonosítója alapján:
    Iterable<Hire> findByEmployeeID(long employeeID);
}