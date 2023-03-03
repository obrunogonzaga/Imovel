package br.com.houseflipping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.houseflipping.entity.Imovel;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
