package me.gabrielchiong.babyclinic.services.map;

import me.gabrielchiong.babyclinic.models.Baby;
import me.gabrielchiong.babyclinic.services.BabyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BabyServiceMap extends AbstractMapService<Baby, Long> implements BabyService {
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
        return super.save(object);
    }

    @Override
    public Baby findById(Long id) {
        return super.findById(id);
    }
}
