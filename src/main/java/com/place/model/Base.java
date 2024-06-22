package com.place.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
import java.util.UUID;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Base {

    private Date createdOn;
    private String createdBy;
    private Boolean deleted;

}
