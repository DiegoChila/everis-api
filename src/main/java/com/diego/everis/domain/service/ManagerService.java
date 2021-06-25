package com.diego.everis.domain.service;

import com.diego.everis.domain.model.dto.response.ManagerResponse;
import com.diego.everis.domain.model.model.Manager;
import com.diego.everis.persistence.entity.Gestor;
import com.diego.everis.persistence.repository.classes.GestorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private GestorRepositorio gestorRepositorio;

    public List<ManagerResponse> getAll() {
        List<Manager> managers = gestorRepositorio.getAll();
        List<ManagerResponse> managerResponses = new ArrayList<>();
        for (Manager manager:  managers) {
            String name = manager.getFirstName()+" "+manager.getSecondName()+" "+manager.getFirstLastname()+" "+manager.getSecondLastname();
            name = name.replace("  ", " ");
            managerResponses.add(new ManagerResponse(name, manager.getEmail(), manager.getTel()));
        }
        return managerResponses;
    }
}
