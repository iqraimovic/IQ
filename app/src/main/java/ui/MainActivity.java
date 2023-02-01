package ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.iqramsandriodlab.R;
import com.example.iqramsandriodlab.databinding.ActivityMainBinding;

import data.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        model = new ViewModelProvider(this).get(MainViewModel.class);

        findViewById(R.id.textview);
        Button btn = findViewById(R.id.mybutton);

        variableBinding.mybutton.setOnClickListener(click->{
            model.editString.postValue(variableBinding.myedittext.getText().toString());
        });

        model.editString.observe(this, s -> variableBinding.textview.setText("Your edit text has " + s));
        
        TextView mytext = findViewById(R.id.textview);
        EditText myedit = findViewById(R.id.myedittext);
        myedit.getText().toString();



       // if(mybutton != null)
            //mybutton.setOnClickListener(View.OnClickListener);
        String editString = myedit.getText().toString();
       //mytext.setText("Your edit text has: " + editString);
        //mytext.text = "Your edit has: " + editString;
       // mybutton.setOnClickListener( vw-> mytext.setText("Your edit has: " + editString));


    }
}