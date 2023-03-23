package com.spring.i18ndatabase.services;

import com.spring.i18ndatabase.model.Survey;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ISurveyService {


    Survey saveSurvey(Survey survey);

    Survey getSurveyById(Integer id);

    List<Survey> getAllSurvey();


    Survey deleteSurveyById(Integer id);


    Survey editSurveyById();


    Optional<Survey> getSurveyByLanguageAndEmail(String email, String language);

}
