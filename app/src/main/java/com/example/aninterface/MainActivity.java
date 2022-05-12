package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    public CheckBox checkVerde,CheckVermelho,CheckAzul; // variaves do CheckBox
    public EditText Email,senha;
    public TextView textoResultado,coresResultado,textoRB;
    public RadioButton mascu,femin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //  Texto do Resultado do login
        textoResultado = findViewById(R.id.texto);

        //Campos de Login e senha
         Email = findViewById(R.id.email);
         senha = findViewById(R.id.senha);

        // CheckBox
         checkVerde = findViewById(R.id.verde);
         CheckVermelho = findViewById(R.id.vermelho);
         CheckAzul = findViewById(R.id.azul);

        // Resultado dos CheckBox
        coresResultado = findViewById(R.id.cores);

        //RadioButton
        mascu = findViewById(R.id.rbMasc);
        femin = findViewById(R.id.rbFemi);

        //Resultado do RadioButton
        textoRB = findViewById(R.id.tipoSexo);

    }

    public void RadioButton(){
        if(mascu.isChecked()){
              String vlMasc = mascu.getText().toString();//Transforma em string
              textoRB.setText(" o valor Retornado é Masculino" +"\n"+"\n"+"Valor do RadioButton: "+ vlMasc);

        }else if(femin.isChecked()){
            String vlfemin = femin.getText().toString();//Transforma em string
            textoRB.setText(" o valor Retornado é Feminino"+"\n"+"\n"+"Valor do RadioButton: "+vlfemin);
        }

    }

    public void CheckBox(){
        // pegando de forma se e verdadeira ou falsa
       boolean resulVerde = checkVerde.isChecked();
        String texto = "Verde: " +resulVerde;

       boolean resulVermelho = CheckVermelho.isChecked();
       String  resuVerm = "Vermelho: " +resulVermelho;

       boolean resulAzul = CheckAzul.isChecked();
       String resuAzul = "Azul: " +resulAzul;

        // definindo o texto
       String texto1 = "";
       if(checkVerde.isChecked()){
           texto1 = texto1+ "\n" +"Verde: selecionado " ;
       }
      if(CheckVermelho.isChecked()){
           texto1 = texto1+ "\n" +"Vermelho: selecionado " ;
      }
      if(CheckAzul.isChecked()){
           texto1 = texto1+ "\n" + "Azul: selecionado " ;
      }

      // pegando o texto da CheckBox
        String texto2 = "";
      if(checkVerde.isChecked()){
          texto2 = checkVerde.getText().toString();
      }
      if(CheckVermelho.isChecked()){
          String corRed = CheckVermelho.getText().toString();//Transforma em string
          texto2 = texto2 + "\n"+ corRed;
      }
      if(CheckAzul.isChecked()){
          String corBlue = CheckAzul.getText().toString();
          texto2 = texto2 +"\n"+ corBlue;
      }

        coresResultado.setText("## Retornando Falso ou True ##"+"\n"+texto+"\n"+resuAzul+"\n"+resuVerm+"\n"+"\n"
                +"## Retornando Texto feito ##"+ texto1+"\n"+"\n"+"#### Texto do CheckBox ####"+"\n"+texto2 );
    }

    public void enviar(View view){
//        Log.d("TESTE", String.valueOf(checkVerde.isChecked()));
        RadioButton();
        CheckBox();//Puxando o metodo

        String name = Email.getText().toString();
        String sen = senha.getText().toString();

            textoResultado.setText("o Login é: "+name +"\n"+" a senha digitada é: " + sen);

    }

    public void limpar(View view) {
        textoResultado.setText(" ");

    }

}