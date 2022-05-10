package ru.kinoday.news.news.service;

import ru.kinoday.news.news.model.News;

import java.util.List;

public interface NewsService {
    News getNewsById(long id);
    List<News> getAllNews();
    List<News> getLastNews(int count);
    void addNews(News news);
    void editNews(News news);
    void removeNews(News news);
    void removeNews(long id);

    void removeAllNews();
}
