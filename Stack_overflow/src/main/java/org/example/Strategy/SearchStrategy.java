package org.example.Strategy;

import org.example.Entities.Question;

import java.util.List;

public interface SearchStrategy {
        List<Question> filter(List<Question> questions);
    }
