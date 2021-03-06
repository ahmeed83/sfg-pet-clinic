package guru.springframework.sfgpetclinc.service.map;

import guru.springframework.sfgpetclinc.model.Owner;
import guru.springframework.sfgpetclinc.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(final Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(final Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(final String lastName) {
        return null;
    }
}
