package com.example.demo;

import com.intuit.karate.junit5.Karate;

class StudentKarateTest {

    @Karate.Test
    Karate testStudentAPI() {
        return Karate.run("student").relativeTo(getClass());
    }
}
