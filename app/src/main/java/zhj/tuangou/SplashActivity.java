package zhj.tuangou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends Activity {

    Handler mHandler = new Handler();
    private boolean isFirst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();

        //延迟两秒进入
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent();
                if(isFirst)
                intent.setClass(SplashActivity.this,MainActivity.class);
                startActivity(intent);
            }
        },2000);
    }



    private void initViews() {
    }
}
