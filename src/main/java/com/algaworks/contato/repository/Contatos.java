package com.algaworks.contato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.contato.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
