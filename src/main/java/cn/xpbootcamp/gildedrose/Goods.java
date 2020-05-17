package cn.xpbootcamp.gildedrose;

public abstract class Goods {
    protected String name;
    protected double quality;
    protected int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public static Goods createGoods(String name, double quality, int sellIn) {
        switch (name) {
            case "AgedBrie":
                return new AgedBrieGoods(name, quality, sellIn);
            case "BackstagePass":
                return new BackstagePassGoods(name, quality, sellIn);
            case "Sulfuras":
                return new SulfurasGoods(name, quality, sellIn);
            default:
                return new RegularGoods(name, quality, sellIn);
        }
    }

    public double getQuality() {
        return this.quality;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public void updateByDay() {
        this.performUpdateByDay();
    }

    public void performUpdateByDay() {
    }

    void enhanceQuality() {
        if (this.quality < 50) {
            this.quality += 1;
        }
    }

    void reduceSellIn() {
        this.sellIn -= 1;
    }

    void reduceQuality() {
        if (this.quality > 0) {
            this.quality -= 1;
        }
    }

    public String getName() {
        return name;
    }
}
