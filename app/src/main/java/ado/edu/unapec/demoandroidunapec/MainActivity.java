package ado.edu.unapec.demoandroidunapec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);

    }

   public void LoginOnClick(View v) {
       String puser = user.getText().toString();
       String ppass = pass.getText().toString();

       login(puser,ppass);
   }
    public void login(String user,String pass){
            if(user.equalsIgnoreCase("Rod") & pass.equalsIgnoreCase("123")){
                Toast.makeText(getApplicationContext(),"Acceso Correcto",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(), "Acceso Incorrecto", Toast.LENGTH_SHORT).show();
            }
    }

    public void ClearOnClick(View v){
        btnclear();
    }

    public void btnclear(){
        user.setText("");
        pass.setText("");

        user.setHint("Username");
        pass.setHint("Password");


    }
}
