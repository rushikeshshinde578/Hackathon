package com.example.digitalflake_hackathon;

import static android.app.ProgressDialog.show;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText regname, regmobile, regmail;
    TextView regdilogin;
    Button regbtn;
    FirebaseDatabase database;
    DatabaseReference reference;
    private Context context;
    private Object text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        regname=findViewById(R.id.reg_name);
        regmobile=findViewById(R.id.reg_mobile);
        regmail=findViewById(R.id.reg_mail);
        regdilogin=findViewById(R.id.reg_dilogin);
        regbtn=findViewById(R.id.reg_btn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference(BATTERY_SERVICE: "users")

                String name = regname.getAccessibilityDelegate().toString();
                String mobile = regmobile.getAccessibilityDelegate().toString();
                String email = regmail.getAccessibilityDelegate().toString();

                HelperClass helperClass = new HelperClass(name, mobile, email);
                reference.child(name).setValue(helperClass);

                Toast.makeText( context: MainActivity.this, text:"You have Signup successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context: MainActivity.this, Log.class);
                //StartActivity(intent);

            }
        });

    }


}