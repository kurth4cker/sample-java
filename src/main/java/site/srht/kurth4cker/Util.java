// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

public final class Util {
    private Util() {
    }

    public static int sum(int... nums) {
        var total = 0;

        for (var val : nums) {
            total += val;
        }

        return total;
    }
}
