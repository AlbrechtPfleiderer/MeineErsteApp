package berufsschulefreising.javaalberto.de;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float size = new Button(this).getTextSize();
        Toast.makeText(this,"Textgröße " + size, Toast.LENGTH_LONG).show();
        title = (TextView)findViewById(R.id.textView_titel1);
        Button red = (Button)findViewById(R.id.button_rot);
        Button yellow = (Button)findViewById(R.id.button_gelb);
        Button end = (Button)findViewById(R.id.button_Ende);
        red.setOnClickListener(this);
        yellow.setOnClickListener(this);
        end.setOnClickListener(this);
    }
    @Override
    public void onClick(View view)
    {
     switch(view.getId())
     {
         case R.id.button_rot:
             title.setBackgroundColor(RED);
             break;
         case R.id.button_gelb:
             title.setBackgroundColor(YELLOW);
         break;
         case R.id.button_Ende:
             finish();
             break;
     }
    }
}