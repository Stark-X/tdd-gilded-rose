package cn.xpbootcamp.gildedrose;

public class Goods {
    protected String name;
    protected double quality;
    protected int sellIn;

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
        switch (this.name) {
            case "AgedBrie":
                updateAgedBrie();
                break;
            case "BackstagePass":
                updateBackstagePass();
                break;
            case "Sulfuras":
                break;
            default:
                updateRegularGoods();
        }
    }

    private void updateAgedBrie() {
        enhanceQuality();
        reduceSellIn();
        if (this.sellIn < 0) {
            enhanceQuality();
        }
    }

    private void updateBackstagePass() {
        this.enhanceQuality();
        if (this.sellIn <= 10) {
            this.enhanceQuality();
        }
        if (this.sellIn <= 5) {
            this.enhanceQuality();
        }
        this.sellIn -= 1;
        if (this.sellIn < 0) {
            this.quality = 0;
        }
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
