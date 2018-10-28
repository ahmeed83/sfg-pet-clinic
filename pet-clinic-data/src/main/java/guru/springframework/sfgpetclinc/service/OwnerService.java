package guru.springframework.sfgpetclinc.service;

import guru.springframework.sfgpetclinc.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
