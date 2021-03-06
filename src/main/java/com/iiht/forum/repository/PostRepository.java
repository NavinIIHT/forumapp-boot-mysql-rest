package com.iiht.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iiht.forum.model.VisitorPosts;

public interface PostRepository extends JpaRepository<VisitorPosts, Long>{
	
}