package cn.xpbootcamp.gildedrose;

public class Goods {
    private String name;
    private double quality;
    private int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public double getQuality() {
        return this.quality;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public void updateByDay() {
        reduceQuality();
        this.sellIn -= 1;

        if (this.sellIn <= 0) {
            reduceQuality();
        }
    }

    private void reduceQuality() {
        if (this.quality > 0) {
            this.quality -= 1;
        }
    }

    public String getName() {
        return name;
    }
}
