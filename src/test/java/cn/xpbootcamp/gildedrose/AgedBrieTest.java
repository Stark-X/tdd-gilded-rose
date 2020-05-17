package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AgedBrieTest {
    @Test
    void should_quality_enhance_1_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_less_than_50_and_aged_brie_is_not_expired() {
        double oldQuality = 1;
        int oldSellIn = 1;

        Goods goods = new Goods("AgedBrie", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality + 1));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }

    @Test
    void should_quality_is_50_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_50_and_aged_brie_is_not_expired() {
        double oldQuality = 50;
        int oldSellIn = 1;

        Goods goods = new Goods("AgedBrie", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(50.0));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }

    @Test
    void should_quality_enhance_2_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_less_than_49_and_not_less_than_1_and_aged_brie_is_expired() {
        double oldQuality = 48;
        int oldSellIn = 0;

        Goods goods = new Goods("AgedBrie", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality + 2));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }

    @Test
    void should_quality_is_50_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_49_and_not_less_than_1_and_aged_brie_is_expired() {
        double oldQuality = 49;
        int oldSellIn = 0;

        Goods goods = new Goods("AgedBrie", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(50.0));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }
}
