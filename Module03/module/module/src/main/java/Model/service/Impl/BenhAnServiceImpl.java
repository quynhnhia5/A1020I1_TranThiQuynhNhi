package Model.service.Impl;

import Model.BEAN.BenhNhan.benhan;
import Model.repository.BenhAnRepository;
import Model.repository.Impl.BenhAnRepositoryImpl;
import Model.service.BenhAnService;

import java.util.List;

public class BenhAnServiceImpl implements BenhAnService {
    BenhAnRepository benhAnRepository=new BenhAnRepositoryImpl();
    public List<benhan> findALl() {
        return benhAnRepository.findALl();
    }
}
