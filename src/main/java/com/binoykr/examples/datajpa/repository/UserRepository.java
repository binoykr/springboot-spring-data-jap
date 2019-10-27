package com.binoykr.examples.datajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.binoykr.examples.datajpa.enity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
