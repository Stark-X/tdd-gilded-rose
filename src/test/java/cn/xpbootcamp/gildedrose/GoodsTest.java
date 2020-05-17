package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GoodsTest {
    @Test
    void should_quality_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_1_and_regular_good_is_not_expired() {
        double oldQuality = 1;
        int oldSellIn = 1;

        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality - 1));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }

    @Test
    void should_quality_is_0_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_0_and_regular_good_is_not_expired() {
        double oldQuality = 0;
        int oldSellIn = 1;

        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(0.0));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }

    @Test
    void should_quality_reduce_2_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_2_and_regular_good_is_expired() {
        double oldQuality = 2;
        int oldSellIn = 0;

        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality - 2));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }

    @Test
    void should_quality_is_0_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_1_and_regular_good_is_expired() {
        double oldQuality = 1;
        int oldSellIn = 0;

        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(0.0));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }
}
