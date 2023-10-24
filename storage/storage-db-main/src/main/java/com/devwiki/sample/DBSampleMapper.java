package com.devwiki.sample;

public class DBSampleMapper {
    public static SampleEntity toEntity(Sample sample) {
        return new SampleEntity(sample.getContent());
    }
}
