package com.codecool.dungeoncrawl.logic;

import com.codecool.dungeoncrawl.logic.actors.Actor;
import com.codecool.dungeoncrawl.logic.actors.Player;
import com.codecool.dungeoncrawl.logic.items.Item;

import java.util.ArrayList;

public class GameMap {
    private int width;
    private int height;
    private Cell[][] cells;

    private Player player;

    private Actor actor; // <- remove it
    private ArrayList<Actor> monsters; // consider special Monster class???
    // impl addMonster(), getMonsters()
    private Item item;

    public GameMap(int width, int height, CellType defaultCellType) {
        this.width = width;
        this.height = height;
        cells = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = new Cell(this, x, y, defaultCellType);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Actor getActor(){
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void setItem(Item item){
        this.item = item;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
