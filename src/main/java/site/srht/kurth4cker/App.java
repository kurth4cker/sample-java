// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import java.util.Optional;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public final class App {
    public static void main(String[] args) {
        var s1 = new Student("kurth4cker", "T",
                LocalDate.of(2000, Month.FEBRUARY, 1));
        var s2 = new Student("name1", "name2", "lastname",
                LocalDate.now());

        System.out.println(s1);
        System.out.println(s2);
    }
}

class Student {
    private String firstName;
    private Optional<String> secondName;
    private String lastName;
    private LocalDate birthDate;

    public Student(String firstName, String lastName, LocalDate birthDate) {
        this(firstName, null, lastName, birthDate);
    }

    public Student(String firstName, String secondName, String lastName,
                    LocalDate birthDate) {
        this.firstName = firstName;
        this.secondName = Optional.ofNullable(secondName);
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return String.format("%s%s %s",
                this.firstName,
                this.secondName.map(name -> " " + name).orElse(""),
                this.lastName);
    }

    public String toString() {
        return String.format("%s %s",
                this.getName(),
                DateTimeFormatter.ofPattern("dd.MM.yyyy").format(this.birthDate));
    }
}
