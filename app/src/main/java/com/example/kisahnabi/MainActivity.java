 package com.example.kisahnabi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kisahnabi.ApiInterface;
import com.example.kisahnabi.KisahNabi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25;
    String nabi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn_adam_as);
        btn2=(Button)findViewById(R.id.btn_idris_as);
        btn3=(Button)findViewById(R.id.btn_nuh_as);
        btn4=(Button)findViewById(R.id.btn_hud_as);
        btn5=(Button)findViewById(R.id.btn_shalih_as);
        btn6=(Button)findViewById(R.id.btn_ibrahim_as);
        btn7=(Button)findViewById(R.id.btn_luth_as);
        btn8=(Button)findViewById(R.id.btn_ismail_as);
        btn9=(Button)findViewById(R.id.btn_ishaq_as);
        btn10=(Button)findViewById(R.id.btn_yakub_as);
        btn11=(Button)findViewById(R.id.btn_yusuf_as);
        btn12=(Button)findViewById(R.id.btn_ayub_as);
        btn13=(Button)findViewById(R.id.btn_syuaib_as);
        btn14=(Button)findViewById(R.id.btn_musa_as);
        btn15=(Button)findViewById(R.id.btn_harun_as);
        btn16=(Button)findViewById(R.id.btn_dzulkifli_as);
        btn17=(Button)findViewById(R.id.btn_daud_as);
        btn18=(Button)findViewById(R.id.btn_sulaiman_as);
        btn19=(Button)findViewById(R.id.btn_ilyas_as);
        btn20=(Button)findViewById(R.id.btn_ilyasa_as);
        btn21=(Button)findViewById(R.id.btn_yunus_as);
        btn22=(Button)findViewById(R.id.btn_zakaria_as);
        btn23=(Button)findViewById(R.id.btn_yahya_as);
        btn24=(Button)findViewById(R.id.btn_isa_as);
        btn25=(Button)findViewById(R.id.btn_muhammad_as);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "adam";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama", nabi);
                startActivity(pindah);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "idris";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "nuh";
                Intent pindah =  new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "hud";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "shalih";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "ibrahim";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "luth";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "ismail";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "ishaq";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "yakub";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "yusuf";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "ayub";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "syuaib";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "musa";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "harun";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "dzulkifli";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);

            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "daud";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "sulaiman";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);

            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "ilyas";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "ilyasa";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "yunus";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "zakaria";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "yahya";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "isa";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nabi = "muhammad";
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama",nabi);
                startActivity(pindah);
            }
        });
    }
}
