package com.example.pic;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    Button btnOpen;
    ImageView imgView;
    static final int GALLERY_REQUEST = 1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnOpen = (Button)findViewById(R.id.btnOpen);
        imgView = (ImageView)findViewById(R.id.imgView);
    }

    @Override
    public void onClick(View v) {
        Intent photoPickerIntent;
        switch (v.getId())
        {
            case R.id.btnOpen:
                photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, GALLERY_REQUEST);
                break;
        }
    }
    public void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
        Bitmap pic = null;
        switch (requestCode)
        {
            case GALLERY_REQUEST :
                if (resultCode == RESULT_OK)
                {
                    Uri selectedPic = imageReturnedIntent.getData();
                    try
                    {
                        pic = MediaStore.Images.Media.getBitmap(getContentResolver(),selectedPic);

                    }
                    catch (Exception ex)
                    {

                    }
                    
                    imgView.setImageBitmap(pic);
                }
            break;
        }
    }
    }
