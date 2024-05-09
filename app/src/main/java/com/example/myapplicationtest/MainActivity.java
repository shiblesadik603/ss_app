package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create instances of shapes and colors
        Circle circle = new Circle("Circle", 5.0);
        Square square = new Square("Square", 4.0);
        Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        Red red = new Red();
        Blue blue = new Blue();
        Green green = new Green();

        // Update UI with information about the created objects
        TextView shapeInfoTextView = findViewById(R.id.shape_info);
        shapeInfoTextView.setText("Circle Area: " + circle.area() +
                "\nCircle Perimeter: " + circle.perimeter() +
                "\nSquare Area: " + square.area() +
                "\nSquare Perimeter: " + square.perimeter() +
                "\nTriangle Area: " + triangle.area() +
                "\nTriangle Perimeter: " + triangle.perimeter());

        TextView colorInfoTextView = findViewById(R.id.color_info);
        colorInfoTextView.setText("Red Color: " + red.name +
                "\nBlue Color: " + blue.name +
                "\nGreen Color: " + green.name);
    }

}