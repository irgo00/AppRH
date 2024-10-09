package com.AppRH.AppRH.repository;

import com.AppRH.AppRH.model.Candidato;
import com.AppRH.AppRH.model.Vaga;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {
    Iterable<Candidato> findByVaga(Vaga vaga);
    Candidato findByRg(String rg);
    Candidato findById(int id);
    List<Candidato> findByNomeCandidato(String nome);

}
