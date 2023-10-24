package com.devwiki.sample;

import com.devwiki.sample.port.out.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class SampleEntityRepository implements SampleRepository {
    private final SampleJpaRepository repository;
    @Override
    public long save(Sample sample) {
        SampleEntity entity = DBSampleMapper.toEntity(sample);
        repository.save(entity);
        return entity.getId();
    }
}
