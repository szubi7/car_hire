package hu.elte.alkfejl.carhire.service;

import hu.elte.alkfejl.carhire.model.Store;
import hu.elte.alkfejl.carhire.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    /*
        Új kölcsönző felvétele a rendszerbe:
    */
    public void addStore(Store store) {
        storeRepository.save(store);
    }

}