package com.example.person.domain;

public enum Gender {

        Male("male"), Female("Female");

       private final String gender;

       Gender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return this.gender;
        }

    }

