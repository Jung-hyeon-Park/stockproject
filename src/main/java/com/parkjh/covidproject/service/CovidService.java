package com.parkjh.covidproject.service;

import com.parkjh.covidproject.dto.CovidDto;
import com.parkjh.covidproject.repository.CovidRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class CovidService {

    private CovidRepository covidRepository;

    public void save(CovidDto play) {
        covidRepository.save(play);
    }

    public List<CovidDto> findAll() {
        return Lists.newArrayList(covidRepository.findAll());
    }

    public CovidDto getCovidList(String user) {
        return covidRepository.getCovidList(user);
    }
}
