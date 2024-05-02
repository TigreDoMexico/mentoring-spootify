package org.com.spootify.entities;

import org.com.spootify.helpers.StringHelpers;

import java.util.InputMismatchException;
import java.util.List;

public class Music extends Content {
    private List<String> songwriters;
    private List<String> interpreters;
    private String genre;

    public Music(String title, int duration, List<String> songwriters, List<String> interpreters, String genre) {
        super(title, duration);

        if(StringHelpers.isBlank(title) || songwriters.isEmpty() || interpreters.isEmpty() || StringHelpers.isBlank(genre))
            throw new InputMismatchException("Entrada inválida");

        this.songwriters = songwriters;
        this.interpreters = interpreters;
        this.genre = genre;
    }
}
