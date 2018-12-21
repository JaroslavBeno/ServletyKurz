package sk.jaroslavbeno.app.services;

import sk.jaroslavbeno.app.model.Film;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilmyService {
    private List<Film> filmyMock = Arrays.asList(
            new Film("Quest","akcne"),
            new Film("Double team","akcne"),
            new Film("Star Wars","scifi"),
            new Film("Stargate","scifi"));

    public List<Film> dajZoznamFilmovPodlaZanru(String zaner){
        return filmyMock.stream()
                .filter(film -> zaner.equalsIgnoreCase(film.getZaner()))
                .collect(Collectors.toList());
    }
}

