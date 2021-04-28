package com.frank.domain;

public class Student {
    private int id;
    private int age;
    private String name;

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    private String roomid;

    public Student() {
    }

    public Student(int id, int age, String name, String roomid) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.roomid = roomid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", roomid='" + roomid + '\'' +
                '}';
    }
}
