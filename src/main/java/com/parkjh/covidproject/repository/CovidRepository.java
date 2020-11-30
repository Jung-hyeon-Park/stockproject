package com.parkjh.covidproject.repository;

import com.parkjh.covidproject.dto.CovidDto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository("covidRepository")
public interface CovidRepository extends ElasticsearchRepository<CovidDto, String> {

    CovidDto getCovidList(String code);
}
