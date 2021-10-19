package mx.edu.tesoem.isc.g7s21hugo4295p7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtcolor;
    Spinner spcolor;
    ArrayAdapter<String> adaptador;

    List<String> elementoscolor = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtcolor = findViewById(R.id.txtcolor);
        spcolor = findViewById(R.id.spcolor);

        //List = null;
    }

    public void llenarlista(View v){
        switch (v.getId()){
            case R.id.btnagrega:
                agregarelemento(txtcolor.getText().toString());
                break;
        }
    }

    private void agregarelemento(String color){
        elementoscolor.add(color);
        llenaradaptador();
    }

    private void llenaradaptador(){
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,elementoscolor);
        spcolor.setAdapter(adaptador);
    }
}