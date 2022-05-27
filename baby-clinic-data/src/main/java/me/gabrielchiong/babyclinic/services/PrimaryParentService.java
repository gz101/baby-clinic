package me.gabrielchiong.babyclinic.services;

import me.gabrielchiong.babyclinic.models.PrimaryParent;

import java.util.Set;

public interface PrimaryParentService {
    PrimaryParent findByLastName(String lastName);

    PrimaryParent findById(Long id);

    PrimaryParent save(PrimaryParent primaryParent);

    Set<PrimaryParent> findAll();
}
