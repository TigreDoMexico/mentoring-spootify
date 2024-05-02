package org.com.spootify.entities;

import org.com.spootify.helpers.StringHelpers;

import java.util.InputMismatchException;

public class Podcast extends Content {
    private String presenter;
    private String review;

    public Podcast(String title, int duration, String presenter, String review){
        super(title, duration);

        if(StringHelpers.isBlank(presenter) || StringHelpers.isBlank(review)) throw new InputMismatchException("Entrada inválida");
        this.presenter = presenter;
        this.review = review;
    }

    public String getPresenter() {
        return this.presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String toString(){
        return String.format("Podcast | Título: %s | Duração: %d segundos | Apresentador: %s |", title, duration, presenter);
    }
}
