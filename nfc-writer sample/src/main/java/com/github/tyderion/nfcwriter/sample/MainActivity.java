package com.github.tyderion.nfcwriter.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.github.tyderion.nfcwriter.NFCRecordHelper;
import com.github.tyderion.nfcwriter.NFCWriter;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void writeTag(View view) {
        NFCWriter.writeRecords(this, NFCRecordHelper.createMime("some.mime.type", "some data"));
    }
}
