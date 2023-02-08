package ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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

        model.isSelected.observe(this, selected ->{
           variableBinding.mybox.setChecked(selected);
            variableBinding.myradio.setChecked(selected);
            variableBinding.myswitch.setChecked(selected);
            Context context = getApplicationContext();
            CharSequence text = "Your Value is: " + variableBinding.myswitch.isChecked();
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        });

        variableBinding.mybox.setOnCheckedChangeListener((checkBox, isChecked) ->{
            model.isSelected.postValue(isChecked);
        });
        variableBinding.myswitch.setOnCheckedChangeListener((Switch, isChecked) ->{
            model.isSelected.postValue(isChecked);
        });
        variableBinding.myradio.setOnCheckedChangeListener((RadioButton, isChecked) ->{
            model.isSelected.postValue(isChecked);
        });

        variableBinding.imageButton.setOnClickListener(click -> {
            model.iButton.postValue(variableBinding.imageButton.getHeight() + "*" + variableBinding);
        });

        model.iButton.observe(this, c -> {
            Context context = getApplicationContext();
            CharSequence text = "The Value is now: " + variableBinding.imageButton.getHeight();
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        });
        model.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean isChecked) {
                Toast.makeText(getApplicationContext(), "The value is now: " + isChecked, Toast.LENGTH_SHORT).show();
            }
        });



       // if(mybutton != null)
            //mybutton.setOnClickListener(View.OnClickListener);
        String editString = myedit.getText().toString();
       //mytext.setText("Your edit text has: " + editString);
        //mytext.text = "Your edit has: " + editString;
       // mybutton.setOnClickListener( vw-> mytext.setText("Your edit has: " + editString));


    }

    private void setOnCheckedChangeListener(Object o) {
    }
}