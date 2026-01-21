package com.blogapi.model.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PostResponse {
    private Long id;
    private String title;
    private String description;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long categoryId;
    private String categoryName;
}
