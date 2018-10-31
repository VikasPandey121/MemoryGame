package wordpuzzle.vikas.com.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button R1,R2,O1,O2,B1,B2,BL1,BL2,G1,G2,L1,L2;
    int t1;
    int t2;



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
      L1=findViewById(R.id.ye1);
       L2=findViewById(R.id.ye2);
        Intent j=getIntent();

//change color to red


        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("1".toString());
                R1.setBackgroundColor(Color.RED);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }

            }
        });



        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("1".toString());
                R2.setBackgroundColor(Color.RED);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        O1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("2".toString());
                O1.setBackgroundColor(Color.GRAY);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        O2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("2".toString());
                O2.setBackgroundColor(Color.GRAY);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("3".toString());
                B1.setBackgroundColor(Color.BLUE);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("3".toString());
                B2.setBackgroundColor(Color.BLUE);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        BL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("4".toString());
                BL1.setBackgroundColor(Color.BLACK);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        BL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("4".toString());
                BL2.setBackgroundColor(Color.BLACK);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = Integer.parseInt("5".toString());
                G1.setBackgroundColor(Color.GREEN);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        G2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2 = Integer.parseInt("5".toString());
                G2.setBackgroundColor(Color.GREEN);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        L1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             t1 = Integer.parseInt("6".toString());
                L1.setBackgroundColor(Color.YELLOW);
                if (t1==t2) {
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

       L2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                t2 = Integer.parseInt("6".toString());
                L2.setBackgroundColor(Color.YELLOW);
                if (t1==t2) {
                    if (t1 == 1) {
                        R1.setVisibility(View.INVISIBLE);
                        R2.setVisibility(View.INVISIBLE);
                        if(t1==t2)
                        {
                            R1.setVisibility(View.GONE);
                            R2.setVisibility(View.GONE);
                        }
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
                        L1 .setVisibility(View.INVISIBLE);
                        L2.setVisibility(View.INVISIBLE);
                    }
                }
                else {
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });






        }











    }
