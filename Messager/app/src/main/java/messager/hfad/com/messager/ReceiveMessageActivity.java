package messager.hfad.com.messager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();//从意图得到信息
        String getfromactivityText = intent.getStringExtra(EXTRA_MESSAGE);//int num = intent.getStringExtra("name",default_value)
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(getfromactivityText);
    }
}
