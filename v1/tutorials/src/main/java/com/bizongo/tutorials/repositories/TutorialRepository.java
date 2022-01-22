package com.bizongo.tutorials.repositories;

import com.bizongo.tutorials.models.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
