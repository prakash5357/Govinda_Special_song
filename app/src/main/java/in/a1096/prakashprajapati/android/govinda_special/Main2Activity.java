package in.a1096.prakashprajapati.android.govinda_special;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Thread myThread = new Thread(){


            @Override
            public void run() {
                try
                {
                    sleep(1500);
                    Intent i=new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
                catch(InterruptedException p){
                    p.printStackTrace();
                }

            }
        };
        myThread.start();









    }
}
