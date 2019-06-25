package com.navin.junnu.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.navin.junnu.models.JunnuInfo;

@Repository
public interface JunnuRepository extends JpaRepository<JunnuInfo, Long>{

	public List<JunnuInfo> findByNameStartingWith(String searchString);
}
