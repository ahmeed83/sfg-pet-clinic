package guru.springframework.sfgpetclinc.service;

import guru.springframework.sfgpetclinc.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
