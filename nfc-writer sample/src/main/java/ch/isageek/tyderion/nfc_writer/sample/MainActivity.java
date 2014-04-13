package ch.isageek.tyderion.nfc_writer.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import ch.isageek.tyderion.nfcwriter.nfc_writer.NFCRecordHelper;
import ch.isageek.tyderion.nfcwriter.nfc_writer.NFCWriter;


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
