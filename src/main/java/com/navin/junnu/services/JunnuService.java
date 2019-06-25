package com.navin.junnu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.navin.junnu.models.JunnuInfo;
import com.navin.junnu.repos.JunnuRepository;

@Service
public class JunnuService {

	@Autowired
	private JunnuRepository junnuRepo;
	
	public List<JunnuInfo> getJunnuNames(){
		return junnuRepo.findAll(Sort.by(Direction.ASC, "name"));
	}
	
	public JunnuInfo saveJunnuName(JunnuInfo junnuInfo) {
		return junnuRepo.save(junnuInfo);
	}
	
	public void removeJunnuName(long id) {
		junnuRepo.deleteById(id);
	}
	
	public List<JunnuInfo> searchForJunnuName(String searchString){
		return junnuRepo.findByNameStartingWith(searchString);
	}
}
