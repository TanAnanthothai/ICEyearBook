package com.example.iceyearbook;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IceYearBook extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ice_year_book);

		TextView tv1 = (TextView) findViewById(R.id.blogText1);
		TextView tv2 = (TextView) findViewById(R.id.blogText2);
		TextView tv3 = (TextView) findViewById(R.id.blogText3);
		TextView tv4 = (TextView) findViewById(R.id.blogText4);
		TextView tv5 = (TextView) findViewById(R.id.blogText5);
		TextView tv6 = (TextView) findViewById(R.id.blogText6);
		TextView tv7 = (TextView) findViewById(R.id.blogText7);
		TextView tv8 = (TextView) findViewById(R.id.blogText8);
		TextView tv9 = (TextView) findViewById(R.id.blogText9);
		TextView tv10 = (TextView) findViewById(R.id.blogText10);
		TextView tv11 = (TextView) findViewById(R.id.blogText11);
		TextView tv12 = (TextView) findViewById(R.id.blogText12);
		TextView tv13 = (TextView) findViewById(R.id.blogText13);
		TextView tv14 = (TextView) findViewById(R.id.blogText14);
		TextView tv15 = (TextView) findViewById(R.id.blogText15);
		TextView tv16 = (TextView) findViewById(R.id.blogText16);
		TextView tv17 = (TextView) findViewById(R.id.blogText17);
		TextView tv18 = (TextView) findViewById(R.id.blogText18);
		TextView tv19 = (TextView) findViewById(R.id.blogText19);
		TextView tv20 = (TextView) findViewById(R.id.blogText20);
		TextView tv21 = (TextView) findViewById(R.id.blogText21);
		TextView tv22 = (TextView) findViewById(R.id.blogText22);
		
		
		Typeface face = Typeface.createFromAsset(getAssets(),"fonts/thaisansneue_regular.otf");
		
		tv1.setTypeface(face);
		tv2.setTypeface(face);
		tv3.setTypeface(face);
		tv4.setTypeface(face);
		tv5.setTypeface(face);
		tv6.setTypeface(face);
		tv7.setTypeface(face);
		tv8.setTypeface(face);
		tv9.setTypeface(face);
		tv10.setTypeface(face);
		tv11.setTypeface(face);
		tv12.setTypeface(face);
		tv13.setTypeface(face);
		tv14.setTypeface(face);
		tv15.setTypeface(face);
		tv16.setTypeface(face);
		tv17.setTypeface(face);
		tv18.setTypeface(face);
		tv19.setTypeface(face);
		tv20.setTypeface(face);
		tv21.setTypeface(face);
		tv22.setTypeface(face);
		
		ImageView ice1 = (ImageView) findViewById(R.id.ice1);
        ImageView ice2 = (ImageView) findViewById(R.id.ice2);
        ImageView ice3 = (ImageView) findViewById(R.id.ice3);
        ImageView ice4 = (ImageView) findViewById(R.id.ice4);
        ImageView ice5 = (ImageView) findViewById(R.id.ice5);
        ImageView ice6 = (ImageView) findViewById(R.id.ice6);
        ImageView ice7 = (ImageView) findViewById(R.id.ice7);
        ImageView ice8 = (ImageView) findViewById(R.id.ice8);
        ImageView ice9 = (ImageView) findViewById(R.id.ice9);
        ImageView ice10 = (ImageView) findViewById(R.id.ice10);
        ImageView ice11 = (ImageView) findViewById(R.id.ice11);
      
		ice1.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/kunnapat.run?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice2.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/pitcha.lertvinyu?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice3.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/IndyZaIntouch?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice4.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/termerys?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice5.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/pun.sukasemsarn?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice6.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/jeawy.jang?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice7.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/ping.skt?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice8.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/benya.vachalathiti?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice9.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/peth95?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice10.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/gainsk130?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		ice11.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.facebook.com/S.Jirathanapin?fref=grp_mmbr_list"));
		        startActivity(intent);
		    }
		});
		
	}
}
