package com.place.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Link extends Base {

    //    Link
//    - title, link, order
//    - createdBy, createdOn
//    - userId, deleted, isEnabled
    @Id
    private Integer uuid;
    private String title;
    private String url;
    private Integer order;
    private Boolean isEnable;

}
