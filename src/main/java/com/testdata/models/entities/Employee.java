package com.testdata.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(generator = "uuid-generator", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private String department;
    private String slave;
}
