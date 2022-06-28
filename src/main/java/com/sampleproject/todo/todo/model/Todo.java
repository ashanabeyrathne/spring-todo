package com.sampleproject.todo.todo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "todo")

public class Todo {

    @Id
    private String id;
    private String description;
    private boolean status;


}
