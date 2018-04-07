package com.company.Interfaces;

public interface IReader {
    default String read() {
        return "Hello";
    }
}
