package com.diego.everis.domain.repository;

import com.diego.everis.domain.model.model.Manager;
import com.diego.everis.persistence.entity.Gestor;

import java.util.List;

public interface IManagerRepository {
    List<Manager> getAll();
}
