package com.devwiki.sample;

import com.devwiki.sample.dto.SampleRegisterQuery;
import com.devwiki.sample.dto.SampleRequest;

public class ApiSampleMapper {
    public static SampleRegisterQuery toQuery(SampleRequest request){
        return new SampleRegisterQuery(
                request.content()
        );
    }
}
