package com.example.crud_test.model;

import javax.persistence.*;


@Entity
@Table

public class Crud{
    @Id 
    private String id;
    @Column
    private String author;
    @Column
    private String publisher;
    @Column
    private String genre;
    
    public Crud(){

    }
    public Crud(String s1,String s2,String s3, String s4 )
    {
        id= s1;
        author = s2;
        publisher = s3;
        genre = s4;
    }

    public String getId()
    {
        return id;
    }
    public String getAuthor(){
        return author;       
    }
    public String getPublisher(){
        return publisher;       
    }
    public String getGenre() {
        return genre;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}