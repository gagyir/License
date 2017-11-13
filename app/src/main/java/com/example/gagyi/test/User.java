package com.example.gagyi.test;

import java.util.List;

/**
 * Created by gagyi on 2017-10-30.
 */

public class User {

    public String firstName;
    public String lastName;
    public String illness;
    public String problemToSolve;
    public String observations;
    public List<String> diary; //List of Diary
    public List<String> tasks; //List of tasks
    public List<Game> gamesToPlay; //List of games

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getProblemToSolve() {
        return problemToSolve;
    }

    public void setProblemToSolve(String problemToSolve) {
        this.problemToSolve = problemToSolve;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public User(String firstName, String lastName, String illness, String problemToSolve, String observations, List<String> diary, List<String> tasks, List<Game> gamesToPlay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.illness = illness;
        this.problemToSolve = problemToSolve;
        this.observations = observations;
        this.diary = diary;
        this.tasks = tasks;
        this.gamesToPlay = gamesToPlay;
    }

    public List<String> getDiary() {
        return diary;
    }

    public void setDiary(List<String> diary) {
        this.diary = diary;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<Game> getGamesToPlay() {
        return gamesToPlay;
    }

    public void setGamesToPlay(List<Game> gamesToPlay) {
        this.gamesToPlay = gamesToPlay;
    }
}
