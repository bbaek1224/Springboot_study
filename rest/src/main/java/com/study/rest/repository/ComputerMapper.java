package com.study.rest.repository;

import com.study.rest.entity.Computer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComputerMapper {
    int save(Computer computer);
    List<Computer> findComputerByCompanyAndCpu(Computer computer);
    Computer findComputerByComputerId(int id);
    int delete(int id);
    int update(Computer computer);
}
