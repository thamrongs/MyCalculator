package com.buu.se.s55160026.mycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    private String operator = "";
    private String value = "";
    private Boolean checkOperatorClick = false;
    private Boolean checkDotClick = false;
    private double result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onZeroClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "0";
        txtViewResult.setText(this.value);
    }

    public void onOneClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "1";
        txtViewResult.setText(this.value);
    }

    public void onTwoClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "2";
        txtViewResult.setText(this.value);
    }

    public void onThreeClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "3";
        txtViewResult.setText(this.value);
    }

    public void onFourClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "4";
        txtViewResult.setText(this.value);
    }

    public void onFiveClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "5";
        txtViewResult.setText(this.value);
    }

    public void onSixClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "6";
        txtViewResult.setText(this.value);
    }

    public void onSevenClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "7";
        txtViewResult.setText(this.value);
    }

    public void onEightClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "8";
        txtViewResult.setText(this.value);
    }

    public void onNineClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        this.value += "9";
        txtViewResult.setText(this.value);
    }

    public void onDotClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        if(!checkDotClick){
            this.value += ".";
            txtViewResult.setText(this.value);
        }
        this.checkDotClick = true;
        txtViewResult.setText(this.value);
    }

    public void onAcClick(View v){

        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        txtViewResult.setText("0");
        this.value = "";
        this.operator = "";
        this.checkDotClick = false;
        this.checkOperatorClick = false;
        this.result = 0;
        this.resultStr = "";
    }

    public void onPlusClick(View v){

        if(this.checkOperatorClick){
            this.onEqualClick(v);
        }
        if(this.value.equals("")){
            this.value = "0";
        }
        this.result = Double.parseDouble(this.value);
        this.operator = "1";
        this.value = "";
        this.checkOperatorClick = true;
        this.checkDotClick = false;

    }

    public void onMinusClick(View v){

        if(this.checkOperatorClick){
            this.onEqualClick(v);
        }
        if(this.value.equals("")){
            this.value = "0";
        }
        this.result = Double.parseDouble(this.value);
        this.operator = "2";
        this.value = "";
        this.checkOperatorClick = true;
        this.checkDotClick = false;
    }

    public void onMulClick(View v){

        if(this.checkOperatorClick){
            this.onEqualClick(v);
        }
        if(this.value.equals("")){
            this.value = "0";
        }
        this.result = Double.parseDouble(this.value);
        this.operator = "3";
        this.value = "";
        this.checkOperatorClick = true;
        this.checkDotClick = false;
    }

    public void onDivClick(View v){

        if(this.checkOperatorClick){
            this.onEqualClick(v);
        }
        if(this.value.equals("")){
            this.value = "0";
        }
        this.result = Double.parseDouble(this.value);
        this.operator = "4";
        this.value = "";
        this.checkOperatorClick = true;
        this.checkDotClick = false;
    }

    public void  onEqualClick(View v){
        TextView txtViewResult = (TextView) findViewById(R.id.textView);
        if(this.value.equals("")){
            this.value = "0";
        }
        switch (this.operator){
            case "1" :{
                this.result += Double.parseDouble(this.value);
                this.value = Double.toString(this.result);
                txtViewResult.setText(this.value);
                break;
            }
            case "2" :{
                this.result -= Double.parseDouble(this.value);
                this.value = Double.toString(this.result);
                txtViewResult.setText(this.value);
                break;
            }
            case "3" :{
                this.result *= Double.parseDouble(this.value);
                this.value = Double.toString(this.result);
                txtViewResult.setText(this.value);
                break;
            }
            case "4" :{
                if(this.value.equals("0")){
                    txtViewResult.setText("Not a number");
                }else {
                    this.result /= Double.parseDouble(this.value);
                    this.value = Double.toString(this.result);
                    txtViewResult.setText(this.value);
                }
                break;
            }
        }
        this.checkOperatorClick = false;
        this.checkDotClick = false;
    }

}
