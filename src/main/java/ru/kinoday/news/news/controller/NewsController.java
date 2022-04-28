package ru.kinoday.news.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kinoday.news.news.model.News;
import ru.kinoday.news.news.service.NewsService;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/last/")
    public List<News> getLastNews(@RequestParam(defaultValue = "3") int count) {
        return newsService.getLastNews(count);
    }
    @GetMapping("/{newsId}")
    public News getNewsById(@PathVariable("newsId") long id) {
        return newsService.getNewsById(id);
    }

    @DeleteMapping("/{newsId}")
    public void removeNews(@PathVariable("newsId") long id) {
        newsService.removeNews(id);
    }

    @PutMapping
    public void editNews(News news){
        newsService.editNews(news);
    }

    @PostMapping
    public void addNews(News news) {
        newsService.addNews(news);
    }

    // create
    // read
    // delete
    // edit
    // crud all koroche
}
