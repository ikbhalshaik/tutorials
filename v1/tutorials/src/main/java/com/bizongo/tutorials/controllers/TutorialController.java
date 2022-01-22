package com.bizongo.tutorials.controllers;

import com.bizongo.tutorials.models.Tutorial;
import com.bizongo.tutorials.models.dto.TutorialDto;
import com.bizongo.tutorials.repositories.TutorialRepository;
import com.bizongo.tutorials.services.TutorialService;
import com.bizongo.tutorials.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutorials")
public class TutorialController {

    @Autowired
    public TutorialService tutorialService;

    @GetMapping
    public List<TutorialDto> index() {
        return tutorialService.getAll();
    }

    @PostMapping
    public TutorialDto create(@RequestBody TutorialDto tutorial){
        TutorialDto savedTutorial = tutorialService.create(tutorial);
        return savedTutorial;
    }

    @GetMapping("/{id}")
    public TutorialDto show(@PathVariable Long id){
        TutorialDto tutorialDto = tutorialService.findById(id);
        return tutorialDto;
    }

    @PutMapping("/{id}")
    public TutorialDto update(@PathVariable Long id,
       @RequestBody TutorialDto tutorialDto) {
        TutorialDto updatedtutorialDto = tutorialService.update(id, tutorialDto);
        return updatedtutorialDto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tutorialService.delete(id);
    }
}
