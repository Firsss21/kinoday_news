package ru.kinoday.news.news.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NewsDto{
    @NotEmpty
    private String name;
    @NotEmpty
    private String text;
}