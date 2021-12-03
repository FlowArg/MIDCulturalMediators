package fr.flowarg.lp2i.midculturalmediators;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        final Button fochButton = this.findViewById(R.id.foch_button);
        final ImageView fochImage = this.findViewById(R.id.foch_image);
        final Button hdvButton = this.findViewById(R.id.orgue_st_radegonde_button);
        final ImageView hdvImage = this.findViewById(R.id.orgue_st_radegonde_image);
        final Button dameDuneButton = this.findViewById(R.id.dame_dunes_button);
        final ImageView dameDuneImage = this.findViewById(R.id.dame_dunes_image);

        this.setupListener(fochButton, fochImage, hdvImage, dameDuneImage);
        this.setupListener(hdvButton, hdvImage, fochImage, dameDuneImage);
        this.setupListener(dameDuneButton, dameDuneImage, hdvImage, fochImage);

        final Button poitiers3DButton = this.findViewById(R.id.poitiers3d_button);
        poitiers3DButton.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.gmt.p3d"));
            this.startActivity(browserIntent);
        });
    }

    private void setupListener(@NonNull Button button, ImageView image, ImageView... others)
    {
        button.setOnClickListener(v -> {
            this.invert(image);

            for (ImageView other : others)
                other.setVisibility(View.INVISIBLE);
        });
    }

    private void invert(@NonNull View object)
    {
        object.setVisibility(object.getVisibility() == View.INVISIBLE ? View.VISIBLE : View.INVISIBLE);
    }
}