package com.cardsui.mash;

import android.annotation.TargetApi;
import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.fima.cardsui.objects.CardStack;
import com.fima.cardsui.views.CardUI;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends Activity {

	private CardUI mCardView;
	private View Linlay;
	private EditText ed1;
	private Button loc,cau,type;

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ed1=(EditText)findViewById(R.id.reqs);
		loc=(Button)findViewById(R.id.loc);
		//cau=(Button)findViewById(R.id.cau);
		//type=(Button)findViewById(R.id.type);
		ed1.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
				loc.setVisibility(View.VISIBLE);
				//Toast.makeText(getBaseContext(), "dndldf",Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		SpinnerAdapter adapter =
		        ArrayAdapter.createFromResource(this, R.array.actions,
		        android.R.layout.simple_expandable_list_item_1);

		// Callback
		OnNavigationListener callback = new OnNavigationListener() {

		    String[] items = getResources().getStringArray(R.array.actions); // List items from res

		    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
			@Override
		    public boolean onNavigationItemSelected(int position, long id) {
		    	
		    	launchActivity(position);
	             return true;
		    	
		        // Do stuff when navigation item is selected


		    }

		};

		// Action Bar
		android.app.ActionBar actions = getActionBar();
		actions.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		actions.setDisplayShowTitleEnabled(false);
		actions.setListNavigationCallbacks(adapter, (OnNavigationListener) callback);
		
		
	
		// init CardView
		mCardView = (CardUI) findViewById(R.id.cardsview);
		mCardView.setSwipeable(true);

		CardStack stack2 = new CardStack();
		stack2.setTitle("REGULAR CARDS");
		mCardView.addStack(stack2);

		// add AndroidViews Cards
		mCardView.addCard(new MyCard("Get the CardsUI view"));
		mCardView.addCardToLastStack(new MyCard("for Android at"));
		MyCard androidViewsCard = new MyCard("www.androidviews.net");
		androidViewsCard.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.androidviews.net/"));
				startActivity(intent);

			}
		});
		
		
		
		
		/*
		 *
		androidViewsCard.setOnLongClickListener(new OnLongClickListener() {    		
    		
			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(v.getContext(), "This is a long click", Toast.LENGTH_SHORT).show();
				return true;
			}
		
		});
		*/
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://www.androidviews.net/"));

		mCardView.addCardToLastStack(androidViewsCard);

		CardStack stackPlay = new CardStack();
		stackPlay.setTitle("GOOGLE PLAY CARDS");
		mCardView.addStack(stackPlay);

		// add one card, and then add another one to the last stack.
		mCardView.addCard(new MyCard("Google Play Cards"));
		mCardView.addCardToLastStack(new MyCard("By Androguide & GadgetCheck"));

		mCardView.addCardToLastStack(new MyPlayCard("Google Play",
				"This card mimics the new Google play cards look", "#33b6ea",
				"#33b6ea", true, false));

		mCardView
				.addCardToLastStack(new MyPlayCard(
						"Menu Overflow",
						"The PlayCards allow you to easily set a menu overflow on your card.\nYou can also declare the left stripe's color in a String, like \"#33B5E5\" for the holo blue color, same for the title color.",
						"#e00707", "#e00707", false, true));

		// add one card
		mCardView
				.addCard(new MyPlayCard(
						"Different Colors for Title & Stripe",
						"You can set any color for the title and any other color for the left stripe",
						"#f2a400", "#9d36d0", false, false));

		mCardView
				.addCardToLastStack(new MyPlayCard(
						"Set Clickable or Not",
						"You can easily implement an onClickListener on any card, but the last boolean parameter of the PlayCards allow you to toggle the clickable background.",
						"#4ac925", "#222222", true, true));

		// draw cards
		mCardView.refresh();
	}
	
	 public void launchActivity(int itemPosition) {
	     Intent intent;
	     switch (itemPosition) {
	     case 0:
	           intent = new Intent(this, MainActivity2.class);
	           startActivity(intent);
	           break;
	     case 1:
	           intent = new Intent(this, MainActivity2.class);
	           startActivity(intent);
	           break;
	        case 2:
	        	intent = new Intent(this, MainActivity2.class);
		           startActivity(intent);
		           break;
	     }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
