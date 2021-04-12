package me.lewisliu.buttonclickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userInput;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.userInput);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String result = userInput.getText().toString();
               result += "\n";
               textView.append(result);
            }
        };
        button.setOnClickListener(onClickListener);
    }
}