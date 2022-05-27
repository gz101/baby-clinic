package me.gabrielchiong.babyclinic.services;

import me.gabrielchiong.babyclinic.models.Baby;

import java.util.Set;

public interface BabyService {
    Baby findById(Long id);

    Baby save(Baby baby);

    Set<Baby> findAll();
}
