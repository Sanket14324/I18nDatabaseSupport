package com.spring.i18ndatabase.repository;

import com.spring.i18ndatabase.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Integer> {

    Optional<Survey> findByEmailAndLanguage(String email, String language);
}
