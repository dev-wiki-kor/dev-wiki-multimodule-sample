package com.devwiki.sample;

import lombok.Getter;

@Getter
public class Sample {
    private String content;

    public Sample(String content) {
        this.content = content;
    }
}
