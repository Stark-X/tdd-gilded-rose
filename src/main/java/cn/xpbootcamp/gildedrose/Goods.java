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
        if (this.name.equals("AgedBrie")) {
            updateAgedBrie();
            return;
        }

        if (this.name.equals("BackstagePass")) {
            updateBackstagePass();
            return;
        }

        updateRegularGoods();
    }

    private void updateAgedBrie() {
        enhanceQuality();
        reduceSellIn();
        if (this.sellIn < 0) {
            enhanceQuality();
        }
    }

    private void updateBackstagePass() {
        this.quality += 1;
        this.sellIn -= 1;
    }

    private void updateRegularGoods() {
        reduceQuality();
        reduceSellIn();
        if (this.sellIn <= 0) {
            reduceQuality();
        }
    }

    private void enhanceQuality() {
        if (this.quality < 50) {
            this.quality += 1;
        }
    }

    private void reduceSellIn() {
        this.sellIn -= 1;
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
