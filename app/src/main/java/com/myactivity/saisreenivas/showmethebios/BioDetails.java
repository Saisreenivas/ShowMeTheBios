package com.myactivity.saisreenivas.showmethebios;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioDetails extends Activity {
    private ImageView detailsImage;
    private TextView name;
    private TextView details;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_details);

        name = (TextView) findViewById(R.id.mName);
        detailsImage = (ImageView) findViewById(R.id.imageView);
        details = (TextView) findViewById(R.id.details);
        extras = getIntent().getExtras();

        if(extras != null){
            String extra = extras.getString("name");
            showBios(extra);
        }
    }

    public void showBios(String extra){
        if (extra.equals("modi")){
            name.setText(extra);
            details.setText(extras.getString("modi"));
            detailsImage.setImageDrawable(getResources().getDrawable(R.drawable.modi_profile));
        }else if(extra.equals("obama")){
            name.setText(extra);
            details.setText(extras.getString("obama"));
            detailsImage.setImageDrawable(getResources().getDrawable(R.drawable.obama_profile));
        }
    }
}
