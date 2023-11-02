package mx.edu.isc.tesoem.agcp.p10p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonalizaToast("Ferrari", "Rojo", R.drawable.ferrari);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PersonalizaToast("Itachi", "Uchiha", R.drawable.itachi);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PersonalizaToast("Luis", "Miguel", R.drawable.luismiguel);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PersonalizaToast("Pikachu", "Poderoso", R.drawable.pikachu);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PersonalizaToast("Stitch", "Azul", R.drawable.stitch);
            }
        });
    }

    private void PersonalizaToast(String texto1, String texto2, int imagenResource) {
        LayoutInflater inflater = getLayoutInflater();
        View customToastView = inflater.inflate(R.layout.activity_plantillas, (ViewGroup) findViewById(R.id.grupo_temp));

        TextView txt1 = customToastView.findViewById(R.id.txt1);
        TextView txt2 = customToastView.findViewById(R.id.txt2);
        ImageView ivimagen = customToastView.findViewById(R.id.ivimagen);

        txt1.setText(texto1);
        txt2.setText(texto2);
        ivimagen.setImageResource(imagenResource);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 10, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(customToastView);
        toast.show();
    }
}