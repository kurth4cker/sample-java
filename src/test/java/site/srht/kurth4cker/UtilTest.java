// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    @Test
    void sum() {
        assertEquals(0, Util.sum());
        assertEquals(6, Util.sum(1, 2, 3));
        assertEquals(15, Util.sum(1, 2, 3, 4, 5));

        var nums = new int[]{1, 2, 3, 4};
        assertEquals(10, Util.sum(nums));
    }
}
