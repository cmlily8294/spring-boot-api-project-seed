package com.company.project.model;

import javax.persistence.*;

@Table(name = "public.student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select nextval('public.student_id_seq);")
    private Integer id;

    private String name;

    private String number;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}