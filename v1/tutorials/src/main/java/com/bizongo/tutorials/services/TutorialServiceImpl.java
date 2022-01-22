package com.bizongo.tutorials.services;

import com.bizongo.tutorials.models.Tutorial;
import com.bizongo.tutorials.models.dto.TutorialDto;
import com.bizongo.tutorials.repositories.TutorialRepository;
import com.bizongo.tutorials.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TutorialServiceImpl implements TutorialService{
    @Autowired
    public TutorialRepository tutorialRepository;

    @Override
    public TutorialDto create(TutorialDto tutorialDto){
        Tutorial tutorial = Converter.toTutorial(tutorialDto);
        Tutorial savedTutorial = tutorialRepository.save(tutorial);
        TutorialDto savedTutorialDto = Converter.toTutorialDto(savedTutorial);
        return savedTutorialDto;
    }


    public TutorialDto findById(Long id){
        Tutorial tutorial = tutorialRepository.getById(id);
        // TODO null check on tutorial
        TutorialDto tutorialDto = Converter.toTutorialDto(tutorial);
        return tutorialDto;
    }

    public List<TutorialDto> getAll(){
        List<Tutorial> tutorialList = tutorialRepository.findAll();

        List<TutorialDto> tutorialDtoList = Converter.toTutorialDtoList(tutorialList);
        return tutorialDtoList;
    }

    public void delete(Long id){
        tutorialRepository.deleteById(id);
    }

    public TutorialDto update(Long id, TutorialDto tutorialDto){
        Tutorial  dbtutorial = tutorialRepository.getById(id);
        if(dbtutorial != null){
            dbtutorial.setTitle(dbtutorial.getTitle());
            dbtutorial.setUrl(dbtutorial.getUrl());
            tutorialRepository.save(dbtutorial);
        }
        TutorialDto  returnTutorial = Converter.toTutorialDto(dbtutorial);
    }
}
