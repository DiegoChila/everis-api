package com.diego.everis.persistence.repository.classes;

import com.diego.everis.domain.model.model.Manager;
import com.diego.everis.domain.repository.IManagerRepository;
import com.diego.everis.persistence.entity.Gestor;
import com.diego.everis.persistence.mapper.ManagerMapper;
import com.diego.everis.persistence.repository.crud.GestorCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GestorRepositorio implements IManagerRepository {
    @Autowired
    private GestorCrud gestorCrud;

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public List<Manager> getAll() {
        List<Gestor> gestores = (List<Gestor>) gestorCrud.findAll();
        return managerMapper.toManagers(gestores);
    }
}
