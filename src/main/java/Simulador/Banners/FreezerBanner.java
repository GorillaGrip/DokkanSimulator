package Simulador.Banners;

import DataBase.Rarity;
import DataBase.Summonable;

import javax.swing.*;

public class FreezerBanner extends Summonable {

    public FreezerBanner(int id, String name, Rarity rarity, boolean rateUp) {
        super(id, name, rarity, rateUp);
        this.icon = new ImageIcon("src/resources/Summon Freezer/" + id + ".png");
    }
}
