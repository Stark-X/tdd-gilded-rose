package cn.xpbootcamp.gildedrose;

public class RegularGoods extends Goods {

    public RegularGoods(String name, double quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void performUpdateByDay() {
        reduceQuality();
        reduceSellIn();
        if (this.sellIn <= 0) {
            reduceQuality();
        }
    }
}
