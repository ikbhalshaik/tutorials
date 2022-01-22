package com.bizongo.tutorials.models.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class TutorialDto {
    private Long id;
    private String title;
    private String url;
}
