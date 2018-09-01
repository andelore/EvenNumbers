package iics.delosreyes.angelinicole.evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button show = findViewById(R.id.show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = findViewById(R.id.viewResult);

                int n = 0;
                int answer = 0;

                while(n<=10) {
                    answer += 2;
                    show.append(answer + "- ");
                }
            }
        });
    }
}