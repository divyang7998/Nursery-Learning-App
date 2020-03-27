package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView txt1;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txt1=(TextView) findViewById(R.id.textView4);
        img1=(ImageView) findViewById(R.id.imageView);

        img1.setOnLongClickListener(longClickListener);

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

            switch (dragEvent){
                case DragEvent.ACTION_DRAG_ENTERED:
                    final View view= (View) event.getLocalState();
                    if (view.getId() == R.id.imageView){
                        txt1.setText("Answer is Correct");
                    }
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    break;
            }
            return true;
        }
    };
}
