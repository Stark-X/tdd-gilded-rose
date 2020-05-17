package cn.xpbootcamp.gildedrose;

public class BackstagePassGoods extends Goods {

    public BackstagePassGoods(String name, double quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void performUpdateByDay() {
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
}
