package org.vitrivr.cineast.core.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.vitrivr.cineast.core.benchmark.model.BenchmarkMode;

import java.nio.file.Path;
import java.nio.file.Paths;


public class BenchmarkConfig {
    private BenchmarkMode mode = BenchmarkMode.OFF;

    private String path;

    @JsonCreator
    public BenchmarkConfig() {}

    @JsonProperty
    public BenchmarkMode getMode() {
        return mode;
    }
    public void setMode(BenchmarkMode mode) {
        this.mode = mode;
    }

    @JsonProperty
    public Path getPath() {
        if (this.path != null) {
            return Paths.get(this.path);
        } else {
            return Paths.get(".");
        }
    }
    public void setPath(String path) {
        this.path = path;
    }
}
