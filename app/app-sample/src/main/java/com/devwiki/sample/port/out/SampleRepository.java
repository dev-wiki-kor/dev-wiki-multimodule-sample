package com.devwiki.sample.port.out;

import com.devwiki.sample.Sample;

public interface SampleRepository {
    long save(Sample sample);
}
