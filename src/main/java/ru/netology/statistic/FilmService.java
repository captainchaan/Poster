package ru.netology.statistic;

public class FilmService {
    private String[] film = new String[0];
    private int limit = 5;

    public FilmService() {

    }

    public FilmService(int limit) {
        this.limit = limit;
    }


    public void add(String films) {
        String[] tmp = new String[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = films;
        film = tmp;

    }

    public String[] findAll() {
        return film;
    }

    public String[] findLast() {
        int resultLength = 0;
        if (film.length < limit) {
            resultLength = film.length;
        } else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = film[film.length - 1 - i];
        }
        return result;
    }

}
