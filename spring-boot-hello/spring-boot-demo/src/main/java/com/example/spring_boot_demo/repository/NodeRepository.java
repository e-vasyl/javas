package com.example.spring_boot_demo.repository;

import com.example.spring_boot_demo.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodeRepository extends JpaRepository<Node, Long> {
}
