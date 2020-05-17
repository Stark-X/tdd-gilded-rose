package cn.xpbootcamp.gildedrose;

public class AgedBrieGoods extends Goods {

    public AgedBrieGoods(String name, double quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void performUpdateByDay() {
        enhanceQuality();
        reduceSellIn();
        if (this.sellIn < 0) {
            enhanceQuality();
        }
    }
}
