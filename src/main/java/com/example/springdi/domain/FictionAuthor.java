package com.example.springdi.domain;

public class FictionAuthor extends Author {
    @Override
    public void getDetails() {
        System.out.println("FictionAuthor");
    }
}
