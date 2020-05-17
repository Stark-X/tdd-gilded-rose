package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BackstagePassTest {
    @Test
    void should_quality_enhance_1_and_sellIn_reduce_1_when_a_day_pass_given_backstage_pass_quality_is_less_than_50_and_sellIn_is_greater_than_10() {
        double oldQuality = 49;
        int oldSellIn = 11;

        Goods goods = new Goods("BackstagePass", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality + 1));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }

    @Test
    void should_quality_enhance_2_and_sellIn_reduce_1_when_a_day_pass_given_backstage_pass_quality_is_less_than_49_and_sellIn_is_greater_than_5_less_or_equal_than_10() {
        double oldQuality = 48;
        int oldSellIn = 6;

        Goods goods = new Goods("BackstagePass", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality + 2));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }
}
