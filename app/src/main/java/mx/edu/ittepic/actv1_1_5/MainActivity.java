package mx.edu.ittepic.actv1_1_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        lista = (ListView) findViewById(R.id.LV);

        final String[] tabla = new String[] {
                "RESUMED: \n Cuando ha perdido el foco pero todavía es parcialmente visible. \n ",
                "STARTED: \n Cuando ocupa el primer plano. La pantalla está visible y tiene el foco de la interaccion del usuario. \n ",
                "STOPPED: \n Cuando nada de ella es visible. \n ",
                "RESUMED: \n Este metodo se llama cuando la actividad va a  empezar a interactual con el usuario despues de estar en estado de pausa. \n ",
                "CREATED: \n Este metodo se llama al crear una actividad. \n ",
                "RESTART: \n Este metodo se llama despues de que una actividad se haya detenido, antes de que se inicie de nuevo. \n ",
                "DESTROY: \n Este es el ultimo metodo que se llama en un a actividad antes de que sea destruido. \n ",
        };

        final List<String> list = new ArrayList<String>(Arrays.asList(tabla));

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list);

        lista.setAdapter(arrayAdapter);
    }
}
