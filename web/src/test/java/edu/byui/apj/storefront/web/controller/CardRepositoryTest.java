package edu.byui.apj.storefront.web.controller;

import edu.byui.apj.storefront.web.model.Card;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CardRepositoryTest {
    @Autowired
    CardService service;

    @Test
    void featured_hasJava() {
        List<Card> featured = service.getFeaturedCards(null);
        assertNotNull(featured);
        assertTrue(featured.stream().anyMatch(c ->
                (c.getName()!=null && c.getName().contains("Java ")) ||
                        (c.getSpecialty()!=null && c.getSpecialty().contains("Java ")) ||
                        (c.getContribution()!=null && c.getContribution().contains("Java "))
        ), "No card contains 'Java' — check CSV and search logic");
    }
}