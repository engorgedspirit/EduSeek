package com.example.dashbrd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView detailRankNIRF,detailTitle,detailMsal,detailHsal,detailBplaced,detailNAACAccr;
    ImageView detailImage,shareBT,detailBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail);

        detailRankNIRF=findViewById(R.id.detNIRF);
        detailImage=findViewById(R.id.detailImage);
        detailTitle=findViewById(R.id.detailTitle);
        detailMsal=findViewById(R.id.detailMsal);
        detailHsal=findViewById(R.id.detailHsal);
        detailBplaced=findViewById(R.id.detBP);
        detailNAACAccr=findViewById(R.id.detNAAC);
        shareBT=findViewById(R.id.sharebt);
        detailBack=findViewById(R.id.detailBack);
        detailBack.setOnClickListener((v -> {
            startActivity(new Intent(this,MainActivity.class));
        }));

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
        shareBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent with the ACTION_SEND action
                Intent shareIntent = new Intent(Intent.ACTION_SEND);

                // Set the MIME type of the content to share (e.g., image/jpeg for JPEG images)
                shareIntent.setType("image/jpeg");

                // Set the URI of the image to share (replace "imageUri" with the actual URI of your image)
                Uri imageUri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/edufind-7bcad.appspot.com/o/Android%20Images%2F1000030291?alt=media&token=46847c37-bdf1-4011-933f-09e14b3747e2"); // Obtain the URI of your image
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);

                // Start the share activity
                startActivity(Intent.createChooser(shareIntent, "Share Image"));
            }
        });

    }
}