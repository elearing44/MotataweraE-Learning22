package com.example.motatawerae_learning.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.motatawerae_learning.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.FirebaseDatabase;


public class RegisterActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference dr;

    Button btn_createAcount;
    TextInputEditText et_name, et_em_ph, et_pass;
    RadioButton rdb_male, rdb_female;
    Spinner spr_class;
    ImageView img_profile,img_check_camera;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);




            btn_createAcount = findViewById(R.id.register_btn_create_acount);

            et_name = findViewById(R.id.register_et_name);
            et_em_ph = findViewById(R.id.register_et_email_or_phone);
            et_pass = findViewById(R.id.register_et_password);

            rdb_male = findViewById(R.id.register_rdb_male);
            rdb_female = findViewById(R.id.register_rdb_female);

            spr_class = findViewById(R.id.register_spr_class);

            img_profile = findViewById(R.id.register_img_profile);
            img_check_camera= findViewById(R.id.register_img_btn_check_calera);

            pb = findViewById(R.id.register_pb_loding);

            et_pass.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });




            btn_createAcount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    database = FirebaseDatabase.getInstance();
                    dr = database.getReference("Student");

                    String name, em_ph, pass, gender, class_id, img;
                    name = et_name.getText().toString();
                    em_ph = et_em_ph.getText().toString();
                    pass = et_pass.getText().toString();
                    gender = (rdb_male.isChecked() ? "M" : rdb_female.isChecked() ? "F" : "");
                    class_id = (String) spr_class.getSelectedItem();
                    dr.child("name").setValue(name).toString();
                    dr.child("email_or_phone").setValue(em_ph).toString();
                    dr.child("password").setValue(pass).toString();
                    dr.child("gender").setValue(gender).toString();
                    dr.child("").setValue(class_id).toString();
//           dr.addListenerForSingleValueEvent(new z);
                    pb.setVisibility(View.VISIBLE);

//


                }
            });



        }
}