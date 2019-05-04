package itsj.example.ejerciciocalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText cajaHistorial, cajaEntrada;
    Button btnMC, btnMR, btnMMas, btnMMenos, btnMS, btnMHistorial;
    Button btnPorcentaje, btnRaiz, btnPotencia, btnUnoEntreX, btnDividir, btnMultiplicar,  btnRestar, btnSumar, btnIgual,
            btnCE, btnC, btnDelete, btnMasMenos, btnPunto;
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero;


    double primerNumero, segundoNumero, resultado;
    public int operacionARealizar;
    double ms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cajaEntrada=findViewById(R.id.caja_entrada);
        cajaHistorial=findViewById(R.id.caja_historial);
        operacionARealizar=0;


        btnMC=findViewById(R.id.btn_mc);
        btnMC.setOnClickListener(this);
        btnMR=findViewById(R.id.btn_mr);
        btnMR.setOnClickListener(this);
        btnMMas=findViewById(R.id.btn_m_mas);
        btnMMas.setOnClickListener(this);
        btnMMenos=findViewById(R.id.btn_m_menos);
        btnMMenos.setOnClickListener(this);
        btnMS=findViewById(R.id.btn_ms);
        btnMS.setOnClickListener(this);
        btnMHistorial=findViewById(R.id.btn_m_historial);
        btnMHistorial.setOnClickListener(this);
        btnMultiplicar=findViewById(R.id.btn_multiplicar);
        btnMultiplicar.setOnClickListener(this);
        btnSumar=findViewById(R.id.btn_sumar);
        btnSumar.setOnClickListener(this);


        btnPorcentaje=findViewById(R.id.btn_porcentaje);
        btnPorcentaje.setOnClickListener(this);
        btnRaiz=findViewById(R.id.btn_raiz);
        btnRaiz.setOnClickListener(this);
        btnPotencia=findViewById(R.id.btn_potencia);
        btnPotencia.setOnClickListener(this);
        btnUnoEntreX=findViewById(R.id.btn_uno_entre_x);
        btnUnoEntreX.setOnClickListener(this);
        btnDividir=findViewById(R.id.btn_dividir);
        btnDividir.setOnClickListener(this);
        btnRestar=findViewById(R.id.btn_restar);
        btnRestar.setOnClickListener(this);
        btnIgual=findViewById(R.id.btn_igual);
        btnIgual.setOnClickListener(this);
        btnCE=findViewById(R.id.btn_ce);
        btnCE.setOnClickListener(this);
        btnC=findViewById(R.id.btn_c);
        btnC.setOnClickListener(this);
        btnDelete=findViewById(R.id.btn_delete);
        btnDelete.setOnClickListener(this);
        btnMasMenos=findViewById(R.id.btn_mas_menos);
        btnMasMenos.setOnClickListener(this);
        btnPunto=findViewById(R.id.btn_punto);
        btnPunto.setOnClickListener(this);


        btnUno=findViewById(R.id.btn_1);
        btnUno.setOnClickListener(this);
        btnDos=findViewById(R.id.btn_2);
        btnDos.setOnClickListener(this);
        btnTres=findViewById(R.id.btn_3);
        btnTres.setOnClickListener(this);
        btnCuatro=findViewById(R.id.btn_4);
        btnCuatro.setOnClickListener(this);
        btnCinco=findViewById(R.id.btn_5);
        btnCinco.setOnClickListener(this);
        btnSeis=findViewById(R.id.btn_6);
        btnSeis.setOnClickListener(this);
        btnSiete=findViewById(R.id.btn_7);
        btnSiete.setOnClickListener(this);
        btnOcho=findViewById(R.id.btn_8);
        btnOcho.setOnClickListener(this);
        btnNueve=findViewById(R.id.btn_9);
        btnNueve.setOnClickListener(this);
        btnCero=findViewById(R.id.btn_0);
        btnCero.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        int click=v.getId();
        String cadena="";
        cadena=cadena+cajaEntrada.getText().toString();

        if(click==R.id.btn_1)
            insertarDigitos(cadena, "1");
        else if(click==R.id.btn_2)
            insertarDigitos(cadena, "2");
        else if(click==R.id.btn_3)
            insertarDigitos(cadena, "3");
        else if(click==R.id.btn_4)
            insertarDigitos(cadena, "4");
        else if(click==R.id.btn_5)
            insertarDigitos(cadena, "5");
        else if(click==R.id.btn_6)
            insertarDigitos(cadena, "6");
        else if(click==R.id.btn_7)
            insertarDigitos(cadena, "7");
        else if(click==R.id.btn_8)
            insertarDigitos(cadena, "8");
        else if(click==R.id.btn_9)
            insertarDigitos(cadena, "9");
        else if(click==R.id.btn_0) {
            if(cajaEntrada.getText().toString().equals("0"))
                cajaEntrada.setText("0");
            else
                cajaEntrada.setText(cadena+"0");
        }
    }



    public void insertarDigitos(String cadena, String digitoAInsertar){
        if(cajaEntrada.getText().toString().equals("0"))
            cajaEntrada.setText(digitoAInsertar);
        else if(cajaEntrada.getText().toString().equals("+") || cajaEntrada.getText().toString().equals("-") || cajaEntrada.getText().toString().equals("x") || cajaEntrada.getText().toString().equals("\u00F7")) {
            cadena="";
            cajaEntrada.setText(cadena+digitoAInsertar);
        }
        else
            cajaEntrada.setText(cadena+digitoAInsertar);
    }
}
