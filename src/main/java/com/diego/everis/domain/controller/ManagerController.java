package com.diego.everis.domain.controller;

import com.diego.everis.domain.model.dto.response.ManagerResponse;
import com.diego.everis.domain.model.model.Manager;
import com.diego.everis.domain.service.ManagerService;
import com.diego.everis.persistence.entity.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/managers")
@CrossOrigin(origins = "*")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @GetMapping
    public List<ManagerResponse> getAll() {
        return managerService.getAll();
    }
}
