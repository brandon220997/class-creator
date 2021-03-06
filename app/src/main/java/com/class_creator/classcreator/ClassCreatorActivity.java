package com.class_creator.classcreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class ClassCreatorActivity extends AppCompatActivity {

    private PopupWindow addClassPopup;
    private LayoutInflater layoutInflater;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_creator);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);
        Button backButton = (Button) findViewById(R.id.back);
        Button addClassButton = (Button) findViewById(R.id.addclass);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        addClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.popup_add_class,null);
                int height = relativeLayout.getHeight();
                int width = relativeLayout.getWidth();

                addClassPopup = new PopupWindow(container, width, height, true);
                addClassPopup.setOutsideTouchable(true);
                addClassPopup.showAtLocation(relativeLayout, Gravity.CENTER,0,0);

            }
        });

    }
}
