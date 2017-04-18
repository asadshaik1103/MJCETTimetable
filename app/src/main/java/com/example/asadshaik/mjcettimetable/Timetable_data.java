package com.example.asadshaik.mjcettimetable;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.io.File;

public class Timetable_data extends AppCompatActivity {


    private StorageReference mStorageRef;
    private ImageView timetable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//Hide title
        this.getWindow().setFlags(WindowManager.LayoutParams.
                FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//Hide Status bar
        setContentView(R.layout.activity_timetable_data);

        Bundle bundle1=getIntent().getExtras();
        String data1=bundle1.get("data1").toString();

        Bundle bundle2=getIntent().getExtras();
        String data2=bundle2.get("data2").toString();

        Bundle bundle3=getIntent().getExtras();
        String data3=bundle3.get("data3").toString();


        Toast.makeText(getApplicationContext(),"data1 is"+data1,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"data2 is"+data2,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"data3 is"+data3,Toast.LENGTH_LONG).show();



        timetable=(ImageView)findViewById(R.id.timetable);



        if (data1=="IT" && data2=="1" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_1%3AA.jpeg?alt=media&token=1d2ed5ce-efba-44c2-9ecd-ebd37fe15bc8").into(timetable);

        }
        else if (data1=="IT" && data2=="1" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_1%3AB.jpeg?alt=media&token=fd24b774-382e-46b0-8df1-a4c291167466").into(timetable);

        }
        else if (data1=="IT" && data2=="2" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_2%3AA.jpeg?alt=media&token=a260d208-b8f9-4069-a083-ed4939f0f091").into(timetable);

        }
        else if (data1=="IT" && data2=="2" && data3=="B"){

            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_2%3AB.jpeg?alt=media&token=4c0f65df-e521-4b24-b9ed-529ddb6d9ea9").into(timetable);
        }
        else if (data1=="IT" && data2=="3" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_3%3AA.jpeg?alt=media&token=a2d533ff-ccc2-4068-b82a-aa48bb3c620c").into(timetable);

        }
        else if (data1=="IT" && data2=="3" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_3%3AB.jpeg?alt=media&token=1dc582c2-3ec7-48cc-9636-2258704bd190").into(timetable);

        }
        else if (data1=="IT" && data2=="4" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_4%3AA.jpeg?alt=media&token=d37ab9ba-5602-4640-bafd-23bb92c61924").into(timetable);

        }
        else if (data1=="IT" && data2=="4" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fit%2Fit_4%3AB.jpeg?alt=media&token=d28e3fd5-31c4-4d2b-80c4-4708eebb62c4").into(timetable);

        }



        //CSE
        else if (data1=="CSE" && data2=="1" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_1%3AA.jpeg?alt=media&token=4889f5c8-d020-4d6e-a0c3-c669fb339fa1").into(timetable);


        }
        else if (data1=="CSE" && data2=="1" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_1%3AB.jpeg?alt=media&token=00f4d961-d904-43cc-86bf-6148eb9df9ea").into(timetable);

        }
        else if (data1=="CSE" && data2=="2" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_2%3AA.jpeg?alt=media&token=f917eade-b702-4e96-b9ae-7da226d346d0").into(timetable);

        }
        else if (data1=="CSE" && data2=="2" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_2%3AB.jpeg?alt=media&token=e31151e8-0a06-4bdb-b895-662d612809e4").into(timetable);

        }
        else if (data1=="CSE" && data2=="3" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_3%3AA.jpeg?alt=media&token=d2488751-7dfb-4efc-926e-7f670ff0b123").into(timetable);

        }
        else if (data1=="CSE" && data2=="3" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_3%3AB.jpeg?alt=media&token=42541706-4b41-4a3d-9fab-043f0bbbcbd6").into(timetable);

        }
        else if (data1=="CSE" && data2=="4" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_4%3AA.jpeg?alt=media&token=000bc805-8555-485a-8f6c-246e82e12758").into(timetable);

        }
        else if (data1=="CSE" && data2=="4" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcse%2Fcse_4%3AB.jpeg?alt=media&token=6c94935a-308a-47d2-9a75-6364ad527a57").into(timetable);

        }
        //CIVIL
        else if (data1=="CIVIL" && data2=="1" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_1%3AA.PNG?alt=media&token=f18a549c-cf35-4038-acde-5689beed69df").into(timetable);


        }
        else if (data1=="CIVIL" && data2=="1" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_1%3AB.PNG?alt=media&token=a5974fa9-afc0-42b0-8c3a-11ba549f2dd3").into(timetable);

        }
        else if (data1=="CIVIL" && data2=="2" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_2%3AA.PNG?alt=media&token=10797c19-9a2d-4c07-bb39-b3e9e3aac503").into(timetable);

        }
        else if (data1=="CIVIL" && data2=="2" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_2%3AB.PNG?alt=media&token=3e115803-4a99-449e-bc3d-a6c0b628981d").into(timetable);

        }
        else if (data1=="CIVIL" && data2=="3" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_3%3AA.PNG?alt=media&token=f6861002-2c19-4039-8cb2-3480300b5e46").into(timetable);

        }
        else if (data1=="CIVIL" && data2=="3" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_3%3AB.PNG?alt=media&token=a710b642-9ee5-4c3e-9712-8c938ecb9df3").into(timetable);

        }
        else if (data1=="CIVIL" && data2=="4" && data3=="A"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_4%3AA.PNG?alt=media&token=e86fc344-6312-406e-aab9-ab4f37a0de15").into(timetable);

        }
        else if (data1=="CIVIL" && data2=="4" && data3=="B"){
            Picasso.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/mjcet-timetable.appspot.com/o/timetables%2Fcivil%2Fcivil_4%3AB.PNG?alt=media&token=b68d2d5b-5ba3-4b37-8f79-69142033b332").into(timetable);

        }
        /*
        else if (data1=="" && data2=="" && data3==""){

            Picasso.with(getApplicationContext()).load("").into(timetable);
        }
         */


    }
}
