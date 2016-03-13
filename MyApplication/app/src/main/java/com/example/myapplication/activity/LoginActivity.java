package com.example.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.chongge.myapplication.R;

public class LoginActivity extends Activity{
    public Button btnLogin;
    public Button btnRegister;
    public EditText editTextUserName;
    public EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
  //      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
  //      setSupportActionBar(toolbar);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName = editTextUserName.getText().toString();
                String strPassWord = editTextPassword.getText().toString();
                if(strUserName.compareTo("app") == 0 && strPassWord.compareTo("123456") == 0) {
                    //// TODO: 2016/3/8
                    //切换activity
                    Intent intent = new Intent(LoginActivity.this, ChooseAreaActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
/*
    @Override
    public void onClick(View v){
        String strUserName = editTextUserName.getText().toString();
        String strPassWord = editTextPassword.getText().toString();

        switch (v.getId()){
            case R.id.btnLogin:{
                // TODO: 2016/3/8
                //暂时用假的数据验证
                //底层需要数据库验证
                if(strUserName == "app" && strPassWord == "123456") {
                    //// TODO: 2016/3/8
                    //切换activity
                }
            }
            break;
            case R.id.btnRegister:{
                // TODO: 2016/3/8

            }
            break;
            default:
                break;
        }
    }
    */
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
}
