package com.devwiki.sample.business;

import com.devwiki.sample.Sample;
import com.devwiki.sample.dto.SampleRegisterQuery;
import com.devwiki.sample.port.in.SampleRegisterUseCase;
import com.devwiki.sample.port.out.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SampleRegisterService implements SampleRegisterUseCase {
    private final SampleRepository repository;

    @Override
    public Long register(SampleRegisterQuery query) {
        Sample sample = new Sample(query.content());
        return repository.save(sample);
    }
}
