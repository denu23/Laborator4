package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class PhoneDialerActivity extends Activity {

	class ApasaButon implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			
			EditText edit = (EditText) findViewById(R.id.edit_phone_number);
			String numar = edit.getText().toString();
			
			// TODO Auto-generated method stub
			if (v.getId() == R.id.id0) {
				numar += "0";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id1) {
				numar += "1";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id2) {
				numar += "2";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id3) {
				numar += "3";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id4) {
				numar += "4";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id5) {
				numar += "5";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id6) {
				numar += "6";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id7) {
				numar += "7";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id8) {
				numar += "8";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.id9) {
				numar += "9";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.steluta) {
				numar += "*";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.diez) {
				numar += "#";
				edit.setText(numar);
			}
			
			if (v.getId() == R.id.backspace) {
				if (numar.isEmpty() == false) {
					numar = numar.substring(0, numar.length() - 1);
					edit.setText(numar);
				}
			}
			
			if (v.getId() == R.id.call) {
				Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+ edit.getText().toString()));
				startActivity(intent);
			}
			
			if (v.getId() == R.id.hangup) {
				finish();
			}
			if (v.getId() == R.id.add_contact) {
				Editable phoneNumber = ((EditText)findViewById(R.id.edit_phone_number)).getText();
				if (phoneNumber.length() > 0) {
				  Intent intent = new Intent("com.example.contactsmanager.intent.action.ContactsManagerActivity");
				  intent.putExtra("ro.pub.cs.systems.pdsd.lab04.contactsmanager.PHONE_NUMBER_KEY", phoneNumber);
				  startActivityForResult(intent, 2300);
				} else {
				  Toast.makeText(getApplication(), getResources().getString(R.string.phone_error), Toast.LENGTH_LONG).show();
				}
			}
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//randul de mai jos se decomenteaza doar pentru ex 6
		//setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		setContentView(R.layout.activity_phone_dialer);
		
		
		
		ApasaButon ap = new ApasaButon();
		
		Button nr0 = (Button)findViewById(R.id.id0);
		nr0.setOnClickListener(ap);
		Button nr1 = (Button)findViewById(R.id.id1);
		nr1.setOnClickListener(ap);
		Button nr2 = (Button)findViewById(R.id.id2);
		nr2.setOnClickListener(ap);
		Button nr3 = (Button)findViewById(R.id.id3);
		nr3.setOnClickListener(ap);
		Button nr4 = (Button)findViewById(R.id.id4);
		nr4.setOnClickListener(ap);
		Button nr5 = (Button)findViewById(R.id.id5);
		nr5.setOnClickListener(ap);
		Button nr6 = (Button)findViewById(R.id.id6);
		nr6.setOnClickListener(ap);
		Button nr7 = (Button)findViewById(R.id.id7);
		nr7.setOnClickListener(ap);
		Button nr8 = (Button)findViewById(R.id.id8);
		nr8.setOnClickListener(ap);
		Button nr9 = (Button)findViewById(R.id.id9);
		nr9.setOnClickListener(ap);
		Button steluta = (Button)findViewById(R.id.steluta);
		steluta.setOnClickListener(ap);
		Button diez = (Button)findViewById(R.id.diez);
		diez.setOnClickListener(ap);
		ImageButton backspace = (ImageButton)findViewById(R.id.backspace);
		backspace.setOnClickListener(ap);
		ImageButton call = (ImageButton)findViewById(R.id.call);
		call.setOnClickListener(ap);
		ImageButton addContact = (ImageButton)findViewById(R.id.add_contact);
		addContact.setOnClickListener(ap);
		ImageButton hangup = (ImageButton)findViewById(R.id.hangup);
		hangup.setOnClickListener(ap);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.phone_dialer, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
