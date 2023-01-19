import android.View.view; 
import android.widget.EditText; 
import android.content.Intent;



public void myNavigate (View view) { 
Intent firstIntent = new Intent (this, MainActivity.class); 
startActivity(firstIntent); 
} 

username = (EditText) findViewById(R.id.user_input); 
password = (EditText) findViewById(R.id.password_input); 
if (username.getText().toString().equals("LoughStudent") && password.getText().toString().equals("AdminSRC99..")); { 
if  (username.getText().toString().equals("LoughStudent") && password.getText().toString().equals("AdminSRC99..") { 
Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
}
     }
     else { 
       Toast.makeText(getApplicationContext(), "Incorrect username and password", Toast.LENGTH_LONG).show(); 
     }
    
