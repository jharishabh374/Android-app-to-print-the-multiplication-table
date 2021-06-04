package com.example.add;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private Button button;
  private EditText editTextNumber;
  private TextView textView3;
    private TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        editTextNumber= findViewById(R.id.editTextNumber);
        textView3= findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.button:
                        StringBuffer buffer = new StringBuffer();
                        int res;
                        int n = Integer.parseInt(editTextNumber.getText().toString(););

                        // logic for table
                        for (int i = 1; i <= 10; i++) {
                            int ans = (i * n);
                            buffer.append(n + " X " + i
                                    + " = " + ans + "\n\n");
                        }

                        // set the buffer textview
                        textView3.setText(buffer);
                        break;
                }
            }
        });
    }
}
