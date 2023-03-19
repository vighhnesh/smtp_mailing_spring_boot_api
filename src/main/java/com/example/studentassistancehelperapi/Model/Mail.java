package com.example.studentassistancehelperapi.Model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Mail {
    private String name;
    private ArrayList<String> to;
    private String from;
    private String subject;
}





