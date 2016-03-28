package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);


        return rootView;
    }

    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    ImageView img11;
    ImageView img12;
    ImageView img13;
    ImageView img14;
    ImageView img15;
    ImageView img16;
    ImageView img17;
    ImageView img18;

   @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        img2 = (ImageView) getView().findViewById(R.id.imageView2);
        img3 = (ImageView) getView().findViewById(R.id.imageView3);
        img4 = (ImageView) getView().findViewById(R.id.imageView4);
       img5 = (ImageView) getView().findViewById(R.id.imageView5);
       img6 = (ImageView) getView().findViewById(R.id.imageView6);
       img7 = (ImageView) getView().findViewById(R.id.imageView7);
       img8 = (ImageView) getView().findViewById(R.id.imageView8);
       img9 = (ImageView) getView().findViewById(R.id.imageView9);
       img10 = (ImageView) getView().findViewById(R.id.imageView10);
       img11 = (ImageView) getView().findViewById(R.id.imageView11);
       img12 = (ImageView) getView().findViewById(R.id.imageView12);
       img13 = (ImageView) getView().findViewById(R.id.imageView13);
       img14 = (ImageView) getView().findViewById(R.id.imageView14);
       img15 = (ImageView) getView().findViewById(R.id.imageView15);
       img16 = (ImageView) getView().findViewById(R.id.imageView16);
       img17 = (ImageView) getView().findViewById(R.id.imageView17);
       img18 = (ImageView) getView().findViewById(R.id.imageView18);




        // set a onclick listener for when the button gets clicked
        img2.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        Two.class);
                startActivity(mainIntent);
            }
        });
       // set a onclick listener for when the button gets clicked
       img3.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Three.class);
               startActivity(mainIntent);
           }
       });

       img4.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Four.class);
               startActivity(mainIntent);
           }
       });
       img5.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Five.class);
               startActivity(mainIntent);
           }
       });
       img6.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Six.class);
               startActivity(mainIntent);
           }
       });
       img7.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Seven.class);
               startActivity(mainIntent);
           }
       });
       img8.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Eight.class);
               startActivity(mainIntent);
           }
       });
       img9.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Nine.class);
               startActivity(mainIntent);
           }
       });
       img10.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Ten.class);
               startActivity(mainIntent);
           }
       });
       img11.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Eleven.class);
               startActivity(mainIntent);
           }
       });
       img12.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Twelve.class);
               startActivity(mainIntent);
           }
       });
       img13.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Thirteen.class);
               startActivity(mainIntent);
           }
       });
       img14.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Fourteen.class);
               startActivity(mainIntent);
           }
       });
       img15.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Fifteen.class);
               startActivity(mainIntent);
           }
       });
       img16.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Sixteen.class);
               startActivity(mainIntent);
           }
       });
       img17.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Seventeen.class);
               startActivity(mainIntent);
           }
       });
       img18.setOnClickListener(new View.OnClickListener() {
           // Start new list activity
           public void onClick(View v) {
               Intent mainIntent = new Intent(getActivity(),
                       Eighteen.class);
               startActivity(mainIntent);
           }
       });
    }


}

