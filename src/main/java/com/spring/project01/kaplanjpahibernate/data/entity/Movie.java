package com.spring.project01.kaplanjpahibernate.data.entity;

import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.time.LocalDate;

//@Embeddable
public class Movie {
    private long m_id_movie;
    private String m_name_movie;
    private LocalDate m_sceneTime;
    private long m_rating;
    private BigDecimal m_cost;
    private float m_imdb;

    public Movie()
    {
    }

    public Movie(String name, LocalDate sceneTime, long rating, BigDecimal cost, float imdb)
    {
        this(0, name, sceneTime, rating, cost, imdb);
    }

    public Movie(long id, String name, LocalDate sceneTime, long rating, BigDecimal cost, float imdb)
    {
        m_id_movie = id;
        m_name_movie = name;
        m_sceneTime = sceneTime;
        m_rating = rating;
        m_cost = cost;
        m_imdb = imdb;
    }

    public long getId()
    {
        return m_id_movie;
    }

    public void setId(long id)
    {
        m_id_movie = id;
    }

    public String getName()
    {
        return m_name_movie;
    }

    public void setName(String name)
    {
        m_name_movie = name;
    }

    public LocalDate getSceneTime()
    {
        return m_sceneTime;
    }

    public void setSceneTime(LocalDate sceneTime)
    {
        m_sceneTime = sceneTime;
    }

    public long getRating()
    {
        return m_rating;
    }

    public void setRating(long rating)
    {
        m_rating = rating;
    }

    public BigDecimal getCost()
    {
        return m_cost;
    }

    public void setCost(BigDecimal cost)
    {
        m_cost = cost;
    }

    public float getImdb()
    {
        return m_imdb;
    }

    public void setImdb(float imdb)
    {
        m_imdb = imdb;
    }

    @Override
    public String toString()
    {
        return String.format("[%d]%s-%s-%d-%s-%f", m_id_movie, m_name_movie, m_sceneTime, m_rating, m_cost, m_imdb);
    }
}
