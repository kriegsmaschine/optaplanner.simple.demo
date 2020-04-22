package com.java.optaplex.resource;

import com.java.optaplex.pojo.Test;
import org.optaplanner.core.api.solver.SolverManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/api")
public class MainResource {

    @Inject
    SolverManager<Test, Long> solverManager;

    @GetMapping("/test")
    public Test test () {
        return new Test("Result message here");
    }

}
