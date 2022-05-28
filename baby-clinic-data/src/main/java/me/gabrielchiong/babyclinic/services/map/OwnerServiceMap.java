package me.gabrielchiong.babyclinic.services.map;

import me.gabrielchiong.babyclinic.models.PrimaryParent;
import me.gabrielchiong.babyclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<PrimaryParent, Long> implements CrudService<PrimaryParent, Long> {

    @Override
    public Set<PrimaryParent> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PrimaryParent object) {
        super.delete(object);
    }

    @Override
    public PrimaryParent save(PrimaryParent object) {
        return super.save(object.getId(), object);
    }

    @Override
    public PrimaryParent findById(Long id) {
        return super.findById(id);
    }
}
