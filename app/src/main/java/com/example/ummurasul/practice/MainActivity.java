package com.example.ummurasul.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int weekday = 5;
//        int weekend = 9;
//        int optimalHours = 7 * 8;



        String firstName = "Mariam";
        String lastName = "Abdallah";
        String contactInfo = firstName + " " + lastName;
        contactInfo = "<" + lastName + "." + firstName + "@justjava.com>";
        display(contactInfo);



//        int dollars = 40;
//        int dollarsToYen = 119;
//        int yen = dollarsToYen * dollars;
//        display(yen);

//choose here for rasberry
//        int raspberryPrice = 5;
//        display1("1 box: $" + raspberryPrice);
//        raspberryPrice = 10;
//        display2("2 boxes: $" + (raspberryPrice));
//        display3("3 boxes: $" + (raspberryPrice * 3));




//        int actualHours = weekday;
//        actualHours = actualHours + weekend * 2;
//        int solution = optimalHours - actualHours;
//        display(solution);
    }

////   public  void  display(int i){
////       TextView t = (TextView)findViewById(R.id.display_text_view);
////       t.setText(""+i);
//   }



    public  void  display(String i){
        TextView t = (TextView)findViewById(R.id.display_text_view);
////       t.setText(""+i);
    }


    //crrency
//   public  void  display(int i){
//        TextView t = (TextView)findViewById(R.id.display1_text_view);
//        t.setText(""+i);
//    }
//    //rasberry
//    public  void  display2(int i){
//        TextView t = (TextView)findViewById(R.id.display2_text_view);
//        t.setText(""+i);
//    }

}
