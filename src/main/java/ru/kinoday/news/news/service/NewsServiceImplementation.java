package ru.kinoday.news.news.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kinoday.news.news.dao.NewsRepository;
import ru.kinoday.news.news.model.News;

import java.util.List;

@Service
@AllArgsConstructor
public class NewsServiceImplementation implements NewsService{

    private NewsRepository newsRepo;

    @Override
    public News getNewsById(long id) {
        News byId = newsRepo.getById(id);
        return byId;
    }
    @Override
    public List<News> getAllNews() {
        return newsRepo.findAll();
    }

    @Override
    public List<News> getLastNews(int count) {
        return newsRepo.getLastNews(PageRequest.of(0, count));
    }

    @Override
    public void addNews(News news) {
        newsRepo.save(news);
    }

    @Override
    public void editNews(News news) {
        newsRepo.save(news);
    }

    @Override
    public void removeNews(News news) {
        newsRepo.delete(news);
    }

    @Override
    public void removeNews(long id) {
        newsRepo.deleteById(id);
    }

    @Override
    public void removeAllNews() {
        newsRepo.deleteAll();
    }
}
