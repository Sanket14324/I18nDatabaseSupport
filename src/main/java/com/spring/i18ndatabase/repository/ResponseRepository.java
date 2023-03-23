package com.spring.i18ndatabase.repository;

import com.spring.i18ndatabase.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Integer> {
}
