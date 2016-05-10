package kr.hs.emirim.qls6521.yeah;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {
    Chronometer chrono;//크로노를 필드로 선언
    Button butStart,butDone;//버튼객체를 필드로 선언
    RadioButton radioDate, radioTime;
    CalendarView calView;
    TimePicker timePick;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //인플레이션되었다, xml문서의 클래스 이름을 안드로이드 sdk에서 찾아서 주기억장치에 올린다
        chrono=(Chronometer)findViewById(R.id.chrono);//findViewById의 타입은 view인데 chronometer타입으로 반환해줘야지 넣어줄수 있다
        butStart=(Button)findViewById(R.id.but_start);
        butDone=(Button)findViewById(R.id.but_done);
        radioDate=(RadioButton)findViewById(R.id.radio_date);
        radioTime=(RadioButton)findViewById(R.id.radio_time);
        calView=(CalendarView)findViewById(R.id.calendar);
        timePick=(TimePicker)findViewById(R.id.time_pick);
        textResult=(TextView)findViewById(R.id.text_result);
        timePick.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);//매개변수에 정수형의 상수필드를 쓰면 화면에 보이지 않느다

        radioDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.VISIBLE);//보이게
                timePick.setVisibility(View.INVISIBLE);//보이지 않게
            }
        });/*객체생성한참조값*/
        radioTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.INVISIBLE);
                timePick.setVisibility(View.VISIBLE);
            }
        });

    }
}
