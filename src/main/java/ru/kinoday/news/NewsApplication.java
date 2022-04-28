package ru.kinoday.news;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.kinoday.news.news.model.News;
import ru.kinoday.news.news.service.NewsService;

@EnableCaching
@SpringBootApplication
@EnableTransactionManagement
@Slf4j
public class NewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);
	}

	@Bean
	@Transactional
	CommandLineRunner run(@Autowired NewsService newsService) {
		return args -> {
//			newsService.addNews(new News("Theme", "Description text"));
//			newsService.addNews(new News("Theme", "Description text2"));
//			newsService.addNews(new News("Theme", "Description text3"));
//			newsService.addNews(new News("Theme", "Description text4"));
		};
	}

}
