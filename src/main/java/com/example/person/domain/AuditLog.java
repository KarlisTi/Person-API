package com.example.person.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="audit-log")
public class AuditLog {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private Long createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private Long modifiedDate;


}
