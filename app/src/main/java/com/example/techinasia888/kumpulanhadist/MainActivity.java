package com.example.techinasia888.kumpulanhadist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.techinasia888.kumpulanhadist.adapter.DoaAdapter;
import com.example.techinasia888.kumpulanhadist.model.Doa;

import java.util.ArrayList;

/**
 * Created by techinasia888 on 10/1/18.
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DoaAdapter adapter;
    private ArrayList<Doa> doaArrayList;

    @Override
    protected void onCreate(Bundle savenIntanceState) {
        super.onCreate(savenIntanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycledoa);

        adapter = new DoaAdapter(doaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        doaArrayList = new ArrayList<>();
        doaArrayList.add(new Doa("Doa Sebelum Makan", "الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ", "Yaa Allah, berkatilah rezeki yang engkau berikan kepada kami, dan peliharalah kami dari siksa api neraka",0));
        doaArrayList.add(new Doa("Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِيْنَ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِيْنَِ", "Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam",0));
        doaArrayList.add(new Doa("Doa Sebelum Tidur", "بِاسْمِكَ اللّهُمَّ أَحْيَاوَأَمُوتُ", "Dengan nama-Mu ya Allah aku hidup dan mati", 0));
        doaArrayList.add(new Doa("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِى أَحْيَانَا بَعْدَمَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ", "Segala puji bagi Allah yang menghidupkan aku kembali setelah mematikan aku dan kepada Allah akan bangkit", 0));
        doaArrayList.add(new Doa("Doa Bepergian", "اَللّهُمَّ إِنَّانَسْأَلُكَ فِيْ سَفَرِنَا هَذَاالْبِرَّوَالتَّقْوَى، وَمِنَ الْعَمَلِ مَاتُحِبُّ وَتَرْضَى،/n" +
                " اَللّهُمَّ هَوِّنْ عَلَيْنَا سَفَرَنَا، وَاطْوِعَنَّابُعْدَهُ. اَللّهُمََّ أَنْتَ الصَّاحِبُ فِيْ السَّفَرِوَالْخَلِيْفَةُ فِيْ الأَهْلِ وَالْمَالِ./n" +
                " اَللّهُمَّ إِنَّانَعُوْذُبِكَ مِنْ وَعْثَاءِالسَّفَرِوَكَآبَةِالْمُنْقَلَبِ وَسُوْءِالْمَنْظَرِفِيْ الأهْلِ وَالْمَالِ وَالْوَلَ", "Ya Allah! Sesungguhnya kami memohon kebaikan dan taqwa dalam bepergian ini, kami mohon perbuatan yang Engkau sukai dan Engkau ridhoi. Ya Allah! Permudahlah perjalanan kami ini, dan dekatkan jaraknya bagi kami. Ya Allah! Engkaulah teman dalam bepergian dan yang mengurusi keluarga dan harta (ku). Ya Allah! Sesungguhnya aku berlindung kepada-Mu dari kelelahan dalam bepergian, tempat kembali yang menyedihkan dan pemandangan yang jelek dalam keluarga, harta dan anak", 0));
        doaArrayList.add(new Doa("Doa Masuk Masjid", "اللَّهُمَّ رَبَّ هَذِهِ الدَّعْوَةِ التَّامّةِ وَالصَّلاَةِ الْقَائِمَةِ آتِ مُحَمَّدًا الْوَسِيْلَةَ وَالْفَضِيْلَةِ وَابْعَثْهُ مَقَامًا مَّحْمُوْدًا الَّذِيْ وَعَدْتَهُ, إِنَّكَ لاَتُخْلِفُ الْمِيْعَادِ", "a Allah, penguasa panggilan yang sempurna dan shalat yang didirikan, berikanlah kepada Muhammad washilah dan keistimewaan dan tempatkanlah di tempat yang mulia yang telah Engkau janjikan. Sesungguhnya Engkau tidak (pernah) menyalahi janji", 0));
        doaArrayList.add(new Doa("Doa Setelah Wudhu", "أَشْهَدُ اَنْ لاَإِلَهَ اِلاَّ اللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَأَشْهَدُ اَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُوْلُهُ", "Aku bersaksi bahwa tidak ada Tuhan selain Allah Yang Esa, tiada sekutu baginya dan aku bersaksi bahwa Muhammad adalah hamba dan Rasul-Nya", 0 ));
    }



    }



