package me.gabrielchiong.babyclinic.services;

import me.gabrielchiong.babyclinic.models.PrimaryParent;

public interface PrimaryParentService extends CrudService<PrimaryParent, Long> {
    PrimaryParent findByLastName(String lastName);
}
