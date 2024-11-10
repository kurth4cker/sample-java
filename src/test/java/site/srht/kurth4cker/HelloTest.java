// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void greeting() {
        String[] words = {
            "world",
            "kurth4cker",
        };

        for (var word : words) {
            var got = Hello.greeting(word);
            assertEquals(String.format("hello %s", word), got);
        }
    }
}
