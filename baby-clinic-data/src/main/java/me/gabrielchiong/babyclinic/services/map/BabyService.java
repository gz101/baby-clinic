package me.gabrielchiong.babyclinic.services.map;

import me.gabrielchiong.babyclinic.models.Baby;
import me.gabrielchiong.babyclinic.models.PrimaryParent;
import me.gabrielchiong.babyclinic.services.CrudService;

import java.util.Set;

public class BabyService extends AbstractMapService<Baby, Long> implements CrudService<Baby, Long> {
    @Override
    public Set<Baby> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Baby object) {
        super.delete(object);
    }

    @Override
    public Baby save(Baby object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Baby findById(Long id) {
        return super.findById(id);
    }
}
