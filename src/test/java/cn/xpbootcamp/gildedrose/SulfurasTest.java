package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SulfurasTest {

    @Test
    void should_quality_and_sellIn_dont_change_when_day_pass_given_sulfuras_is_any_quality_and_any_sellIn() {
        double oldQuality = 47;
        int oldSellIn = 0;

        SulfurasGoods goods = new SulfurasGoods("Sulfuras", oldQuality, oldSellIn);
        goods.updateByDay();
        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality, equalTo(oldQuality));
        assertThat(newSellIn, equalTo(oldSellIn));
    }
}
