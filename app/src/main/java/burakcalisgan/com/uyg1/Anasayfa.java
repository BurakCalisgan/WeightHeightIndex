package burakcalisgan.com.uyg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Anasayfa extends AppCompatActivity {

    EditText boy, yas, kilo, cinsiyet;
    TextView sonuc;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        boy = findViewById(R.id.boy);
        yas = findViewById(R.id.yas);
        kilo = findViewById(R.id.kilo);
        cinsiyet = findViewById(R.id.cinsiyet);
        sonuc = findViewById(R.id.sonuc);

    }

    public void Calculate(View v){
        int b, y, k, c;
        b = Integer.parseInt(boy.getText().toString());
        y = Integer.parseInt(yas.getText().toString());
        k = Integer.parseInt(kilo.getText().toString());
        c = Integer.parseInt(cinsiyet.getText().toString());

        double iKilo = 0 ;

        if (c==1){
            iKilo=(b-100)*0.8+(y/10);
        }
        else if (c==2){
            iKilo=(b-100)*0.9+(y/10);
        }

        if (iKilo == 0){
            sonuc.setText("Hatalı Veri Girişi !");
        }
        else {
            long fark = k-Math.round(iKilo);
            if (fark>0)
                sonuc.setText(fark+" kilo vermelisiniz.");
            else if (fark<0)
                sonuc.setText(Math.abs(fark)+" kilo almalısınız.");
            else
                sonuc.setText("Tebrikler.");
        }
    }
    public void CalculateByGender(View v){
        int b, y, k;
        b = Integer.parseInt(boy.getText().toString());
        y = Integer.parseInt(yas.getText().toString());
        k = Integer.parseInt(kilo.getText().toString());

        double iKilo=0;
        if (v.getId()==R.id.btnKadin) {
            iKilo = iKilo = (b - 100) * 0.8 + (y / 10);
        }
        else {
            iKilo = iKilo = (b - 100) * 0.9 + (y / 10);
        }

        if (iKilo == 0){
            sonuc.setText("Hatalı Veri Girişi !");
        }
        else {
            long fark = k-Math.round(iKilo);
            if (fark>0)
                sonuc.setText(fark+" kilo vermelisiniz.");
            else if (fark<0)
                sonuc.setText(Math.abs(fark)+" kilo almalısınız.");
            else
                sonuc.setText("Tebrikler.");
        }
    }
}
