package com.diego.everis.persistence.repository.crud;

import com.diego.everis.persistence.entity.Gestor;
import org.springframework.data.repository.CrudRepository;

public interface GestorCrud extends CrudRepository<Gestor, String> {
}
