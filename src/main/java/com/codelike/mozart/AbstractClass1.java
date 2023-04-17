package com.codelike.mozart;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractClass1 {
    private ConcreteDependance1 concreteDependance1;
    private ConcreteDependance2 concreteDependance2;
}
