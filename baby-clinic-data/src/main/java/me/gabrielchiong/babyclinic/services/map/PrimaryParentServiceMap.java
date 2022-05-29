package me.gabrielchiong.babyclinic.services.map;

import me.gabrielchiong.babyclinic.models.PrimaryParent;
import me.gabrielchiong.babyclinic.services.PrimaryParentService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PrimaryParentServiceMap extends AbstractMapService<PrimaryParent, Long> implements PrimaryParentService {

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
        return super.save(object);
    }

    @Override
    public PrimaryParent findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PrimaryParent findByLastName(String lastName) {
        return null;
    }
}
