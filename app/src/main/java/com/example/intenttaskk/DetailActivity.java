package com.example.intenttaskk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String KEY_DATA = "key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDetail = findViewById(R.id.detail);
        ImageView tvImage = findViewById(R.id.detailImage);
        TextView tvNama = findViewById(R.id.detailNama);
        TextView tvGenre = findViewById(R.id.detailGenre);
        TextView tvSkor = findViewById(R.id.detailSkor);
        TextView tvSinopsisText = findViewById(R.id.sinopsis);
        TextView tvSinopsis = findViewById(R.id.detailSinopsis);

        Anime anime;
        if (Build.VERSION.SDK_INT >= 33){
            anime = getIntent().getParcelableExtra(KEY_DATA, Anime.class);
        } else {
            anime = getIntent().getParcelableExtra(KEY_DATA);
        }

        String sourceImage = anime.getImg();
        int sourceImageID = getResources().getIdentifier(sourceImage, "drawable", getPackageName());
        tvImage.setImageResource(sourceImageID);

        String detail = anime.getDetil();
        String nama = anime.getName();
        String genre = anime.getGenree();
        String skor = anime.getScore();
        String sinopsisText = anime.getSynopsisText();
        String sinopsis = anime.getSynopsis();

        tvDetail.setText(detail);
        tvNama.setText(nama);
        tvGenre.setText(genre);
        tvSkor.setText(skor);
        tvSinopsisText.setText(sinopsisText);
        tvSinopsis.setText(sinopsis);

        // Tombol Share
        Button btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareContent(detail);  // Ganti dengan data yang ingin Anda bagikan
            }
        });
    }

    private void shareContent(String content) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, content);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}
