package in.a1096.prakashprajapati.android.govinda_special;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView llvv;
    MediaPlayer mp;
    ArrayAdapter<String> myadaptersong;
    ArrayAdapter<String> myadaptersearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            mp = new MediaPlayer();

            final String[] music={
                    "akhiyon_se_goli_mare",
                    "bade_miyan_chote_miyan",
                    "deta_jai_jo_re_part_1",
                    "dil_jaane_jigar",
                    "ek_Aur_ek_Gyarah",
                    "hasina_maan_jayegi",
                    "hush_hai_suhana",
                    "i_love_you_bol_dal",
                    "it_is_only_happens",
                    "chal_joothi",
                    "kem_chhe",
                    "tumba",
                    "o_priya",
                    "jaisi_karni_waisi_bharni",
                    "kisi_disko_me_jaye",
                    "le_le_chumma",
                    "main_tumko_bhga_laya",
                    "main_paidal_se_jaa",
                    "makhna",
                    "ek_aur_ek_gyarah",
                    "mohabbatk_nahi",
                    "sarkai_lo_khatiya",
                    "saton_janam_tum",
                    "sona_kitna_sona_hai",
                    "tumhi_se_tumhi_ko",
                    "tumsa_koi_pyaara",
                    "tum_humpe_marte",
                    "upwala_thumka",
                    "what_is_mobile_no",
                    "who_aakh_hi_kya"
            };
            final int[] musicID={
                    R.raw.akhiyon_se_goli_mare,
                    R.raw.bade_miyan_chote_miyan,
                    R.raw.hasina_maan__jayegi,
                    R.raw.deta_jai_jo_re_part_1,
                    R.raw.dil_jaane_jigar,
                    R.raw.who_aakh_hi_kya,
                    R.raw.what_is_mobile_no,
                    R.raw.upwala_thumka,
                    R.raw.tum_humpe_marte,
                    R.raw.tumsa_koi_pyaara,
                    R.raw.sona_kitna_sona_hai,
                    R.raw.saton_janam_tum,
                    R.raw.sarkai_lo_khatiya,
                    R.raw.mohabbatk_nahi,
                    R.raw.makhna,
                    R.raw.tumba,
                    R.raw.o_priya,
                    R.raw.main_paidal_se_jaa,
                    R.raw.main_tumko_bhga_laya,
                    R.raw.le_le_chumma,
                    R.raw.kisi_disko_me_jaye,
                    R.raw.kem_chhe,
                    R.raw.chal_joothi,
                    R.raw.it_is_only_happens,
                    R.raw.i_love_you_bol_dal,
                    R.raw.hush_hai_suhana,
                    R.raw.tumhi_se_tumhi_ko,
                    R.raw.ek_aur_ek_gyarah,
                    R.raw.jaisi_karni_waisi_bharni,
            };



        llvv=(ListView) findViewById(R.id.lv);
            myadaptersong = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,
                    music);
              llvv.setAdapter(myadaptersong);
            llvv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
                mp.reset();
                mp = MediaPlayer.create(MainActivity.this, musicID[position]);
                mp.start();
            }
            });
        SearchView searchView =(SearchView)findViewById(R.id.sv);
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {

                    llvv.setAdapter(null);

                    String[] final_songs={"Aur","iT"};

                    myadaptersearch=new ArrayAdapter<String>(
                            MainActivity.this,
                            android.R.layout.simple_list_item_1,
                            final_songs
                    );
                    llvv.setAdapter(myadaptersearch);
                    return false;
                }
                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }
            });
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            mp.release();
        }

}




















