package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.FilmService;

public class FilmServiceTest {


    @Test
    public void addFilm() {
        FilmService filmService = new FilmService();


        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель";

        filmService.add(film1);
        filmService.add(film2);
        filmService.add(film3);

        String[] expected = {film1, film2, film3};
        String[] actual = filmService.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        FilmService filmService = new FilmService();


        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель";
        String film4 = "Джентельмены";
        String film5 = "Человек-Невидимка";

        filmService.add(film1);
        filmService.add(film2);
        filmService.add(film3);
        filmService.add(film4);
        filmService.add(film5);

        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = filmService.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findLast1() {
        FilmService filmService = new FilmService();


        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель";
        String film4 = "Джентельмены";
        String film5 = "Человек-Невидимка";
        String film6 = "Тролли";
        String film7 = "Номер один";

        filmService.add(film1);
        filmService.add(film2);
        filmService.add(film3);
        filmService.add(film4);
        filmService.add(film5);
        filmService.add(film6);
        filmService.add(film7);

        String[] expected = {film7, film6, film5, film4, film3};
        String[] actual = filmService.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test

    public void findLast2() {
        FilmService filmService = new FilmService();


        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель";


        filmService.add(film1);
        filmService.add(film2);
        filmService.add(film3);


        String[] expected = {film3, film2, film1};
        String[] actual = filmService.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void findLast3() {
        FilmService filmService = new FilmService(6);


        String film1 = "Бладшот";
        String film2 = "Вперед";
        String film3 = "Отель";
        String film4 = "Джентельмены";
        String film5 = "Человек-Невидимка";
        String film6 = "Тролли";
        String film7 = "Номер один";

        filmService.add(film1);
        filmService.add(film2);
        filmService.add(film3);
        filmService.add(film4);
        filmService.add(film5);
        filmService.add(film6);
        filmService.add(film7);

        String[] expected = {film7, film6, film5, film4, film3, film2};
        String[] actual = filmService.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }


}

