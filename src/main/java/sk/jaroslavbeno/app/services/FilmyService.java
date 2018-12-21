package sk.jaroslavbeno.app.services;

import sk.jaroslavbeno.app.model.Film;
import sk.jaroslavbeno.app.model.dto.FilmDto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilmyService {
    private List<Film> filmyMock = Arrays.asList(
            new Film("Quest","akcne"),
            new Film("Double team","akcne"),
            new Film("Star Wars","scifi"),
            new Film("Stargate","scifi"));

    public List<FilmDto> dajZoznamFilmovPodlaZanru(String zaner){
        if(zaner==null || zaner.isEmpty()){
            return null;
        }

        List<Film> filmy = filmyMock.stream()
                .filter(film -> zaner.equalsIgnoreCase(film.getZaner()))
                .collect(Collectors.toList());

        return filmy.stream()
                .map(this::preklopNaDto)
                .collect(Collectors.toList());
    }

    private FilmDto preklopNaDto(Film film){
        FilmDto filmDto = new FilmDto();
        filmDto.setNazov(film.getNazov());
        filmDto.setZaner(film.getZaner());
        return filmDto;
    }
}

