package com.example.lsx.broadcastrecapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/23.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "接收到外部程序发出的广播消息", Toast.LENGTH_SHORT).show();
    }
}
