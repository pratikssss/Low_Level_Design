package org.example;

import org.example.Models.Board;
import org.example.Models.Dice;
import org.example.Models.Player;

import java.util.List;
import java.util.Queue;

public class Game {
     private Dice dice;
     private Board board;
     private int boardSize;
     private Queue<Player> queue;
     public Game(Board board, Dice dice, Queue<Player> queue) {
        this.board = board;
        this.dice = dice;
        this.boardSize = board.getBoardSize();
        this.queue = queue;
     }

     public void start() {
         while(true) {
             Player currentPlayer = queue.poll();
             int position = currentPlayer.getPosition();
             int newPosition = position + dice.roll();
             if(newPosition == boardSize) {
                 System.out.println(currentPlayer.getName() + " won!!");
                 return;
             }
             else if(newPosition < boardSize) {
                 if(board.getLadders().containsKey(newPosition)) {
                     System.out.println(currentPlayer.getName() + " got ladder at "+newPosition);
                     newPosition = board.getLadders().get(newPosition);
                 }
                 else if(board.getSnakes().containsKey(newPosition)) {
                     System.out.println(currentPlayer.getName() + " got bitten at "+newPosition);
                     newPosition = board.getSnakes().get(newPosition);
                 }
             }
             else {
                 queue.offer(currentPlayer);
                 continue;
             }
             currentPlayer.setPosition(newPosition);
             queue.offer(currentPlayer);
         }
     }
}
