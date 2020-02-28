package com.example.LegendsOfAndor;

import com.example.LegendsOfAndor.Creature.Creature;
import com.example.LegendsOfAndor.Item.Item;

import java.util.ArrayList;

enum FogKind {
    NONE, MONSTER, WINESKIN, TWO_WP, THREE_WP, SP, GOLD, WITCHBREW, EVENT
}

public class Region {
    private int number;
    private FogKind fog;
    private boolean fogRevealed;
    private boolean fountain;
    private boolean fountainStatus;
    private boolean merchant;
    private boolean bridge;
    private int gold;
    private ArrayList<Integer> adjacentRegions;
    private Integer bridgeAdjacentRegion;
    private Integer nextRegion;
    private Integer bridgeNextRegion;
    private ArrayList<Item> items;
    private Creature currentCreature;
    private ArrayList<Farmer> farmers;

    public Region() {}

    public Region(int number, FogKind fog, boolean fogRevealed, boolean fountain, boolean fountainStatus, boolean merchant, boolean bridge) {
        this.number = number;
        this.fog = fog;
        this.fogRevealed = fogRevealed;
        this.fountain = fountain;
        this.fountainStatus = fountainStatus;
        this.merchant = merchant;
        this.bridge = bridge;
        adjacentRegions = new ArrayList<>();
        items = new ArrayList<>();
        farmers = new ArrayList<>();
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public FogKind getFog() {
        return fog;
    }

    public void setFog(FogKind fog) {
        this.fog = fog;
    }

    public boolean isFogRevealed() {
        return fogRevealed;
    }

    public void setFogRevealed(boolean fogRevealed) {
        this.fogRevealed = fogRevealed;
    }

    public boolean isFountain() {
        return fountain;
    }

    public void setFountain(boolean fountain) {
        this.fountain = fountain;
    }

    public boolean isFountainStatus() {
        return fountainStatus;
    }

    public void setFountainStatus(boolean fountainStatus) {
        this.fountainStatus = fountainStatus;
    }

    public boolean isMerchant() {
        return merchant;
    }

    public void setMerchant(boolean merchant) {
        this.merchant = merchant;
    }

    public boolean isBridge() {
        return bridge;
    }

    public void setBridge(boolean bridge) {
        this.bridge = bridge;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public ArrayList<Integer> getAdjacentRegions() {
        return adjacentRegions;
    }

    public Integer getBridgeAdjacentRegion() {
        return bridgeAdjacentRegion;
    }

    public Integer getBridgeNextRegion() {
        return bridgeNextRegion;
    }

    public void setAdjacentRegions(ArrayList<Integer> adjacentRegions) {
        this.adjacentRegions = adjacentRegions;
    }

    public void setBridgeAdjacentRegion(Integer bridgeAdjacentRegion) {
        this.bridgeAdjacentRegion = bridgeAdjacentRegion;
    }

    public Integer getNextRegion() {
        return nextRegion;
    }

    public void setNextRegion(Integer nextRegion) {
        this.nextRegion = nextRegion;
    }

    public void setBridgeNextRegion(Integer bridgeNextRegion) {
        this.bridgeNextRegion = bridgeNextRegion;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Creature getCurrentCreature() {
        return currentCreature;
    }

    public void setCurrentCreature(Creature currentCreature) {
        this.currentCreature = currentCreature;
    }

    public ArrayList<Farmer> getFarmers() {
        return farmers;
    }

    public void setFarmers(ArrayList<Farmer> farmers) {
        this.farmers = farmers;
    }
}