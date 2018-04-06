package com.cpxiao.wechatairplane.mode.bullet;

import android.graphics.Bitmap;

import com.cpxiao.wechatairplane.mode.common.AutoSprite;

/**
 * 子弹类，从下向上沿直线移动
 */
public class Bullet extends AutoSprite {

    public Bullet(Bitmap bitmap) {
        super(bitmap);
//        setSpeed(-10);//负数表示子弹向上飞
        setSpeedAndAngle(10, 270);
    }

}