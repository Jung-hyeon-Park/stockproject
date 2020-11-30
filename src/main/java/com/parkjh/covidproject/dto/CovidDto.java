package com.parkjh.covidproject.dto;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Document(indexName = "covid", type = "_doc")
public class CovidDto {

    @Id
    private String code;

    private String name;

    private String sector;

    private String area;
}
