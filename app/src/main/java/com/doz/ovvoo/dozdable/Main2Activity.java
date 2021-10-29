package com.doz.ovvoo.dozdable;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
public Button Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9;
    public int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setTitle("بازیکن اول");
        Button1 = (Button) findViewById(R.id.button4);
        Button2 = (Button) findViewById(R.id.button1);
        Button3 = (Button) findViewById(R.id.button5);
        Button4= (Button) findViewById(R.id.button6);
        Button5 = (Button) findViewById(R.id.button7);
        Button6 = (Button) findViewById(R.id.button8);
        Button7= (Button) findViewById(R.id.button9);
        Button8 = (Button) findViewById(R.id.button10);
        Button9 = (Button) findViewById(R.id.button11);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button1.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button1.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button1.setEnabled(false);
                check();


            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button2.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button2.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button2.setEnabled(false);
                check();

            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button3.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button3.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button3.setEnabled(false);
                check();

            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button4.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button4.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button4.setEnabled(false);
                check();

            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button5.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button5.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button5.setEnabled(false);
                check();

            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button6.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button6.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button6.setEnabled(false);
                check();
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button7.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button7.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button7.setEnabled(false);
                check();
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button8.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button8.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button8.setEnabled(false);
                check();
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a==0)
                {
                    Button9.setText("+");
                    a++;
                    Main2Activity.this.setTitle("بازیکن دوم");
                }
                else
                {
                    Button9.setText("*");
                    a=0;
                    Main2Activity.this.setTitle("بازیکن اول");
                }
                Button9.setEnabled(false);
                check();
            }
        });
    }
    public void check()
    {
        boolean ch=false;
        if(Button1.getText()==Button2.getText()&&Button2.getText()==Button3.getText()&&Button1.getText()!=""&&Button2.getText()!=""&&Button3.getText()!="")
        {
            ch=true;
        }
        if(Button4.getText()==Button5.getText()&&Button5.getText()==Button6.getText()&&Button4.getText()!=""&&Button5.getText()!=""&&Button6.getText()!="")
        {
            ch=true;
        }
        if(Button7.getText()==Button8.getText()&&Button8.getText()==Button9.getText()&&Button7.getText()!=""&&Button8.getText()!=""&&Button9.getText()!="")
        {
            ch=true;
        }
        if(Button1.getText()==Button4.getText()&&Button4.getText()==Button7.getText()&&Button1.getText()!=""&&Button4.getText()!=""&&Button7.getText()!="")
        {
            ch=true;
        }
        if(Button2.getText()==Button5.getText()&&Button5.getText()==Button8.getText()&&Button2.getText()!=""&&Button5.getText()!=""&&Button8.getText()!="")
        {
            ch=true;
        }
        if(Button3.getText()==Button6.getText()&&Button6.getText()==Button9.getText()&&Button3.getText()!=""&&Button6.getText()!=""&&Button9.getText()!="")
        {
            ch=true;
        }
        if(Button3.getText()==Button5.getText()&&Button5.getText()==Button7.getText()&&Button3.getText()!=""&&Button5.getText()!=""&&Button7.getText()!="")
        {
            ch=true;
        }
        if(Button1.getText()==Button5.getText()&&Button5.getText()==Button9.getText()&&Button1.getText()!=""&&Button5.getText()!=""&&Button9.getText()!="")
        {
            ch=true;
        }
        if(Button1.getText()!=""&&Button2.getText()!=""&&Button3.getText()!=""&&Button4.getText()!=""&&Button5.getText()!=""&&Button6.getText()!=""&&Button7.getText()!=""&&Button8.getText()!=""&&Button9.getText()!="") {

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
        if(ch==true)
        {
            AlertDialog.Builder j=new AlertDialog.Builder(Main2Activity.this);
            j.setTitle(Main2Activity.this.getTitle()+" برنده شد"+"\n"+"آیا ادامه می دهید");
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
