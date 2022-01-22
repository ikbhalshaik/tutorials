package com.bizongo.tutorials.utils;

import com.bizongo.tutorials.models.Tutorial;
import com.bizongo.tutorials.models.dto.TutorialDto;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static TutorialDto toTutorialDto(Tutorial tutorial){
        TutorialDto tutorialDto = new TutorialDto();
        tutorialDto.setId(tutorial.getId());
        tutorialDto.setTitle(tutorial.getTitle());
        tutorialDto.setUrl(tutorial.getUrl());
        return tutorialDto;
    }

    public static  Tutorial toTutorial(TutorialDto tutorialDto){
        Tutorial tutorial  = new Tutorial();
        tutorial.setTitle(tutorialDto.getTitle());
        tutorial.setUrl(tutorialDto.getUrl());
        return tutorial;
    }

    public static List<TutorialDto> toTutorialDtoList(List<Tutorial> tutorialList){
        List<TutorialDto> dtoList = new ArrayList<TutorialDto>();
        TutorialDto tutorialDto = null;
        for(Tutorial tutorial: tutorialList) {
            tutorialDto = toTutorialDto(tutorial);
            dtoList.add(tutorialDto);
        }
        return dtoList;
    }
}
