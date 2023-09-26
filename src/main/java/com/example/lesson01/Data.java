package com.example.lesson01;

// Spring Bean이 아니라 그냥 Java Bean -> Spring container에 담지 않는다
public class Data {
    // 필드
    private int id;
    private String name;

    // 메서드

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
