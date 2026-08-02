package org.example;

import org.example.Models.Board;
import org.example.Models.Dice;
import org.example.Models.Player;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Pratik");
        Player p2 = new Player("Omkar");
        Player p3 = new Player("Durvesh");
        Map<Integer, Integer> ladders = new HashMap<>();
        ladders.put(5, 17);
        ladders.put(45, 68);
        Map<Integer, Integer> snakes = new HashMap<>();
        snakes.put(19, 4);
        snakes.put(75, 58);
        Queue<Player> queue = new LinkedList<>();
        queue.offer(p1);
        queue.offer(p2);
        queue.offer(p3);
        Dice dice = new Dice();
        Board board = new Board(ladders, snakes, 100);
        Game game = new Game(board, dice, queue);
        game.start();
    }
}