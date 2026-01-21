package com.blogapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PostRequest {
    @NotNull(message = "Title must not be null")
    @Size(min = 2, message = "Title must have at least 2 characters")
    private String title;

    @NotNull(message = "Description must not be null")
    @Size(min = 10, message = "Description must have at least 10 characters")
    private String description;

    @NotNull(message = "Content must not be null")
    private String content;

    @NotNull(message = "Category ID must not be null")
    private Long categoryId;

    public PostRequest() {}

    public PostRequest(String title, String description, String content, Long categoryId) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.categoryId = categoryId;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }
}
