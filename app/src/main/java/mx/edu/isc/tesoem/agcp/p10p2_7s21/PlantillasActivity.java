package mx.edu.isc.tesoem.agcp.p10p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlantillasActivity extends AppCompatActivity {

    ImageView ivimagen;
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantillas);

        ivimagen = findViewById(R.id.ivimagen);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
    }
}