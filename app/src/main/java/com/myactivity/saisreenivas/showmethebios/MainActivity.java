package com.myactivity.saisreenivas.showmethebios;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private String modiBio ="Narendra Damodardas Modi , born 17 September 1950) is an Indian politician who is the 14th " +
            "and current Prime Minister of India, in office since 26 May 2014. Modi, a leader of the Bharatiya Janata " +
            "Party (BJP), was the Chief Minister of Gujarat from 2001 to 2014, and is the Member of Parliament from Varanasi.";
    private String obamaBio ="Barack Hussein Obama II born August 4, 1961) is an American politician and the 44th and " +
            "current President of the United States. He is the first African American to be elected to that office  " +
            "and the first president born outside the contiguous United States. Born in Honolulu, Hawaii, Obama is a " +
            "graduate of Columbia University and Harvard Law School, where he was president of the Harvard Law Review. " +
            "He was a community organizer in Chicago before earning his law degree.";
    private ImageView modiImage;
    private ImageView obamaImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modiImage = (ImageView) findViewById(R.id.modiImage);
        obamaImage = (ImageView) findViewById(R.id.obamaImage);

        modiImage.setOnClickListener(this);
        obamaImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.modiImage:
                Intent modiIntent = new Intent(getApplicationContext(), BioDetails.class);
                modiIntent.putExtra("modi",modiBio);
                modiIntent.putExtra("name", "modi");
                startActivity(modiIntent);

                break;
            case R.id.obamaImage:
                Intent obamaIntent = new Intent(getApplicationContext(), BioDetails.class);
                obamaIntent.putExtra("obama",obamaBio);
                obamaIntent.putExtra("name", "obama");
                startActivity(obamaIntent);

                break;
        }
    }
}
