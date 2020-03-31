package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView txt1,txt2;
    ImageView img1,img2,img3, gif1, gif2, gif3, gif4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txt1=(TextView) findViewById(R.id.textView4);
        txt2=(TextView) findViewById(R.id.textView5);
        img1=(ImageView) findViewById(R.id.imageView);
        img2=(ImageView) findViewById(R.id.imageView2);
        img3=(ImageView) findViewById(R.id.imageView3);
        gif1=(ImageView) findViewById(R.id.gifview1);
        gif2=(ImageView) findViewById(R.id.gifview2);
        gif3=(ImageView) findViewById(R.id.gifview3);
        gif4=(ImageView) findViewById(R.id.gifview4);

        img1.setOnLongClickListener(longClickListener);
        img2.setOnLongClickListener(longClickListener);
        img3.setOnLongClickListener(longClickListener);

        txt1.setOnDragListener(dragListener);
    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v){
            ClipData data=ClipData.newPlainText("","");
            View.DragShadowBuilder myshadowbuilder = new View.DragShadowBuilder(v);
            v.startDrag(data,myshadowbuilder,v,0);
            return true;
        }
    };

    View.OnDragListener dragListener=new View.OnDragListener(){

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();

        final View view= (View) event.getLocalState();
            switch (dragEvent){
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    if (view.getId() == R.id.imageView){
                        txt1.setText("Answer is Correct");
                        img2.setVisibility(View.GONE);
                        img3.setVisibility(View.GONE);
                        txt2.setVisibility(View.GONE);
                        txt1.setVisibility(View.GONE);
                        gif1.setVisibility(View.VISIBLE);
                        gif2.setVisibility(View.VISIBLE);
                        gif3.setVisibility(View.VISIBLE);
                        gif4.setVisibility(View.VISIBLE);
                    }
                    else{
                        txt1.setText("Try Again");}
                    view.animate()
                            .x(txt1.getX())
                            .y(txt1.getY())
                            .setDuration(500)
                            .start();
                    break;
            }
            return true;
        }
    };
}
