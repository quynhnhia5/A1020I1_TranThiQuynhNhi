package com.example.demo.service.impl;

import com.example.demo.model.Province;
import com.example.demo.repository.ProvinceRepository;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    ProvinceRepository provinceRepository;


    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public void saveProvince(Province province) {
        provinceRepository.save(province);

    }

    @Override
    public void deleteProvince(int id) {
        provinceRepository.deleteById(id);

    }

    @Override
    public Province findById(int id) {
        return provinceRepository.findById(id).orElse(null);
    }
}
