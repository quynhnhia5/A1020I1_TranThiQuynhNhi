package Model.repository;

import Model.BEAN.employee.division;

import java.util.List;

public interface DivisionRepository {
    List<division> findALl();
}