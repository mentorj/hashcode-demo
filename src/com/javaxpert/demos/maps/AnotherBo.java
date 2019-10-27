package com.javaxpert.demos.maps;

import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * One other Business object class
 */
public class AnotherBo implements Comparable{
    private String name;
    private String address;
    private String birthDate;

    public AnotherBo(String name, String address, String birthDate) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnotherBo anotherBo = (AnotherBo) o;
        return Objects.equals(name, anotherBo.name) &&
                Objects.equals(address, anotherBo.address) &&
                Objects.equals(birthDate, anotherBo.birthDate);
    }

    @Override
    public int hashCode() {
        LocalTime now = LocalTime.now();
        return now.getSecond();
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof AnotherBo)){
            return -1;
        }
        if(o!=null && o.equals(o)){
            return 0;
        }
        else{
            AnotherBo bo = (AnotherBo)o;
            return name.compareTo(bo.name);
        }
    }
}
