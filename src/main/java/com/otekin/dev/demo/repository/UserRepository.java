package com.otekin.dev.demo.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.otekin.dev.demo.entity.User;

public interface UserRepository extends CosmosRepository<User, String> {

}
