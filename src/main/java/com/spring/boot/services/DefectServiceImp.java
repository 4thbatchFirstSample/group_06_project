package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Defect;
import com.spring.boot.repositories.DefectRepository;

@Service
public class DefectServiceImp implements DefectService {
	@Autowired
	private DefectRepository defectRepository;

	@Override
	public Defect addDefect(Defect defect) {
		
		return defectRepository.save(defect);
	}

	@Override
	public List<Defect> getAllDefects() {
		// TODO Auto-generated method stub
		return defectRepository.findAll();
	}

	@Override
	public Defect getDefectByID(Long id) {
		// TODO Auto-generated method stub
		return defectRepository.findById(id).orElse(null);
	}

	@Override
	public void updateDefect(Defect defect) {
		// TODO Auto-generated method stub
		
//		Defect existDefect = defectRepository.findById(defect.getDefectId()).orElse(null);
//		
//		existDefect.setDefectName(defect.getDefectName());
//		existDefect.setDefectPriority(defect.getDefectPriority());
//		existDefect.setDefectSeverity(defect.getDefectSeverity());
//		existDefect.setDefectStatus(defect.getDefectStatus());
//		existDefect.setDefectAssignTo(defect.getDefectAssignTo());
//		existDefect.setDefectSubModule(defect.getDefectSubModule());
//		existDefect.setDefectType(defect.getDefectType());
//		existDefect.setDefectEnteredBy(defect.getDefectEnteredBy());
//		
		 defectRepository.save(defect);
	}

	@Override
	public void deleteDefect(Long id) {
		defectRepository.deleteById(id);
		
	}

	

	@Override
	public List<Defect> getBySubModule(Long id) {
		// TODO Auto-generated method stub
		return defectRepository.findBySubModuleId(id);
		
	}

	@Override
	public List<Defect> getBydefectStatus(String status) {
		// TODO Auto-generated method stub
		return defectRepository.findByDefectStatus(status);
	}

	@Override
	public List<Defect> getBydefectSeverity(String severity) {
		// TODO Auto-generated method stub
		
		return defectRepository.findByDefectSeverity(severity);
	}

	@Override
	public List<Defect> getBydefectPriority(String priority) {
		// TODO Auto-generated method stub
		return defectRepository.findByDefectPriority(priority);
	}
	
	@Override
	public long countStatus(String status) {
		return defectRepository.countByDefectStatus(status);
		
	}

	@Override
	public long countSeverity(String severity) {
		// TODO Auto-generated method stub
		return defectRepository.countByDefectSeverity(severity);
	}

	@Override
	public long countPriority(String priority) {
		// TODO Auto-generated method stub
		return defectRepository.countByDefectPriority(priority);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return defectRepository.existsById(id);
	}
	
	
}
