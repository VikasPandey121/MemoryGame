package wordpuzzle.vikas.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button R1,R2,O1,O2,B1,B2,BL1,BL2,G1,G2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         R1=findViewById(R.id.R1);
         R2=findViewById(R.id.R2);
        O1=findViewById(R.id.O1);
        O2=findViewById(R.id.O2);
        B1=findViewById(R.id.B1);
        B2=findViewById(R.id.B2);
        BL1=findViewById(R.id.BL1);
        BL2=findViewById(R.id.BL2);
        G1=findViewById(R.id.G1);
        G2=findViewById(R.id.G2);

        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });


            }
  
    }
}
