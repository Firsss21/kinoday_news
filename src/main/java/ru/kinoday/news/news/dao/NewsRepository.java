package ru.kinoday.news.news.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kinoday.news.news.model.News;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    @Query("SELECT n FROM News n ORDER BY n.createDate DESC")
    List<News> getLastNews(Pageable pageable);
}
