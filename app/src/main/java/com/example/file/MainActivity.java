package com.example.file;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText fileName, content;
    TextView path;
    Button save,load;
    String file_name,file_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileName = (EditText) findViewById(R.id.edtFileName);
        content = (EditText) findViewById(R.id.edtContent);
        path = (TextView) findViewById(R.id.txtShowPath);
        save = (Button) findViewById(R.id.btnSave);
        load= (Button) findViewById(R.id.btnLoad);

        try {
            path.setText(getFilesDir().getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
