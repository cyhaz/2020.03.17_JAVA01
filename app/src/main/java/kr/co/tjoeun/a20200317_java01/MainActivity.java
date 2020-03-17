package kr.co.tjoeun.a20200317_java01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kr.co.tjoeun.a20200317_java01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        입력칸에 입력하고 버튼 누르면 텍스트뷰에 출력
//        +입력버튼 누르면 기존 입력내용 삭제 (""으로 설정)

        binding.inputBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("버튼클릭", "입력 버튼 눌림");

                String input = binding.inputEdt.getText().toString();

                binding.messageTxt.setText(input);
                binding.inputEdt.setText("");

            }
        });

    }
}
