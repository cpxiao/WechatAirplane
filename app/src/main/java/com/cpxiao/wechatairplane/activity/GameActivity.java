package com.cpxiao.wechatairplane.activity;

import android.app.Activity;
import android.os.Bundle;

import com.cpxiao.wechatairplane.R;
import com.cpxiao.wechatairplane.views.GameView;


public class GameActivity extends Activity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gameView = (GameView) findViewById(R.id.gameView);
        //0:combatAircraft
        //1:explosion
        //2:yellowBullet
        //3:blueBullet
        //4:smallEnemyPlane
        //5:middleEnemyPlane
        //6:bigEnemyPlane
        //7:bombAward
        //8:bulletAward
        //9:pause1
        //10:pause2
        //11:bomb
        int[] bitmapIds = {
                R.drawable.plane,
                R.drawable.explosion,
                R.drawable.bullet_yellow,
                R.drawable.bullet_blue,
                R.drawable.enemy_small,
                R.drawable.enemy_middle,
                R.drawable.enemy_big,
                R.drawable.award_bomb,
                R.drawable.award_bullet_2,
                R.drawable.pause1,
                R.drawable.pause2,
                R.drawable.bomb
        };
        gameView.start(bitmapIds);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (gameView != null) {
            gameView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (gameView != null) {
            gameView.destroy();
        }
        gameView = null;
    }
}