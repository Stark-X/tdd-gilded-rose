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
            if (quality < 50) {
                this.quality += 1;
            }
            reduceSellIn();
        } else {
            reduceQuality();
            reduceSellIn();
            if (this.sellIn <= 0) {
                reduceQuality();
            }
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
