package com.example.demo.service;

import com.example.demo.model.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();

    void saveProvince(Province province);

    void deleteProvince(int id);

    Province findById(int id);

}
