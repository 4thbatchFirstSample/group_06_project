package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Defect;


@Repository
public interface DefectRepository extends JpaRepository<Defect, Long> {
	List<Defect> findByDefectStatus(String status);
	List<Defect> findByDefectSeverity(String severity);
	List<Defect> findByDefectPriority(String priority);
	List<Defect> findBySubModuleId(Long subMuduleId);
	
	long countByDefectStatus(String status);
	long countByDefectSeverity(String severity);
	long countByDefectPriority(String priority);
	
	boolean existsById(Long id);
	
	
	
	
}
