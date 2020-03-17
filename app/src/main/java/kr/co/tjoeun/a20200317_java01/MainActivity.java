package kr.co.tjoeun.a20200317_java01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

                Log.d("입력값확인", input);

                binding.messageTxt.setText(input);
                binding.inputEdt.setText("");

            }
        });


//        입력한 비밀번호가 1234 일때 로그인버튼을 누르면
//        토스트로 로그인 성공 출력
//        그 외의 비밀번호로 로그인버튼 누르면
//        토스트로 잘못된 비밀번호입니다 출력

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 입력한 값을 변수로 저장
                String pw = binding.pwEdt.getText().toString();
                // 비밀번호가 1234인가?
                // String을 ==으로 처리하면 에러! equals 활용
                if (pw.equals("1234")) {
                    Toast.makeText(MainActivity.this, "로그인 성공!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "잘못된 비밀번호입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
