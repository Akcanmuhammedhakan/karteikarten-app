package com.karteikarten.karteikarten;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    @GetMapping
    public List<Card> getAllCards() {
        return List.of(
                new Card(1L, "Was ist die Hauptstadt von Frankreich?", "Paris", "Geographie", 0),
                new Card(2L, "Was bedeutet OOP?", "Objektorientierte Programmierung", "Informatik", 0)
        );
    }
}