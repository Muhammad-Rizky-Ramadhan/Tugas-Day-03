package com.example.intenttaskk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RomanceActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);

        LinearLayout linearKaguya = findViewById(R.id.layoutKaguya);
        LinearLayout linearYamada = findViewById(R.id.layoutYamada);
        LinearLayout linearApril = findViewById(R.id.layoutApril);
        LinearLayout linearPancreas = findViewById(R.id.layoutPancreas);
        LinearLayout linearHori = findViewById(R.id.layoutHori);

        linearKaguya.setOnClickListener(this);
        linearYamada.setOnClickListener(this);
        linearApril.setOnClickListener(this);
        linearPancreas.setOnClickListener(this);
        linearHori.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.layoutKaguya){
            Anime romance1 = new Anime();
            romance1.setImg("whatsapp_image_2024_03_09_at_03_23_31");
            romance1.setName("Kaguya-sama wa Kokurasetai: Ultra Romantic");
            romance1.setGenree("Comedy, Psychological, Romance, School, Seinen");
            romance1.setScore("skor: 9.02");
            romance1.setSynopsis("Menceritakan tentang 2 orang yang saling jatuh mencintai antara Kaguya " +
                    "Shinomiya dengan Miyuki Shirogane. Namun bagi mereka berdua, pernyataan cinta adalah perang." +
                    " Mereka berdua adalah orang jenius yang menjadi anggota OSIS di sekolah elit dengan reputasi" +
                    " tinggi yaitu Akademi Shuchiin. Miyuki menjabat sebagai ketua OSIS dan kaguya sebagai wakilnya." +
                    " Bagi murid lain, mereka adalah pasangan yang benar-benar serasi. Mereka telah lama bersama dan " +
                    "memiliki perasaan satu sama lain. Namun, karena gengsi yang tinggi, tak ada satupun dari mereka" +
                    " yang mengungkapkan cintanya. Menurut mereka, jika menyatakan perasaan duluan adalah tanda kelemahan" +
                    " dan kekalahan. Oleh karena itu, mereka berusaha untuk membuat lawannya menyatakan perasaan cintanya. " +
                    "Mereka berdua akan melakukan apapun untuk membuat lawannya menyatakan pereasaan cintanya. Mereka berdua " +
                    "melakukan apapun untuk mendapat pengakuan. Dimulaiah keseharian mereka dalam perang cinta menggunakan " +
                    "akal, teori, perhitungan, hingga pikiran mereka.");

            Intent intent = new Intent(RomanceActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, romance1);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutYamada){
            Anime romance2 = new Anime();
            romance2.setImg("whatsapp_image_2024_03_10_at_02_10_47");
            romance2.setName("Boku no Kokoro Yabai Yatsu");
            romance2.setGenree("Comedy, Romance, School, Seinen");
            romance2.setScore("skor: 8.24");
            romance2.setSynopsis("Kyoutaro Ichikawa mungkin terlihat seperti siswa sekolah menengah pada umumnya," +
                    " tetapi di dalam hatinya, dia memimpikan pembunuhan. Jadi, tidak mengherankan jika orang" +
                    " yang paling ingin dia bunuh tidak pernah jauh dari pikirannya: idola kelas, Anna Yamada. " +
                    "Membaca sendirian di perpustakaan sekolah kesayangannya, dia secara tidak sengaja mulai " +
                    "bertemu dengan Yamada, yang diam-diam datang untuk menikmati permen dan manisan" +
                    " kesayangannya. Melalui interaksi mereka, Ichikawa menemukan betapa ditz Yamada, dan" +
                    " tidak bisa tidak mendukungnya dari pinggir lapangan. Sementara itu, Yamada sendiri tak" +
                    " henti-hentinya menggoda Ichikawa karena reaksi bingungnya. Dengan serangkaian" +
                    " interaksi sehari-hari yang mengharukan, ikatan jarak jauh antara keduanya tumbuh" +
                    " menjadi sesuatu yang lebih dari sekadar kenalan perpustakaan. Mungkin, seiring " +
                    "berjalannya waktu, Ichikawa akan menyadari bahwa keinginan membunuhnya telah berubah" +
                    " menjadi sesuatu yang sama sekali berbeda.");

            Intent intent = new Intent(RomanceActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, romance2);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutApril){
            Anime romance3 = new Anime();
            romance3.setImg("whatsapp_image_2024_03_10_at_02_54_06");
            romance3.setName("Shigatsu wa Kimi no Uso");
            romance3.setGenree("Drama, Music, Romance, School, Shounen");
            romance3.setScore("skor: 8.64");
            romance3.setSynopsis("Musik mengiringi jalan metronom manusia, pianis luar biasa Kousei Arima." +
                    " Tapi setelah kematian ibunya, Saki Arima, Kousei jatuh ke bawah, membuatnya tidak bisa" +
                    " mendengar suara pianonya sendiri. Dua tahun kemudian, Kousei masih menghindari piano," +
                    " meninggalkan pengagum dan saingannya, dan menjalani kehidupan tanpa warna bersama" +
                    " teman-temannya Tsubaki Sawabe dan Ryouta Watari. Namun, semuanya berubah saat ia" +
                    " bertemu dengan seorang pemain biola cantik, Kaori Miyazono, yang menggetarkan dunianya " +
                    "dan membawanya dalam perjalanan menghadapi musik lagi. Berdasarkan serial manga dengan" +
                    " judul yang sama, Shigatsu wa Kimi no Uso mendekati kisah pemulihan Kousei saat ia" +
                    " menemukan bahwa musik lebih dari sekadar memainkan setiap nada dengan sempurna, dan" +
                    " satu melodi dapat membawa udara segar musim semi di bulan April.");

            Intent intent = new Intent(RomanceActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, romance3);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutPancreas){
            Anime romance4 = new Anime();
            romance4.setImg("whatsapp_image_2024_03_10_at_02_57_17");
            romance4.setName("Kimi no Suizo wo Tabetai");
            romance4.setGenree("Drama,Romance, School");
            romance4.setScore("skor: 8.55");
            romance4.setSynopsis("Si protagonis yang menyendiri: seorang kutu buku yang sangat terpisah" +
                    " dari dunia tempat dia tinggal. Dia tidak tertarik pada orang lain dan sangat yakin " +
                    "bahwa tidak ada yang tertarik padanya. Kisahnya dimulai ketika dia menemukan buku" +
                    " tulisan tangan, berjudul “Living with Dying.” Dia segera mengidentifikasinya sebagai" +
                    " buku harian rahasia milik teman sekelasnya, Sakura Yamauchi. Dia kemudian" +
                    " menceritakan kepadanya tentang penyakit pankreas yang dideritanya dan waktu" +
                    " yang tersisa terbatas. Hanya keluarganya yang tahu tentang penyakit terminalnya;" +
                    " bahkan sahabatnya pun tidak sadar. Terlepas dari wahyu ini, ia tidak menunjukkan" +
                    " simpati untuk keadaan buruknya, tetapi terperangkap dalam gelombang daya apung" +
                    " Sakura yang terus-menerus, ia akhirnya mengakui untuk menemaninya selama beberapa" +
                    " hari yang tersisa. Ketika pasangan lawan kutub berinteraksi, koneksi mereka menguat," +
                    " menjalin melalui pilihan mereka yang dibuat setiap hari. Sikap acuh tak acuh dan" +
                    " tidak dapat diprediksinya mengganggu aliran kehidupan protagonis yang tanpa perasaan" +
                    ", secara bertahap membuka hatinya ketika ia menemukan dan merangkul makna hidup yang" +
                    " sebenarnya.");

            Intent intent = new Intent(RomanceActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, romance4);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutHori){
            Anime romance5 = new Anime();
            romance5.setImg("whatsapp_image_2024_03_10_at_02_59_18");
            romance5.setName("Horimiya");
            romance5.setGenree("Comedy,Romance, School, Shounen, Slice of Life");
            romance5.setScore("skor: 8.20");
            romance5.setSynopsis("Meskipun dikagumi di sekolah karena keramahan dan kehebatan akademisnya, " +
                    "siswa SMA Kyouko Hori telah menyembunyikan sisi lain dari dirinya. Karena orang tuanya" +
                    " sering pergi dari rumah karena pekerjaan, Hori harus menjaga adik laki-lakinya dan" +
                    " melakukan pekerjaan rumah, tidak menyisakan kesempatan untuk bersosialisasi" +
                    " jauh dari sekolah. Sementara itu, Izumi Miyamura terlihat sebagai otaku yang" +
                    " merenung dan berkacamata. Namun, pada kenyataannya, dia adalah orang yang lembut" +
                    " dan tidak cakap dalam belajar. Selain itu, ia memiliki sembilan tindikan tersembunyi" +
                    " di balik rambut panjangnya dan tato di punggung dan bahu kirinya. Secara kebetulan," +
                    " Hori dan Miyamura berpapasan di luar sekolah — tidak ada yang terlihat seperti yang" +
                    " diharapkan yang lain. Pertentangan yang tampaknya kutub ini menjadi teman, saling" +
                    " berbagi sisi yang belum pernah mereka tunjukkan kepada orang lain.");

            Intent intent = new Intent(RomanceActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, romance5);
            startActivity(intent);
        }
    }
}