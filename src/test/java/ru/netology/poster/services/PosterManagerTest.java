package ru.netology.poster.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {


    @Test
    public void findAll() {
        String name1 = ("Красавица");
        String name2 = ("Чудовище");
        String name3 = ("Крепость");
        String name4 = ("Дом");
        String name5 = ("Якорь");
        ru.netology.poster.services.PosterManager manager = new ru.netology.poster.services.PosterManager();

        manager.add("Красавица");
        manager.add("Чудовище");
        manager.add("Крепость");
        manager.add("Дом");
        manager.add("Якорь");
        String[] expected = {name1, name2, name3, name4, name5};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void resultLust() {
        String name1 = ("Красавица");
        String name2 = ("Чудовище");
        String name3 = ("Крепость");
        String name4 = ("Дом");
        String name5 = ("Якорь");
        ru.netology.poster.services.PosterManager manager = new ru.netology.poster.services.PosterManager();
        manager.add("Красавица");
        manager.add("Чудовище");
        manager.add("Крепость");
        manager.add("Дом");
        manager.add("Якорь");

        String[] expected = {name5, name4, name3, name2, name1};
        String[] actual = manager.findLust();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void resultLustIf7Movies() {
        String name1 = ("Красавица");
        String name2 = ("Чудовище");
        String name3 = ("Крепость");
        String name4 = ("Дом");
        String name5 = ("Якорь");
        String name6 = ("Дом2");
        String name7 = ("Якорь2");
        ru.netology.poster.services.PosterManager manager = new ru.netology.poster.services.PosterManager(6);
        manager.add("Красавица");
        manager.add("Чудовище");
        manager.add("Крепость");
        manager.add("Дом");
        manager.add("Якорь");
        manager.add("Дом2");
        manager.add("Якорь2");
        String[] expected = {name7, name6, name5, name4, name3, name2};
        String[] actual = manager.findLust();
        Assertions.assertArrayEquals(expected, actual);
    }


}
