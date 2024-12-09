package ru.alexander.javaspringtests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.alexander.javaspringtests.service.PrefixSum;

import static org.assertj.core.api.Assertions.*;

public class PrefixSumTests {

    @DisplayName("Проверяет корректность суммы части отрезка")
    @Test
    public void testPrefixSumFrom0To5() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        var prefixSum = new PrefixSum(nums);

        assertThat(prefixSum.sumRange(0, 5)).isEqualTo(21);
    }

    @DisplayName("Проверяет корректность полного отрезка")
    @Test
    public void testPrefixSumFull() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        var prefixSum = new PrefixSum(nums);

        assertThat(prefixSum.sumRange(0, nums.length-1)).isEqualTo(28);
    }
}
