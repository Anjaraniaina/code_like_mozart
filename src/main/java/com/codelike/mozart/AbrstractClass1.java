package com.codelike.mozart;

import lombok.AllArgsConstructor;

import java.util.List;

@Component
@AllArgsConstructor
public abstract class AbstractClass1{
    private final ConcreteDependance1 concreteDependance1;
    private final ConcreteDependance2 concreteDependance2;
}
