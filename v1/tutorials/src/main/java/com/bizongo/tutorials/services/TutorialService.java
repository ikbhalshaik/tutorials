package com.bizongo.tutorials.services;

import com.bizongo.tutorials.models.Tutorial;
import com.bizongo.tutorials.models.dto.TutorialDto;

import java.util.List;

public interface TutorialService {
    TutorialDto create(TutorialDto tutorialDto);
    TutorialDto findById(Long id);
    List<TutorialDto> getAll();
    void delete(Long id);
    TutorialDto update(Long id, TutorialDto tutorial);
}
