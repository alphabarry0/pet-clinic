package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

import java.util.Optional;

public interface OwnerService extends CRUDService<Owner, Long> {
    Optional<Owner> findByLastname(String lastname);
}
