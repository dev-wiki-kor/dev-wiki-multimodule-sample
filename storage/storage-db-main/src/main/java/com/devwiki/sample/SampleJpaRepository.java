package com.devwiki.sample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleJpaRepository extends JpaRepository<SampleEntity, Long> {
}
