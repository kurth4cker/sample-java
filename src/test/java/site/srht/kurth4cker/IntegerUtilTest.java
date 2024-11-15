// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerUtilTest {
    @Test
    void isPowerOfTwo() {
        record TestCase(int given, boolean expected) {}
        TestCase[] test_cases = {
            new TestCase(0, false),
            new TestCase(1, true),
            new TestCase(2, true),
            new TestCase(3, false),
            new TestCase(4, true),
            new TestCase(32, true),
        };

        for (var tc : test_cases) {
            for (var given : new int[]{tc.given, -tc.given}) {
                var got = IntegerUtil.isPowerOfTwo(given);
                var message = String.format("given %s", given);
                assertEquals(tc.expected, got, message);
            }
        }
    }
}
