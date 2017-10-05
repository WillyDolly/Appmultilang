package com.thanhtam.appmultilang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView  txtThongtin;
    EditText edtHoTen, edtEmail, edtSDT;
    Button btnXacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = edtHoTen.getText().toString();
                String email = edtEmail.getText().toString();
                String sdt = edtSDT.getText().toString();

                txtThongtin.setText(getResources().getString(R.string.txtChaoBan) + " " + hoten + " " + getResources().getString(R.string.txtEmail) + " " + email + getResources().getString(R.string.txtSDT) + " "+ sdt);
            }
        });

    }
    private void Anhxa(){
        btnXacnhan = (Button)findViewById(R.id.buttonXacnhan);
        edtHoTen = (EditText)findViewById(R.id.editTextHoten);
        edtEmail = (EditText)findViewById(R.id.editTextEmail);
        edtSDT = (EditText)findViewById(R.id.editTextSDT);
        txtThongtin = (TextView)findViewById(R.id.textViewThongtin);


    }
}
