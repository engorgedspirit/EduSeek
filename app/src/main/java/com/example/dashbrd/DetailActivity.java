package com.example.dashbrd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView detailDesc,detailTitle;
    ImageView detailImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailDesc=findViewById(R.id.detailDesc);
        detailImage=findViewById(R.id.detailImage);
        detailTitle=findViewById(R.id.detailTitle);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            detailDesc.setText(bundle.getString("NIRFRank"));
            detailTitle.setText(bundle.getString("ClgName"));
            Glide.with(this).load(bundle.getString("Image")).into(detailImage);
        }

    }
}