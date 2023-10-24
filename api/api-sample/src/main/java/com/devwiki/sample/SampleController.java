package com.devwiki.sample;

import com.devwiki.sample.dto.SampleRegisterQuery;
import com.devwiki.sample.dto.SampleRequest;
import com.devwiki.sample.dto.SampleResponse;
import com.devwiki.sample.port.in.SampleRegisterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/sample")
@RestController
public class SampleController {
    private final SampleRegisterUseCase registerUseCase;

    @PostMapping
    public SampleResponse registerSample(@RequestBody SampleRequest request){
        SampleRegisterQuery query = ApiSampleMapper.toQuery(request);
        Long sampleId = registerUseCase.register(query);
        return new SampleResponse(sampleId);
    }
}
