package com.example.p1431658.listviewwithparse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ActivityActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton top1= (ImageButton) findViewById(R.id.imageView1);
        top1.setOnClickListener(this);

        ImageButton top2= (ImageButton) findViewById(R.id.imageView2);
        top2.setOnClickListener(this);

        ImageButton top3= (ImageButton) findViewById(R.id.imageView3);
        top3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.imageView1:
            break;
        case R.id.imageView2:
            Intent j=new Intent(this,DineActivity.class);
            startActivity(j);
            break;
        case R.id.imageView3:
            Intent i=new Intent(this,CategoryActivity.class);
            startActivity(i);
            break;

    }
    }
}




/**
 * Created by P1431658 on 23/1/2016.
 */
/*public class ActivityActivity extends AppCompatActivity implements OnClickableAreaClickedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add image
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.simpsons);

        // Create your image
        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(new PhotoViewAttacher(image), this);

        // Initialize your clickable area list
        List<ClickableArea> clickableAreas = new ArrayList<>();

        // Define your clickable areas
        // parameter values (pixels): (x coordinate, y coordinate, width, height) and assign an object to it
        clickableAreas.add(new ClickableArea(500, 200, 125, 200, new Character("Homer", "Simpson")));
        clickableAreas.add(new ClickableArea(600, 440, 130, 160, new Character("Bart", "Simpson")));
    }

    // Listen for touches on your images:
    @Override
    public void onClickableAreaTouched(Object item) {
        if (item instanceof Character) {
            String text = ((Character) item).getFirstName() + " " + ((Character) item).getLastName();
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
    }

}
 */
