package com.example.intenttaskk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class IsekaiActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isekai);

        LinearLayout linearShadow = findViewById(R.id.layoutShadow);
        LinearLayout linearSlime = findViewById(R.id.layoutSlime);
        LinearLayout linearKazuma = findViewById(R.id.layoutKazuma);
        LinearLayout linearGame = findViewById(R.id.layoutGame);
        LinearLayout linearRudeus = findViewById(R.id.layoutRudeus);

        linearShadow.setOnClickListener(this);
        linearSlime.setOnClickListener(this);
        linearKazuma.setOnClickListener(this);
        linearGame.setOnClickListener(this);
        linearRudeus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.layoutShadow) {
            Anime isekai1 = new Anime();
            isekai1.setImg("whatsapp_image_2024_03_10_at_09_44_30");
            isekai1.setName("Kage no Jitsuryokusha ni Naritakute");
            isekai1.setGenree("Adventure, Comedy, Fantasy, Isekai");
            isekai1.setScore("skor: 8.30");
            isekai1.setSynopsis("Pahlawan hebat dan penjahat jahat adalah tipe karakter yang diinginkan " +
                    "orang—tetapi bukan Cid Kagenou. Dia ingin menjadi dalang sebenarnya di balik semua itu, " +
                    "menarik tali, dan intriknya mendorong keseluruhan cerita. Dalam kehidupan sebelumnya " +
                    "di Jepang modern, ia tidak dapat mencapai tujuannya. Tapi sekarang, terlahir kembali " +
                    "ke dunia sihir, dia akan menunjukkan keunggulan sejati dari bayangan! Saat Cid " +
                    "berpura-pura menjadi karakter mafia biasa, ia merekrut anggota ke organisasi " +
                    "Shadow Garden (palsu), yang bertujuan untuk menjatuhkan kultus misterius yang " +
                    "bersembunyi di bayang-bayang. Dengan banyak ad-libs, Cid memimpin organisasinya " +
                    "(palsu) melawan Diabolos Cult yang busuk (namun mengejutkan nyata).");

            Intent intent = new Intent(IsekaiActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, isekai1);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutSlime) {
            Anime isekai2 = new Anime();
            isekai2.setImg("whatsapp_image_2024_03_10_at_09_48_04");
            isekai2.setName("Tensei Shittara Slime Datta Ken");
            isekai2.setGenree("Adventure, Comedy, Fantasy, Isekai");
            isekai2.setScore("skor: 8.14");
            isekai2.setSynopsis("Satoru Mikami merupakan seorang karyawan biasa berumur 37 tahun yang masih perjaka. Ia tewas ketika" +
                    " melindungi juniornya dari seorang penyerang tak dikenal. Lahir kembali di dunia penuh fantasi, dia bereinkarnasi " +
                    "menjadi sesosok monster slime dengan kekuatan super karena keinginan terakhirnya. Hidup sendiri di sebuah gua yang" +
                    " penuh dengan monster, dia kemudian bertemu dengan Veldora, seekor naga badai yang terkurung selama 300 tahun karena" +
                    " telah menghancurkan sebuah kota menjadi abu. Karena Satoru bersimpati kepada Veldora atas kesulitan yang telah dialaminya, " +
                    "Satoru kemudian berteman dengannya dan berjanji untuk membantu melepaskan segel kurungan tersebut. Sebagai imbalannya," +
                    " Veldora memberikan Satoru sebuah nama, yaitu Rimuru, dan Rimuru juga memberikan nama tersumpah untuk dirinya sendiri" +
                    " dan Veldora, yaitu Tempest. Setelah itu, Rimuru memulai perjalanan baru di dunia fantasi yang secara bertahap mengubah" +
                    " hidup dan nasibnya. Dalam perjalanannya, ia mendirikan sebuah negara untuk para monster bernama Federasi Jura Tempest.");

            Intent intent = new Intent(IsekaiActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, isekai2);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutKazuma) {
            Anime isekai3 = new Anime();
            isekai3.setImg("whatsapp_image_2024_03_10_at_09_46_45");
            isekai3.setName("Kono Subarashi Sekai ni Shukufuku wo!");
            isekai3.setGenree("Adventure, Comedy, Fantasy, Isekai, Magic, Parody, Supernatural");
            isekai3.setScore("skor: 8.10");
            isekai3.setSynopsis("Setelah sekarat kematian yang menggelikan dan menyedihkan dalam perjalanan kembali dari membeli permainan, " +
                    "siswa sekolah menengah dan pertapa Kazuma Satou menemukan dirinya duduk di hadapan dewi cantik yang menjengkelkan bernama" +
                    " Aqua. Dia memberi NEET dua pilihan: melanjutkan ke surga atau bereinkarnasi dalam mimpi setiap gamer — dunia fantasi nyata!" +
                    " Memilih untuk memulai hidup baru, Kazuma dengan cepat ditugaskan untuk mengalahkan Raja Iblis yang meneror desa. " +
                    "Tetapi sebelum dia pergi, dia dapat memilih satu item dalam bentuk apa pun untuk membantunya dalam pencariannya, dan" +
                    " pahlawan masa depan memilih Aqua. Tapi Kazuma telah membuat kesalahan besar — Aqua sama sekali tidak berguna! Sayangnya, " +
                    "masalah mereka tidak berakhir di sini; ternyata hidup di dunia seperti itu jauh berbeda dari apa yang dimainkannya dalam" +
                    " permainan. Alih-alih melakukan petualangan yang mendebarkan, keduanya harus bekerja lebih dulu untuk membayar biaya hidup " +
                    "mereka. Memang, kemalangan mereka baru saja dimulai!");

            Intent intent = new Intent(IsekaiActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, isekai3);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutGame) {
            Anime isekai4 = new Anime();
            isekai4.setImg("whatsapp_image_2024_03_10_at_09_50_28");
            isekai4.setName("No Game No Life");
            isekai4.setGenree("Adventure, Comedy, Fantasy, Isekai, Game, Supernatural");
            isekai4.setScore("skor: 8.07");
            isekai4.setSynopsis("No Game No Life adalah komedi surealis yang mengikuti Sora dan Shiro, saudara kandung NEET yang tertutup " +
                    "dan duo gamer online di belakang nama pengguna legendaris “Blank.” Mereka memandang dunia nyata hanya sebagai permainan " +
                    "buruk lainnya; namun, e-mail aneh yang menantang mereka untuk pertandingan catur mengubah segalanya — saudara dan saudari" +
                    " lelaki itu terjerumus ke dunia lain di mana mereka bertemu Tet, Dewa Game. Dewa misterius menyambut Sora dan Shiro ke " +
                    "Disboard, sebuah dunia di mana semua bentuk konflik — dari pertengkaran kecil hingga nasib seluruh negara — diselesaikan" +
                    " bukan melalui perang, tetapi melalui permainan-permainan besar. Sistem ini bekerja berkat aturan mendasar di mana " +
                    "masing-masing pihak harus bertaruh sesuatu yang mereka anggap memiliki nilai yang sama dengan taruhan pihak lain. " +
                    "Di negeri yang aneh ini di mana gagasan kemanusiaan direduksi menjadi permainan anak-anak, duo gamer jenius yang acuh " +
                    "tak acuh dari Sora dan Shiro akhirnya menemukan alasan nyata untuk terus bermain game: untuk menyatukan enam belas" +
                    " ras Disboard, mengalahkan Tet, dan menjadi yang terbaik. para dewa dunia game-is-everything baru ini.");

            Intent intent = new Intent(IsekaiActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, isekai4);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutRudeus) {
            Anime isekai5 = new Anime();
            isekai5.setImg("whatsapp_image_2024_03_10_at_09_52_03");
            isekai5.setName("Mushoku Tensei Isekai Ittara Honki Desu");
            isekai5.setGenree("Drama, Fantasy, Isekai, Magic");
            isekai5.setScore("skor: 8.37");
            isekai5.setSynopsis("Tewas saat menyelamatkan orang asing dari tabrakan lalu lintas, NEET berusia 34 tahun bereinkarnasi" +
                    " ke dunia sihir sebagai Rudeus Greyrat, bayi yang baru lahir. Dengan pengetahuan, pengalaman, dan penyesalan dari" +
                    " kehidupan sebelumnya yang dipertahankan, Rudeus bersumpah untuk menjalani hidup yang memuaskan dan tidak mengulangi " +
                    "kesalahan masa lalunya. Sekarang diberkahi dengan kekuatan magis yang luar biasa serta pikiran orang dewasa yang sudah " +
                    "dewasa, Rudeus dipandang sebagai jenius dalam pembuatan oleh orang tua barunya. Segera, dia mendapati dirinya belajar di" +
                    " bawah para pejuang yang kuat, seperti ayah pendekar pedang dan seorang penyihir bernama Roxy Migurdia — semuanya untuk " +
                    "mengasah bakatnya yang tampak. Tapi meski eksteriornya polos, Rudeus tetaplah seorang otaku mesum, yang menggunakan kekayaan " +
                    "pengetahuannya untuk membuat gerakan pada wanita yang tidak pernah bisa dia buat di kehidupan sebelumnya.");

            Intent intent = new Intent(IsekaiActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, isekai5);
            startActivity(intent);
        }
    }
}