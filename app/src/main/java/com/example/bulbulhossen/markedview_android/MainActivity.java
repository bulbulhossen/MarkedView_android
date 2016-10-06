package com.example.bulbulhossen.markedview_android;


        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import com.mittsu.markedview.MarkedView;

        import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FileCopyManager fcm = new FileCopyManager(this);

        MarkedView mdView = (MarkedView)findViewById(R.id.md_view);
        // code block in scrolling be deactivated.
        // mdView.setCodeScrollDisable();

        File mdFile = new File(fcm.getSampleFilePath(this));
        mdView.loadMDFile(mdFile);

    }
}
