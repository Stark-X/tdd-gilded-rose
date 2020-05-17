package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GoodsTest {
    @Test
    void should_quality_and_sellIn_reduce_1_when_a_day_pass_given_quality_is_1_and_good_is_not_expired() {
        double oldQuality = 1.0f;
        int oldSellIn = 1;

        Goods goods = new Goods("Regular", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality - 1));
        assertThat(newSellIn, equalTo(oldSellIn - 1));
    }
}
