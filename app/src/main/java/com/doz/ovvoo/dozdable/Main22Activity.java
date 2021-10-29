package com.doz.ovvoo.dozdable;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main22Activity extends AppCompatActivity {
    public Button Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9;
    public int a=0;
    public boolean start=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        this.setTitle("بازی دوز");
        Button1 = (Button) findViewById(R.id.button);
        Button2 = (Button) findViewById(R.id.button2);
        Button3 = (Button) findViewById(R.id.button13);
        Button4= (Button) findViewById(R.id.button12);
        Button5 = (Button) findViewById(R.id.button15);
        Button6 = (Button) findViewById(R.id.button16);
        Button7= (Button) findViewById(R.id.button17);
        Button8 = (Button) findViewById(R.id.button18);
        Button9 = (Button) findViewById(R.id.button19);
         Button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Button1.setText("+");
                 Button1.setEnabled(false);
                 a=1;
                 check();
                 tryy();
             }
         });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button2.setText("+");
                Button2.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button3.setText("+");
                Button3.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button4.setText("+");
                Button4.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button5.setText("+");
                Button5.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button6.setText("+");
                Button6.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button7.setText("+");
                Button7.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button8.setText("+");
                Button8.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button9.setText("+");
                Button9.setEnabled(false);
                a=1;
                check();
                tryy();
            }
        });

    }
    public void tryy()
    {
        int w=1;

        if(w==1&&Button1.getText()=="")
        {
            Button1.setText("*");
            Button1.setEnabled(false);
            a=0;
            check();
            return;
        }else
        {
            w++;
        }
        if(w==2&&Button2.getText()=="")
        {
            Button2.setText("*");
            Button2.setEnabled(false);
            a=0;
            check();
            return;
        }else
        {
            w++;
        }
        if(w==3&&Button3.getText()=="")
        {
            Button3.setText("*");
            Button3.setEnabled(false);
            a=0;
            check();return;

        }else
        {
            w++;
        }
        if(w==4&&Button4.getText()=="")
        {
            Button4.setText("*");
            Button4.setEnabled(false);
            a=0;
            check();
            return;
        }else
        {
            w++;
        }
        if(w==5&&Button5.getText()=="")
        {
            Button5.setText("*");
            Button5.setEnabled(false);
            a=0;
            check();
            return;
        }else
        {
            w++;
        }
        if(w==6&&Button6.getText()=="")
        {
            Button6.setText("*");
            Button6.setEnabled(false);
            a=0;
            check();
            return;
        }else
        {
            w++;
        }
        if(w==7&&Button7.getText()=="")
        {
            Button7.setText("*");
            Button7.setEnabled(false);
            a=0;
            check();
            return;
        }else
        {
            w++;
        }
        if(w==8&&Button8.getText()=="")
        {
            Button8.setText("*");
            Button8.setEnabled(false);
            a=0;
            check();
            return;
        }else
        {
            w++;
        }
        if(w==9&&Button1.getText()=="") {
            Button9.setText("*");
            Button9.setEnabled(false);
            a=0;
            check();
            return;
        }

    }
    public void check() {
        boolean ch = false;
        if (Button1.getText() == Button2.getText() && Button2.getText() == Button3.getText() && Button1.getText() != "" && Button2.getText() != "" && Button3.getText() != "") {
            ch = true;
        }
        if (Button4.getText() == Button5.getText() && Button5.getText() == Button6.getText() && Button4.getText() != "" && Button5.getText() != "" && Button6.getText() != "") {
            ch = true;
        }
        if (Button7.getText() == Button8.getText() && Button8.getText() == Button9.getText() && Button7.getText() != "" && Button8.getText() != "" && Button9.getText() != "") {
            ch = true;
        }
        if (Button1.getText() == Button4.getText() && Button4.getText() == Button7.getText() && Button1.getText() != "" && Button4.getText() != "" && Button7.getText() != "") {
            ch = true;
        }
        if (Button2.getText() == Button5.getText() && Button5.getText() == Button8.getText() && Button2.getText() != "" && Button5.getText() != "" && Button8.getText() != "") {
            ch = true;
        }
        if (Button3.getText() == Button6.getText() && Button6.getText() == Button9.getText() && Button3.getText() != "" && Button6.getText() != "" && Button9.getText() != "") {
            ch = true;
        }
        if (Button3.getText() == Button5.getText() && Button5.getText() == Button7.getText() && Button3.getText() != "" && Button5.getText() != "" && Button7.getText() != "") {
            ch = true;
        }
        if (Button1.getText() == Button5.getText() && Button5.getText() == Button9.getText() && Button1.getText() != "" && Button5.getText() != "" && Button9.getText() != "") {
            ch = true;
        }
        if (Button1.getText() != "" && Button2.getText() != "" && Button3.getText() != "" && Button4.getText() != "" && Button5.getText() != "" && Button6.getText() != "" && Button7.getText() != "" && Button8.getText() != "" && Button9.getText() != "") {

            Button1.setText("");
            Button2.setText("");
            Button3.setText("");
            Button4.setText("");
            Button5.setText("");
            Button6.setText("");
            Button7.setText("");
            Button8.setText("");
            Button9.setText("");
            Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
            Button7.setEnabled(true);
            Button8.setEnabled(true);
            Button9.setEnabled(true);

        }
        if (ch == true) {
            Button1.setText("");
            Button2.setText("");
            Button3.setText("");
            Button4.setText("");
            Button5.setText("");
            Button6.setText("");
            Button7.setText("");
            Button8.setText("");
            Button9.setText("");
            Button1.setEnabled(true);
            Button2.setEnabled(true);
            Button3.setEnabled(true);
            Button4.setEnabled(true);
            Button5.setEnabled(true);
            Button6.setEnabled(true);
            Button7.setEnabled(true);
            Button8.setEnabled(true);
            Button9.setEnabled(true);
            AlertDialog.Builder j = new AlertDialog.Builder(Main22Activity.this);
            if(a==0)
            {
                j.setTitle("شما برنده شدید آیا ادامه می دهید");
                j.setPositiveButton("بله", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                j.setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                j.show();
                return;
            }
            else
            {
                j.setTitle("دستگاه برنده شد آیا ادامه می دهید");
                j.setPositiveButton("بله", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Button1.setText("");
                        Button2.setText("");
                        Button3.setText("");
                        Button4.setText("");
                        Button5.setText("");
                        Button6.setText("");
                        Button7.setText("");
                        Button8.setText("");
                        Button9.setText("");
                        Button1.setEnabled(true);
                        Button2.setEnabled(true);
                        Button3.setEnabled(true);
                        Button4.setEnabled(true);
                        Button5.setEnabled(true);
                        Button6.setEnabled(true);
                        Button7.setEnabled(true);
                        Button8.setEnabled(true);
                        Button9.setEnabled(true);
                    }
                });
                j.setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                j.show();
            }


        }
    }
}
