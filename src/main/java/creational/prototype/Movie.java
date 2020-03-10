package creational.prototype;

import lombok.Data;

public class Movie extends Item {
    private String runtime;

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
