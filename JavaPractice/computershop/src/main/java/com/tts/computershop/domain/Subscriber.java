package com.tts.computershop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private boolean amdNews;
    private boolean intelNews;

    public Subscriber(){
    }

    public Subscriber(String email, boolean amdNews, boolean intelNews) {
        this.email = email;
        this.amdNews = amdNews;
        this.intelNews = intelNews;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isAmdNews() {
        return amdNews;
    }

    public void setAmdNews(boolean amdNews) {
        this.amdNews = amdNews;
    }

    public boolean isIntelNews() {
        return intelNews;
    }

    public void setIntelNews(boolean intelNews) {
        this.intelNews = intelNews;
    }


    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", amdNews=" + amdNews +
                ", intelNews=" + intelNews +
                '}';
    }
}
