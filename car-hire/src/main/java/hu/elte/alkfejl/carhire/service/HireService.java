/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.alkfejl.carhire.service;

import hu.elte.alkfejl.carhire.model.Hire;
import hu.elte.alkfejl.carhire.repository.HireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HireService {
    @Autowired
    private HireRepository hireRepository;

    /*
        Új kölcsönzés hozzáadása a rendszerhez:
    */
    public void addHire(Hire hire) {
        hireRepository.save(hire);
    }
    /*
        Kölcsönzés törlése a rendszerből:
    */
    public void removeHire(Hire hire) {
        hireRepository.delete(hire);
    }
}