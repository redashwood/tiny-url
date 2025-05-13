package com.redashwood.tinyuserservice.repository;

import com.redashwood.tinyuserservice.dto.TinyUserDTO;
import com.redashwood.tinyuserservice.entity.TinyUserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TinyUserRepository extends MongoRepository<TinyUserDocument, UUID> {

    TinyUserDocument findByCredentialsUsername(String username);
}
