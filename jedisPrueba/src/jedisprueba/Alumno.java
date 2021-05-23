/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jedisprueba;

import java.util.ArrayList;

/**
 *
 * @author euced
 */
public class Alumno {
    private int id;
    private String login;
    private String name;
    private String password;
    ArrayList<Examen> exams = new ArrayList();

    public Alumno(int id, String name, String login, String password) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public Alumno() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Examen> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Examen> exams) {
        this.exams = exams;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
    public Examen getExam(int i){
        return exams.get(i);
    }
    
    public void addExam(Examen exam) {
        exams.add(exam);
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", login=" + login + ", name=" + name + ", password=" + password + ", exams=" + exams + '}';
    }
    
}
