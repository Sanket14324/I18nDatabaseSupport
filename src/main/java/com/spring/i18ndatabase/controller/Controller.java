package com.spring.i18ndatabase.controller;

import com.spring.i18ndatabase.model.Survey;
import com.spring.i18ndatabase.services.ISurveyService;
import com.spring.i18ndatabase.services.SurveyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/survey")
@CrossOrigin(value = "*")
public class Controller {


    @Autowired
    private ISurveyService surveyService;


    @GetMapping
    public List<Survey> getAllSurveys(){
        return surveyService.getAllSurvey();
    }


    @GetMapping("/{email}/{language}")
    public Optional<Survey> getSurveyByLangAndEmail(@PathVariable String language,@PathVariable String email){
        return surveyService.getSurveyByLanguageAndEmail(email, language);
    }

    @PostMapping("")
    public Survey saveSurvey(@RequestBody Survey survey){

        return  surveyService.saveSurvey(survey);

    }
}
