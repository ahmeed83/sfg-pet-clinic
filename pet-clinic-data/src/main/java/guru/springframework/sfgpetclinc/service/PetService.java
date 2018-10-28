package guru.springframework.sfgpetclinc.service;

import guru.springframework.sfgpetclinc.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
