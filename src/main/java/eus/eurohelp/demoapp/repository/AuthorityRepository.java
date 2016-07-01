package eus.eurohelp.demoapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import eus.eurohelp.demoapp.domain.Authority;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
