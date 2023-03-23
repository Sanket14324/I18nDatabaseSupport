package com.spring.i18ndatabase.services;

import com.spring.i18ndatabase.model.Survey;
import com.spring.i18ndatabase.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyServiceImpl implements ISurveyService{

    @Autowired
    private SurveyRepository surveyRepository;
    @Override
    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    @Override
    public Survey getSurveyById(Integer id) {
        return surveyRepository.findById(id).orElseThrow(()-> new RuntimeException("Not Found"));
    }

    @Override
    public List<Survey> getAllSurvey() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey deleteSurveyById(Integer id) {

        Survey survey = surveyRepository.findById(id).orElseThrow(()-> new RuntimeException("Not found"));

        if(survey != null){
            surveyRepository.delete(survey);
            return survey;
        }

        return null;
    }

    @Override
    public Survey editSurveyById() {
        return null;
    }

    @Override
    public Optional<Survey> getSurveyByLanguageAndEmail(String email, String language) {
        Optional<Survey> survey =  surveyRepository.findByEmailAndLanguage(email, language);

        return  survey;
    }
}
