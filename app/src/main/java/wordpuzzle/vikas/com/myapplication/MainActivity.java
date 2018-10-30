package wordpuzzle.vikas.com.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button R1,R2,O1,O2,B1,B2,BL1,BL2,G1,G2,Y1,Y2;
    int t1;
    int t2;//practise




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        R1 = findViewById(R.id.R1);
        R2 = findViewById(R.id.R2);
        O1 = findViewById(R.id.O1);
        O2 = findViewById(R.id.O2);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        BL1 = findViewById(R.id.BL1);
        BL2 = findViewById(R.id.BL2);
        G1 = findViewById(R.id.G1);
        G2 = findViewById(R.id.G2);
        Y1.findViewById(R.id.Y1);
        Y2.findViewById(R.id.Y2);
//change color to red
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("1".toString());
                R1.setBackgroundColor(Color.RED);
            }
        });
        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("1".toString());
                R2.setBackgroundColor(Color.RED);
            }
        });
        O1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("2".toString());
                O1.setBackgroundColor(Color.GRAY);

            }
        });
        O2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("2".toString());
                O2.setBackgroundColor(Color.GRAY);
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("3".toString());
                B1.setBackgroundColor(Color.BLUE);

            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("3".toString());
                B2.setBackgroundColor(Color.BLUE);

            }
        });
        BL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("4".toString());
                BL1.setBackgroundColor(Color.BLACK);
            }
        });
        BL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("4".toString());
                BL2.setBackgroundColor(Color.BLACK);

            }
        });
        G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("5".toString());
                BL2.setBackgroundColor(Color.GREEN);

            }
        });
        G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("5".toString());
                G2.setBackgroundColor(Color.GREEN);

            }
        });
        Y1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("6".toString());
                Y1.setBackgroundColor(Color.YELLOW);

            }
        });
        Y2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("6".toString());
                Y2.setBackgroundColor(Color.YELLOW);

            }
        });
        if (t1 == t2) {
            if (t1 == 1) {
                R1.setVisibility(View.INVISIBLE);
                R2.setVisibility(View.INVISIBLE);
            }

            if (t1 == 2) {
                O1.setVisibility(View.INVISIBLE);
                O2.setVisibility(View.INVISIBLE);
            }

            if (t1 == 3) {
                B1.setVisibility(View.INVISIBLE);
                B2.setVisibility(View.INVISIBLE);
            }

            if (t1 == 4) {
                BL1.setVisibility(View.INVISIBLE);
                BL2.setVisibility(View.INVISIBLE);
            }

            if (t1 == 5) {
                G1.setVisibility(View.INVISIBLE);
                G2.setVisibility(View.INVISIBLE);
            }

            if (t1 == 6) {
                Y1.setVisibility(View.INVISIBLE);
                Y2.setVisibility(View.INVISIBLE);
            }
        }




        }











    }
  
    }
}
