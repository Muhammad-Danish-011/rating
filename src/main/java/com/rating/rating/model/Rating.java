package com.rating.rating.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import io.micrometer.common.lang.NonNull;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="rating")
public class Rating {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @CreationTimestamp
    private Instant created ; 
    @CreationTimestamp
    private Instant updated;
    
    @NonNull
    private Long appointment_id;
    private Long value ;
    private String note;
    

}