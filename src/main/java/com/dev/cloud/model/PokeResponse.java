package com.dev.cloud.model;

import java.util.List;

public class PokeResponse {
    private int count;
    private String next;
    private String previous;
    private List<Poke> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Poke> getResults() {
        return results;
    }

    public void setResults(List<Poke> results) {
        this.results = results;
    }
}
