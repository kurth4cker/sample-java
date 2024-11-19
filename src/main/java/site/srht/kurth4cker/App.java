// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import java.util.stream.IntStream;
import site.srht.kurth4cker.NumberUtil;

public final class App {
    public static void main(String[] args) {
        IntStream.range(0, 100)
            .filter(NumberUtil::isPrime)
            .forEach(System.out::println);
        // for (int i = 0; i < 100; i++) {
        //     if (NumberUtil.isPrime(i)) {
        //         System.out.println(i);
        //     }
        // }
    }
}
