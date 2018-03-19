package com.example.dminh.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.num0)
    Button num0;
    @BindView(R.id.num1)
    Button num1;
    @BindView(R.id.num2)
    Button num2;
    @BindView(R.id.num3)
    Button num3;
    @BindView(R.id.num4)
    Button num4;
    @BindView(R.id.num5)
    Button num5;
    @BindView(R.id.num6)
    Button num6;
    @BindView(R.id.num7)
    Button num7;
    @BindView(R.id.num8)
    Button num8;
    @BindView(R.id.num9)
    Button num9;
    @BindView(R.id.display)
    TextView display;
    @BindView(R.id.allclear)
    Button allclear;
    @BindView(R.id.backspace)
    Button backspace;
    @BindView(R.id.devide)
    Button devide;
    @BindView(R.id.minus)
    Button minus;
    @BindView(R.id.multiple)
    Button multiple;
    @BindView(R.id.plus)
    Button plus;
    @BindView(R.id.equal)
    Button equal;
    @BindView(R.id.scrollView2)
    ScrollView scrollView;

    Float so1 = null, so2 = null, so3 = null, ketqua = null;
    String chuoiso = "";
    pheptinh pt = null, pt2 = null;
    @BindView(R.id.openclose)
    Button openclose;
    @BindView(R.id.dot)
    Button dot;
    @BindView(R.id.gridLayout)
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    public void setNum0() {
        display.setText(display.getText() + "" + num0.getText());
        chuoiso = chuoiso + num0.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);

    }

    public void setNum1() {
        display.setText(display.getText() + "" + num1.getText());
        chuoiso = chuoiso + num1.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum2() {
        display.setText(display.getText() + "" + num2.getText());
        chuoiso = chuoiso + num2.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum3() {
        display.setText(display.getText() + "" + num3.getText());
        chuoiso = chuoiso + num3.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum4() {
        display.setText(display.getText() + "" + num4.getText());
        chuoiso = chuoiso + num4.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum5() {
        display.setText(display.getText() + "" + num5.getText());
        chuoiso = chuoiso + num5.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum6() {
        display.setText(display.getText() + "" + num6.getText());
        chuoiso = chuoiso + num6.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum7() {
        display.setText(display.getText() + "" + num7.getText());
        chuoiso = chuoiso + num7.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum8() {
        display.setText(display.getText() + "" + num8.getText());
        chuoiso = chuoiso + num8.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setNum9() {
        display.setText(display.getText() + "" + num9.getText());
        chuoiso = chuoiso + num9.getText();
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setEqual() {
        if (pt2 != null && checkchuoi() == true) {
            try {
                so3 = Float.valueOf(chuoiso);
                tinhtoan(so2, so3, pt2);
                so2 = ketqua;
                ketqua = null;
                chuoiso = "";
                pt2 = null;
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        }
        if (so1 != null && so2 != null) {
            tinhtoan(so1, so2, pt);
            display.setText(display.getText() + "\n= " + String.valueOf(ketqua) + "\n \n");
            clear();
        } else if (so1 != null && so2 == null && chuoiso != "" && checkchuoi() == true) {
            so2 = Float.valueOf(chuoiso);
            tinhtoan(so1, so2, pt);
            display.setText(display.getText() + "\n= " + String.valueOf(ketqua) + "\n \n");
            clear();
        }
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setPlus() {
        if (pt2 != null && checkchuoi() == true) {
            try {
                tinhthutu();
                pt = pheptinh.cong;
                display.setText(display.getText() + "\n+ ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        }
        if (so1 != null && so2 != null && checkchuoi() == true) {
            try {
                tinhtoan(so1, so2, pt);
                so1 = ketqua;
                so2 = null;
                chuoiso = "";
                ketqua = null;
                pt = pheptinh.cong;
                display.setText(display.getText() + "\n+ ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        } else if (so1 != null && so2 == null && checkchuoi() == true) {
            try {
                so2 = Float.valueOf(chuoiso);
                tinhtoan(so1, so2, pt);
                so1 = ketqua;
                so2 = null;
                pt = pheptinh.cong;
                chuoiso = "";
                display.setText(display.getText() + "\n+ ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        } else if (so1 == null && checkchuoi() == true) {

            try {
                so1 = Float.valueOf(chuoiso);
                pt = pheptinh.cong;
                chuoiso = "";
                display.setText(display.getText() + "\n+ ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }

        } else if (chuoiso == "") {
            display.setText(display.getText() + "+ ");
            chuoiso += "+";
            scrollView.fullScroll(ScrollView.FOCUS_DOWN);
        }
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setMinus() {
        if (pt2 != null && checkchuoi() == true) {
            try {
                tinhthutu();
                pt = pheptinh.tru;
                display.setText(display.getText() + "\n- ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        }
        if (so1 != null && so2 != null && checkchuoi() == true) {
            try {
                tinhtoan(so1, so2, pt);
                so1 = ketqua;
                so2 = null;
                chuoiso = "";
                ketqua = null;
                pt = pheptinh.tru;
                display.setText(display.getText() + "\n- ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        } else if (so1 != null && so2 == null && checkchuoi() == true) {
            try {
                so2 = Float.valueOf(chuoiso);
                tinhtoan(so1, so2, pt);
                so1 = ketqua;
                so2 = null;
                pt = pheptinh.tru;
                chuoiso = "";
                display.setText(display.getText() + "\n- ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        } else if (so1 == null && checkchuoi() == true) {

            try {
                so1 = Float.valueOf(chuoiso);
                pt = pheptinh.tru;
                chuoiso = "";
                display.setText(display.getText() + "\n- ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }

        } else if (chuoiso == "") {
            display.setText(display.getText() + "- ");
            chuoiso += "-";
            scrollView.fullScroll(ScrollView.FOCUS_DOWN);
        }
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setMultiple() {

        if (so1 != null && (pt == pheptinh.cong || pt == pheptinh.tru) && checkchuoi() == true) {
            if (so2 == null) {
                try {
                    so2 = Float.valueOf(chuoiso);
                    pt2 = pheptinh.nhan;
                    chuoiso = "";
                    display.setText(display.getText() + "\nx ");
                    scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                } catch (Exception e) {

                }
            } else if (so2 != null) {
                try {
                    so3 = Float.valueOf(chuoiso);
                    tinhtoan(so2, so3, pt2);
                    so3 = null;
                    so2 = ketqua;
                    pt2 = pheptinh.nhan;
                    ketqua = null;
                    chuoiso = "";
                    display.setText(display.getText() + "\nx ");
                    scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                } catch (Exception e) {

                }
            }

        } else if (so1 != null && checkchuoi() == true) {
            try {
                so2 = Float.valueOf(chuoiso);
                tinhtoan(so1, so2, pt);
                so1 = ketqua;
                ketqua = null;
                so2 = null;
                chuoiso = "";
                pt = pheptinh.nhan;
                display.setText(display.getText() + "\nx ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        } else if (so1 == null && checkchuoi() == true) {
            so1 = Float.valueOf(chuoiso);
            pt = pheptinh.nhan;
            chuoiso = "";
            display.setText(display.getText() + "\nx ");
            scrollView.fullScroll(ScrollView.FOCUS_DOWN);
        }
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void setDevide() {
        if (so1 != null && (pt == pheptinh.cong || pt == pheptinh.tru) && checkchuoi() == true) {
            if (so2 == null) {
                try {
                    so2 = Float.valueOf(chuoiso);
                    pt2 = pheptinh.chia;
                    chuoiso = "";
                    display.setText(display.getText() + "\n: ");
                    scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                } catch (Exception e) {

                }
            } else if (so2 != null) {
                try {
                    so3 = Float.valueOf(chuoiso);
                    tinhtoan(so2, so3, pt2);
                    so3 = null;
                    so2 = ketqua;
                    pt2 = pheptinh.chia;
                    chuoiso = "";
                    ketqua = null;
                    display.setText(display.getText() + "\n: ");
                    scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                } catch (Exception e) {

                }
            }

        } else if (so1 != null) {
            try {
                so2 = Float.valueOf(chuoiso);
                tinhtoan(so1, so2, pt);
                so1 = ketqua;
                ketqua = null;
                so2 = null;
                chuoiso = "";
                pt = pheptinh.chia;
                display.setText(display.getText() + "\n: ");
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            } catch (Exception e) {

            }
        } else if (so1 == null && checkchuoi() == true) {
            so1 = Float.valueOf(chuoiso);
            pt = pheptinh.chia;
            chuoiso = "";
            display.setText(display.getText() + "\n: ");
            scrollView.fullScroll(ScrollView.FOCUS_DOWN);
        }
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    @OnClick(R.id.allclear)
    void setAllclear() {
        clear();
        display.setText("");
    }

    public void clear() {
        pt = null;
        so1 = null;
        so2 = null;
        pt2 = null;
        so3 = null;
        ketqua = null;
        chuoiso = "";
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    @OnClick(R.id.backspace)
    void setBackspace() {

    }

    public void tinhtoan(Float a, Float b, pheptinh tt) {
        switch (tt) {
            case cong:
                ketqua = a + b;
                break;
            case tru:
                ketqua = a - b;
                break;
            case nhan:
                ketqua = a * b;
                break;
            case chia:
                ketqua = a / b;
                break;
            default:
                break;

        }
    }

    @OnClick({R.id.num7, R.id.num8, R.id.num4, R.id.num5, R.id.num1, R.id.num2, R.id.num0, R.id.num9, R.id.num6, R.id.num3, R.id.devide, R.id.multiple, R.id.minus, R.id.plus, R.id.equal})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.num7:
                setNum7();
                break;
            case R.id.num8:
                setNum8();
                break;
            case R.id.num4:
                setNum4();
                break;
            case R.id.num5:
                setNum5();
                break;
            case R.id.num1:
                setNum1();
                break;
            case R.id.num2:
                setNum2();
                break;
            case R.id.num0:
                setNum0();
                break;
            case R.id.num9:
                setNum9();
                break;
            case R.id.num6:
                setNum6();
                break;
            case R.id.num3:
                setNum3();
                break;
            case R.id.devide:
                setDevide();
                break;
            case R.id.multiple:
                setMultiple();
                break;
            case R.id.minus:
                setMinus();
                break;
            case R.id.plus:
                setPlus();
                break;
            case R.id.equal:
                setEqual();
                break;
        }
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);

    }

    @OnTextChanged(R.id.display)
    public void onTextChanged() {
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public enum pheptinh {
        cong, tru, nhan, chia;
    }

    public Boolean checkchuoi() {
        boolean ck = false;
        try {
            Float a = Float.valueOf(chuoiso);
            ck = true;
        } catch (Exception e) {
            ck = false;
        }
        if (chuoiso == "") {
            ck = false;
        }
        return ck;
    }

    public void tinhthutu() {
        so3 = Float.valueOf(chuoiso);
        tinhtoan(so2, so3, pt2);
        so2 = ketqua;
        ketqua = null;
        chuoiso = "";
        pt2 = null;
        tinhtoan(so1, so2, pt);
        so1 = ketqua;
        so2 = null;
        ketqua = null;
        chuoiso = "";
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }

}
