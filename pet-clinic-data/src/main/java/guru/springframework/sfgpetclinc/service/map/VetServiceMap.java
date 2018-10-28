package guru.springframework.sfgpetclinc.service.map;

import guru.springframework.sfgpetclinc.model.Vet;
import guru.springframework.sfgpetclinc.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(final Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(final Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }
}
