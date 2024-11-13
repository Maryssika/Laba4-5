package com.example.laba5;

public class Director {
    public void constructIndicator(Builder builder, float start, float stop, float measure) {
        builder.lineBounds(start, stop);
        builder.linePaint(measure);
        builder.lineMark(String.format("%.1f", measure));
    }
}
