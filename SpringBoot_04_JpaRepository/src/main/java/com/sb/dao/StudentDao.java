package com.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sb.pojo.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

}
 