// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativeTest {
    @Test
    void intToString() {
        int[] numbers = {
            10,
            23,
            43,
            32,
            12732,
            -122,
            -32,
            0,
            10,
        };
        int[] radixes = new int[]{
            10,
        };

        for (var number : numbers) {
            for (var radix : radixes) {
                var got = Iterative.intToString(number, radix);
                var expected = Integer.toString(number, radix);
                assertEquals(got, expected);
            }
        }
    }
}
