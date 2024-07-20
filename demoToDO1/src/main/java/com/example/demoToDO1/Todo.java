package com.example.demoToDO1;

public class Todo {


    private int id;

    private String title;

    private  boolean completed;

    private int userId;

    public Todo(int id, String title, boolean completed, int userId) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.userId = userId;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

//    @Override
//    public String toString() {
//        return "Todo{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", completed=" + completed +
//                ", userId=" + userId +
//                '}';
//    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
