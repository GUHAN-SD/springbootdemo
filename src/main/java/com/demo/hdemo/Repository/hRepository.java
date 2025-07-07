package com.demo.hdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.hdemo.Model.hModel;
import java.util.List;

public interface hRepository extends JpaRepository <hModel,Integer>{
	 List<hModel> findByNameContainingIgnoreCase(String name);

}
