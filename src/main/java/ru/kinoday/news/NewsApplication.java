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
//			newsService.addNews(new News("День рождения только раз в году?!", "Мы меняем это правило. В течении всего месяца при предъявлении паспорта в число, соответсвующее дню рождения, мы дарим скидку 5% на билеты для вас и ваших друзей."));
//			newsService.addNews(new News("3=4", "При покупке трех билетов на любой триллер четвертый можете получить в подарок!"));
//			newsService.addNews(new News("1+1 = ❤", "В честь дня СВЯТОГО ВАЛЕНТИНА вы можете приобрести билеты на love места со скидкой 22%. Нужно всего лишь на совместной парной фотографии отметить наш кинотеатр в Инстаграм"));
//			newsService.addNews(new News("Открытие нового кинотеатра!", "Завтра в торговом центре ЦУМ состоится торжественное открытие нового кинотеатра. Вас ожидают свежие премьеры, новинки и не только! В одном из залов мы запустим фильмы, уже получившие свое признание и проверенные временем. И самое интересное - вход свободный! Следите за расписанием и успевайте забронировать билеты."));
//			newsService.addNews(new News("Карамельный БУМ!","При покупке любого стаканчика карамельного попкорна, вы получаете второй в подарок. Налетайте! Акция действует с 1 мая по 15 мая"));
		};
	}

}
