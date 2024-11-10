// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativeTest {
    @Test
    void intToString() {
        var got = Iterative.intToString(0);
        var expected = Integer.toString(0);
        assertEquals(expected, got);
    }
}
