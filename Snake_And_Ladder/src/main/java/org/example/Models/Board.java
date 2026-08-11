package org.example.Models;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Board {
    private Map<Integer, Integer>ladders;
    private Map<Integer, Integer> snakes;
    private int boardSize;
    public Board(Map<Integer, Integer> ladders, Map<Integer, Integer> snakes, int boardSize) {
        this.ladders = ladders;
        this.snakes = snakes;
        this.boardSize = boardSize;
    }
    public int getBoardSize() {
        return this.boardSize;
    }
    public Map<Integer, Integer> getLadders() {
        return ladders;
    }
    public Map<Integer, Integer> getSnakes() {
        return snakes;
    }
}
