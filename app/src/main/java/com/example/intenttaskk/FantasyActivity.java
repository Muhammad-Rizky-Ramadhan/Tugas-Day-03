package com.example.intenttaskk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FantasyActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantasy);

        LinearLayout linearFrieren = findViewById(R.id.layoutFrieren);
        LinearLayout linearTanjirou = findViewById(R.id.layoutTanjirou);
        LinearLayout linearGojo = findViewById(R.id.layoutGojo);
        LinearLayout linearSuzume = findViewById(R.id.layoutSuzume);
        LinearLayout linearAsta = findViewById(R.id.layoutAsta);

        linearFrieren.setOnClickListener(this);
        linearTanjirou.setOnClickListener(this);
        linearGojo.setOnClickListener(this);
        linearSuzume.setOnClickListener(this);
        linearAsta.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.layoutFrieren){
            Anime fantasy1 = new Anime();
            fantasy1.setImg("whatsapp_image_2024_03_10_at_05_43_51");
            fantasy1.setName("Sousou no Frieren");
            fantasy1.setGenree("Adventure, Drama, Fantasy");
            fantasy1.setScore("skor: 9.16");
            fantasy1.setSynopsis("Raja iblis telah dikalahkan, dan kelompok pahlawan yang menang kembali ke rumah sebelum bubar." +
                    " Keempatnya—penyihir Frieren, pahlawan Himmel, pendeta Heiter, dan prajurit Eisen—mengenang perjalanan mereka" +
                    " selama satu dekade saat momen untuk saling mengucapkan selamat tinggal tiba. Namun berlalunya waktu berbeda" +
                    " bagi para elf, sehingga Frieren menyaksikan teman-temannya perlahan meninggal satu per satu. Sebelum kematiannya, " +
                    "Heiter berhasil memasukkan manusia magang muda bernama Fern ke Frieren. Didorong oleh hasrat elf untuk mengumpulkan" +
                    " segudang mantra sihir, pasangan ini memulai perjalanan yang tampaknya tanpa tujuan, mengunjungi kembali tempat-tempat " +
                    "yang pernah dikunjungi para pahlawan dahulu kala. Sepanjang perjalanan mereka, Frieren perlahan-lahan menghadapi " +
                    "penyesalannya atas hilangnya kesempatan untuk menjalin ikatan yang lebih dalam dengan rekan-rekannya yang kini sudah" +
                    " meninggal.");

            Intent intent = new Intent(FantasyActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, fantasy1);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutTanjirou){
            Anime fantasy2 = new Anime();
            fantasy2.setImg("whatsapp_image_2024_03_10_at_05_46_26");
            fantasy2.setName("Kimetsu no Yaiba");
            fantasy2.setGenree("Action, Demon, Historical, Fantasy, Shounen, Supernatural");
            fantasy2.setScore("skor: 8.48");
            fantasy2.setSynopsis("Sejak kematian ayahnya, beban mendukung keluarga telah jatuh di pundak Tanjirou Kamado. " +
                    "Meskipun hidup miskin di gunung terpencil, keluarga Kamado dapat menikmati kehidupan yang relatif damai dan" +
                    " bahagia. Suatu hari, Tanjirou memutuskan untuk pergi ke desa setempat untuk menghasilkan sedikit uang dengan" +
                    " menjual arang. Dalam perjalanannya kembali, malam tiba, memaksa Tanjirou untuk berlindung di rumah seorang " +
                    "pria aneh, yang memperingatkannya tentang keberadaan setan pemakan daging yang mengintai di hutan pada malam" +
                    " hari. Ketika dia akhirnya tiba kembali ke rumah pada hari berikutnya, dia bertemu dengan pemandangan yang" +
                    " mengerikan — seluruh keluarganya telah dibantai. Lebih buruk lagi, satu-satunya yang selamat adalah saudaranya" +
                    " Nezuko, yang telah berubah menjadi iblis yang haus darah. Dikonsumsi oleh kemarahan dan kebencian, " +
                    "Tanjirou bersumpah untuk membalaskan dendam keluarganya dan tinggal dengan saudara kandungnya yang tersisa. " +
                    "Di samping kelompok misterius yang menyebut diri mereka Korps Pembunuh Setan, Tanjirou akan melakukan apa " +
                    "pun untuk membunuh iblis dan melindungi sisa-sisa kemanusiaan saudara perempuannya yang tercinta.");

            Intent intent = new Intent(FantasyActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, fantasy2);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutGojo){
            Anime fantasy3 = new Anime();
            fantasy3.setImg("whatsapp_image_2024_03_10_at_05_48_20");
            fantasy3.setName("Jujutsu Kaisen");
            fantasy3.setGenree("Action, Demon, Horror, Fantasy, School, Shounen, Supernatural");
            fantasy3.setScore("skor: 8.61");
            fantasy3.setSynopsis("Di dunia di mana setan memakan manusia yang tidak menaruh curiga, fragmen dari iblis legendaris " +
                    "dan ditakuti Ryoumen Sukuna hilang dan berserakan. Jika ada iblis yang memakan bagian tubuh Sukuna, kekuatan " +
                    "yang mereka peroleh dapat menghancurkan dunia seperti yang kita ketahui. Untungnya, ada sekolah misterius" +
                    " Jujutsu Sorcerers yang ada untuk melindungi keberadaan genting dari makhluk hidup dari undead! Yuuji Itadori" +
                    " adalah siswa sekolah menengah yang menghabiskan hari-harinya mengunjungi kakeknya yang terbaring di tempat tidur." +
                    " Meskipun dia terlihat seperti remaja pada umumnya, kekuatan fisiknya yang luar biasa adalah sesuatu yang patut " +
                    "dilihat! Setiap klub olahraga ingin dia bergabung, tapi Itadori lebih suka bergaul dengan orang-orang buangan sekolah " +
                    "di Klub Ilmu Gaib. Suatu hari, klub berhasil mendapatkan benda terkutuk yang disegel, tetapi sedikit yang mereka tahu" +
                    " teror yang akan mereka lepaskan ketika mereka membuka segel …");

            Intent intent = new Intent(FantasyActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, fantasy3);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutSuzume){
            Anime fantasy4 = new Anime();
            fantasy4.setImg("whatsapp_image_2024_03_10_at_05_49_41");
            fantasy4.setName("Suzume no Tojimari");
            fantasy4.setGenree("Adventure, Fantasy");
            fantasy4.setScore("skor: 8.32");
            fantasy4.setSynopsis("Dalam perjalanannya ke sekolah suatu hari, Suzume Iwato menemukan Souta Munakata, " +
                    "seorang pemuda yang mencari daerah terlantar. Gadis sekolah menengah itu mengarahkan Souta ke reruntuhan terdekat," +
                    " tetapi karena penasaran murni, dia sendiri memutuskan untuk pergi ke tujuan yang sama. Sesampai di sana, " +
                    "Suzume menemukan sebuah pintu terisolasi dengan alam semesta seperti mimpi yang terletak di luarnya — tempat" +
                    " yang bisa dia lihat dan rasakan, tetapi tidak bisa dimasuki. Sebuah batu aneh tergeletak di tanah di dekatnya," +
                    " tapi berubah menjadi makhluk seperti kucing dan kabur saat Suzume mengangkatnya. Tiba-tiba ketakutan, dia kembali" +
                    " ke sekolahnya, tidak menyadari bahwa tindakannya membiarkan pintu terbuka akan memiliki konsekuensi. " +
                    "Dengan dirilisnya “batu kunci”, kejahatan di alam semesta lain sekarang dapat dengan bebas melarikan diri " +
                    "dan menimbulkan kekacauan di seluruh Jepang. Bermaksud untuk memperbaiki kesalahannya yang berbahaya, Suzume" +
                    " bergabung dengan Souta — yang tujuan sebenarnya adalah mencegah kejahatan membusuk — dalam menemukan dan " +
                    "mengunci semua pintu yang terbuka sebelum negara dihancurkan");

            Intent intent = new Intent(FantasyActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, fantasy4);
            startActivity(intent);
        }
        if (v.getId() == R.id.layoutAsta) {
            Anime fantasy5 = new Anime();
            fantasy5.setImg("whatsapp_image_2024_03_10_at_05_51_10");
            fantasy5.setName("Black Clover");
            fantasy5.setGenree("Action, Comedy, Fantasy, Magic");
            fantasy5.setScore("skor: 8.14");
            fantasy5.setSynopsis("Asta dan Yuno ditinggalkan di gereja yang sama pada hari yang sama. Dibesarkan bersama sebagai anak-anak, " +
                    "mereka mengetahui “Raja Penyihir” —judul yang diberikan kepada penyihir terkuat di kerajaan — dan berjanji bahwa mereka" +
                    " akan bersaing satu sama lain untuk mendapatkan posisi Raja Penyihir berikutnya. Namun, ketika mereka tumbuh dewasa, " +
                    "perbedaan mencolok di antara mereka menjadi jelas. Sementara Yuno mampu menggunakan sihir dengan kekuatan dan kontrol" +
                    " yang luar biasa, Asta tidak bisa menggunakan sihir sama sekali dan berusaha keras untuk membangkitkan kekuatannya" +
                    " dengan melatih fisik. Ketika mereka mencapai usia 15, Yuno dianugerahi Grimoire spektakuler dengan semanggi berdaun" +
                    " empat, sementara Asta tidak menerima apa-apa. Namun, segera setelah itu, Yuno diserang oleh seseorang bernama Lebuty," +
                    " yang tujuan utamanya adalah untuk mendapatkan Grimoire Yuno. Asta mencoba untuk melawan Lebuty, tetapi dia kalah" +
                    ". Meskipun tanpa harapan dan di ambang kekalahan, dia menemukan kekuatan untuk melanjutkan ketika dia mendengar " +
                    "suara Yuno. Melepaskan emosi batinnya dalam kemarahan, Asta menerima Grimoire lima daun semanggi, “Semanggi Hitam”" +
                    " memberinya kekuatan yang cukup untuk mengalahkan Lebuty. Beberapa hari kemudian, kedua sahabat itu pergi ke dunia, " +
                    "keduanya mencari tujuan yang sama — untuk menjadi Raja Penyihir");

            Intent intent = new Intent(FantasyActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, fantasy5);
            startActivity(intent);
        }
    }
}