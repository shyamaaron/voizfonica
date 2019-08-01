package com.example.orderdet.repository;

import com.example.orderdet.domain.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlanRepository extends MongoRepository<Plan,String> {
    public List<Plan> findByPlanType(String planType);
}
