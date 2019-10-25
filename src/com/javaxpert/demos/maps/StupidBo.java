package com.javaxpert.demos.maps;

import java.util.Objects;

/**
 * A Business object, stupid one...
 */
public class StupidBo {
    private String message;
    private int counter;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public StupidBo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StupidBo stupidBo = (StupidBo) o;
        return counter == stupidBo.counter &&
                message.equals(stupidBo.message);
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
