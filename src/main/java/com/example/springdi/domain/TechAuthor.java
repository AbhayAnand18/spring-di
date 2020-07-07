package com.example.springdi.domain;

public class TechAuthor extends Author {
    @Override
    public void getDetails() {
        System.out.println("TechAuthor");
    }
}
