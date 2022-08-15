package ru.netology.poster.services;

public class PosterManager {

    private int limitOfMovies = 10;
    private String[] names = new String[0];

    public void add(String name) {
        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;

    }

    public PosterManager(int limitOfMovies) {
        this.limitOfMovies = limitOfMovies;
    }

    public PosterManager() {
    }

    public String[] findAll() {
        return names;
    }


    public int getLimitOfMovies() {
        return limitOfMovies;
    }

    public void setLimitOfMovies(int limitOfMovies) {
        this.limitOfMovies = limitOfMovies;
    }

    public String[] findLust() {
        int resultLength = names.length;
        if (limitOfMovies <= names.length) {
            resultLength = limitOfMovies;
        } else {
            resultLength = names.length;
        }
        String[] all = findAll();
        {
            String[] reversed = new String[resultLength];
            for (int i = 0; i < reversed.length; i++) {
                reversed[i] = all[all.length - 1 - i];
            }
            return reversed;
        }
    }
}






