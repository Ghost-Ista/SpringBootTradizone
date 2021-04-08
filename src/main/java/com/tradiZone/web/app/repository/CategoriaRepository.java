package com.tradiZone.web.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tradiZone.web.app.model.CategoriaComida;

@Repository
public interface CategoriaRepository extends MongoRepository<CategoriaComida, String>{

}
