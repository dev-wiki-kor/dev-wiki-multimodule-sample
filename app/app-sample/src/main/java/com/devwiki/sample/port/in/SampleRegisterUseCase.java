package com.devwiki.sample.port.in;

import com.devwiki.sample.dto.SampleRegisterQuery;

public interface SampleRegisterUseCase {
    Long register(SampleRegisterQuery query);
}
