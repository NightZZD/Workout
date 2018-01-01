package messager.hfad.com.messager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        EditText editText = (EditText) findViewById(R.id.message);
        String messageText = editText.getText().toString();
       // Intent intent = new Intent(this,ReceiveMessageActivity.class);
        // intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        Intent intent = new Intent(Intent.ACTION_SEND);//创建意图指定一个动作
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);//向意图增加额外信息
        String chooserTile = getString(R.string.chooser);//在String.xml中增加资源，内联类String
        Intent choserintent = Intent.createChooser(intent,chooserTile);//包装一次intent，创建选择器
        startActivity(choserintent);
    }
}
