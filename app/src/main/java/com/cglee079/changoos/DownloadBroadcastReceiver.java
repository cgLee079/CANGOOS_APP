package com.cglee079.changoos;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 이찬구 on 2018-03-19.
 */

public class DownloadBroadcastReceiver  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
            Toast.makeText(context, "다운로드 완료", Toast.LENGTH_SHORT).show();
        }
    }
}
