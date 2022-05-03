package com.example;

import org.springframework.web.bind.annotation.ModelAttribute;


public class ProcessSuggestion {
    public String name;

    public String city;

    public String field;

    public String idea;

    public ProcessSuggestion(String name, String city, String field, String idea){
      this.name = name;
      this.city = city;
      this.field = field;
      this.idea = idea;
    }

    @Override
    public String toString() {
        return  "ProcessSuggestion{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", field='" + field + '\'' +
                ", idea='" + idea + '\'' +
                '}';
    }
}
