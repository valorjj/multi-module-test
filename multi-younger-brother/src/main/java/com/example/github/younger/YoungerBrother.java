package com.example.github.younger;

import com.example.github.bigbrother.BigBrother;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class YoungerBrother {

    private final BigBrother bigBrother;

    public void youngerBrother() {
       log.info("This is from BigBrother {}", bigBrother);
    }


}
