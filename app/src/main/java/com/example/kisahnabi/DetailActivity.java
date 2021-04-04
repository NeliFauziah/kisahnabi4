package com.example.kisahnabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Query;

public class DetailActivity extends AppCompatActivity {
    TextView txtnama, txtlahir, txtumur, txttempat, txtimage, txtkisah;
    ImageView imgkisah;
    ApiInterface apiInterface;
    ObjekBesar nabi;
    String namanabinya;
    KisahNabi nabinya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtnama = (TextView) findViewById(R.id.TextView2);
        txtlahir = (TextView) findViewById(R.id.TextView3);
        txtumur = (TextView) findViewById(R.id.TextView4);
        txttempat = (TextView) findViewById(R.id.TextView5);
        imgkisah = (ImageView) findViewById(R.id.img_kisahmm);
        txtkisah = (TextView) findViewById(R.id.TextView7);
        Intent dapet = getIntent();
        namanabinya = dapet.getStringExtra("nama");
        apiInterface = ApiClient.ambilKisah().create(ApiInterface.class);
        Call<ObjekBesar> call = apiInterface.ambilKisahnya(namanabinya);
        call.enqueue(new Callback<ObjekBesar>() {
            @Override
            public void onResponse(Call<ObjekBesar> call, Response<ObjekBesar> response) {
                nabi=response.body();
                nabinya=nabi.getNabi();
                txtnama.setText(nabinya.getNama());
                txtlahir.setText(nabinya.getLahir());
                txtumur.setText(nabinya.getUmur());
                txttempat.setText(nabinya.getTempat());
                txtkisah.setText(nabinya.getKisah());
                String foto=nabinya.getImage().replace("http","https");
                Picasso.with(getBaseContext()).load(foto).fit().into(imgkisah);
            }

            @Override
            public void onFailure(Call<ObjekBesar> call, Throwable t) {

            }
        });
    }
}