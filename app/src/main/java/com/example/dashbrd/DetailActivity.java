package com.example.dashbrd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView detailRankNIRF,detailTitle,detailMsal,detailHsal,detailBplaced,detailNAACAccr;
    ImageView detailImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailRankNIRF=findViewById(R.id.detNIRF);
        detailImage=findViewById(R.id.detailImage);
        detailTitle=findViewById(R.id.detailTitle);
        detailMsal=findViewById(R.id.detailMsal);
        detailHsal=findViewById(R.id.detailHsal);
        detailBplaced=findViewById(R.id.detBP);
        detailNAACAccr=findViewById(R.id.detNAAC);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            detailRankNIRF.setText(bundle.getString("NIRFRank"));
            detailTitle.setText(bundle.getString("ClgName"));
            detailMsal.setText(bundle.getString("MedSal"));
            detailBplaced.setText(bundle.getString("BatchP"));
            detailNAACAccr.setText(bundle.getString("NAACAcc"));
            detailHsal.setText(bundle.getString("HSal"));
            Glide.with(this).load(bundle.getString("Image")).into(detailImage);
        }

    }
}